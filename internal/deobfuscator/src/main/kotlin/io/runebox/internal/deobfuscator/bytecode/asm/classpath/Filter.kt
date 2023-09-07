package io.runebox.internal.deobfuscator.bytecode.asm.classpath

import io.runebox.internal.deobfuscator.bytecode.asm.ClassNameUtil
import io.runebox.internal.deobfuscator.bytecode.asm.hasCode
import org.objectweb.asm.tree.MethodNode

interface ClassFilter {
    fun matches(name: String): Boolean
}

interface MemberFilter {
    fun matches(owner: String, name: String, desc: String): Boolean

    fun matches(member: MemberRef): Boolean {
        return matches(member.owner, member.name, member.desc)
    }
}

class UnionClassFilter(vararg filters: ClassFilter) : ClassFilter {
    private val filters = filters.toList()

    override fun matches(name: String): Boolean {
        return filters.any { it.matches(name) }
    }
}


class UnionMemberFilter(vararg filters: MemberFilter) : MemberFilter {
    private val filters = filters.toList()

    override fun matches(owner: String, name: String, desc: String): Boolean {
        return filters.any { it.matches(owner, name, desc) }
    }
}

class ReflectedConstructorFilter private constructor(private val classes: Set<String>) : MemberFilter {
    override fun matches(owner: String, name: String, desc: String): Boolean {
        return classes.contains(owner) && name == "<init>"
    }

    companion object {

        fun create(classPath: ClassPath): MemberFilter {
            val classes = mutableSetOf<String>()

            for (clazz in classPath.pool.classes) {
                for (method in clazz.methods) {
                    processMethod(classPath, method, classes)
                }
            }

            return ReflectedConstructorFilter(classes)
        }

        private fun processMethod(classPath: ClassPath, method: MethodNode, classes: MutableSet<String>) {
            if (!method.hasCode) {
                return
            }

            for (name in ClassNameUtil.findClassNames(method)) {
                val clazz = classPath[name]
                if (clazz != null && !clazz.isDependency) {
                    classes.add(name)
                }
            }
        }
    }
}

class GlobMemberFilter(@Suppress("CanBeParameter") private val patterns: List<MemberRef>) : MemberFilter {
    private data class CompiledPattern(val owner: Regex, val name: Regex, val desc: Regex)

    private val compiledPatterns = patterns.map(Companion::compile).toList()

    override fun matches(owner: String, name: String, desc: String): Boolean {
        return compiledPatterns.any { it.owner.matches(owner) && it.name.matches(name) && it.desc.matches(desc) }
    }

    private companion object {
        private fun compile(member: MemberRef): CompiledPattern {
            return CompiledPattern(
                Glob.compileClass(member.owner),
                Glob.compile(member.name),
                Glob.compile(member.desc)
            )
        }
    }
}

object Glob {
    fun compile(pattern: String): Regex {
        return compile(pattern, className = false)
    }

    fun compileClass(pattern: String): Regex {
        return compile(pattern, className = true)
    }

    private fun compile(pattern: String, className: Boolean): Regex {
        val regex = StringBuilder()
        var star = false

        for (ch in pattern) {
            if (star) {
                star = false

                if (ch == '*') {
                    regex.append(".*")
                    continue
                }
            }

            when (ch) {
                '*' -> if (className) {
                    star = true
                } else {
                    regex.append(".*")
                }

                else -> regex.append(Regex.escape(ch.toString()))
            }
        }

        if (star) {
            regex.append(".*")
        }

        return Regex(regex.toString())
    }
}
