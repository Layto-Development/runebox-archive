package io.runebox.internal.asm

import io.runebox.internal.asm.tree.ClassPool
import org.junit.jupiter.api.Test
import org.objectweb.asm.tree.ClassNode
import kotlin.test.assertFalse
import kotlin.test.assertTrue


class ClassPoolTest {

    @Test
    fun testAddClass() {
        val classPool = ClassPool()
        val classNode = ClassNode()
        classNode.name = "TestClass"
        assertTrue(classPool.addClass(classNode))
        assertFalse(classPool.addClass(classNode)) // Adding the same class again should return false
    }

    @Test
    fun testRemoveClass() {
        val classPool = ClassPool()
        val classNode = ClassNode()
        classNode.name = "TestClass"
        classPool.addClass(classNode)
        assertTrue(classPool.removeClass(classNode))
        assertFalse(classPool.removeClass(classNode)) // Removing the same class again should return false
    }
}