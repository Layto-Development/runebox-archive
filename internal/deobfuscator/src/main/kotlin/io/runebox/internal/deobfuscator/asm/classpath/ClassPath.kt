package io.runebox.internal.deobfuscator.asm.classpath

import io.runebox.internal.deobfuscator.asm.ClassPool
import io.runebox.util.DisjointSet
import io.runebox.util.ForestDisjointSet
import org.objectweb.asm.Opcodes.ACC_STATIC
import org.objectweb.asm.commons.Remapper

class ClassPath(
    val classLoader: ClassLoader,
    val pool: ClassPool
) {

    private val cache = mutableMapOf<String, ClassInfo?>()

    private inline fun computeIfAbsent(name: String, block: (String) -> ClassInfo?): ClassInfo? {
        if(cache.containsKey(name)) {
            return cache[name]
        }

        val clazz = block(name)
        cache[name] = clazz

        return clazz
    }

    operator fun get(name: String): ClassInfo? = computeIfAbsent(name) {
        val cls = pool.getClass(name)
        if(cls != null) {
            return@computeIfAbsent AsmClassInfo(this, cls, false)
        }

        val reflectCls = try {
            classLoader.loadClass(name.replace("/", "."))
        } catch (e: ClassNotFoundException) {
            return@computeIfAbsent null
        }

        return@computeIfAbsent ReflectionClassInfo(this, reflectCls)
    }

    fun getClassInfo(name: String) = this[name]
    fun getClassNode(name: String) = pool.getClass(name)

    fun remap(remapper: Remapper) {
        pool.remap(remapper)
        cache.clear()
    }

    fun createHierarchyMethodSets(): DisjointSet<MemberRef> = createHierarchyMemberSets(ClassInfo::methods, ClassInfo::methodModifiers, fields = false)
    fun createHierarchyFieldSets(): DisjointSet<MemberRef> = createHierarchyMemberSets(ClassInfo::fields, ClassInfo::fieldModifiers, fields = true)

    private fun createHierarchyMemberSets(
        getMembers: (ClassInfo) -> List<MemberDesc>,
        getMemberModifiers: (ClassInfo, MemberDesc) -> Int?,
        fields: Boolean
    ): DisjointSet<MemberRef> {
        val disjointSet = ForestDisjointSet<MemberRef>()
        val ancestorCache = mutableMapOf<ClassInfo, Set<MemberDesc>>()

        pool.allClasses.forEach { cls ->
            getHierarchyMemberSets(
                getMembers,
                getMemberModifiers,
                fields,
                ancestorCache,
                disjointSet,
                get(cls.name)!!
            )
        }

        return disjointSet
    }

    private fun getHierarchyMemberSets(
        getMembers: (ClassInfo) -> List<MemberDesc>,
        getMemberModifiers: (ClassInfo, MemberDesc) -> Int?,
        fields: Boolean,
        ancestorCache: MutableMap<ClassInfo, Set<MemberDesc>>,
        disjointSet: DisjointSet<MemberRef>,
        cls: ClassInfo
    ): Set<MemberDesc> {
        var ancestors = ancestorCache[cls]
        if(ancestors != null) {
            return ancestors
        }

        ancestors = mutableSetOf()
        for(ancestorCls in cls.ancestorClasses) {
            val members = getHierarchyMemberSets(getMembers, getMemberModifiers, fields, ancestorCache, disjointSet, ancestorCls)

            for(member in members) {
                val modifiers = getMemberModifiers(cls, member)

                if(modifiers != null && (modifiers and ACC_STATIC) != 0 || member.name == "<init>" || fields) {
                    continue
                }

                val ancestorSet1 = disjointSet.add(MemberRef(cls.name, member))
                val ancestorSet2 = disjointSet.add(MemberRef(ancestorCls.name, member))
                disjointSet.union(ancestorSet1, ancestorSet2)

                ancestors.add(member)
            }
        }

        for(member in getMembers(cls)) {
            disjointSet.add(MemberRef(cls.name, member))
            ancestors.add(member)
        }

        ancestorCache[cls] = ancestors
        return ancestors
    }
}