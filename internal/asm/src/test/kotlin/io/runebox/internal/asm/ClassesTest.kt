package io.runebox.internal.asm

import io.runebox.internal.asm.tree.ClassPool
import io.runebox.internal.asm.tree.fromByteArray
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.objectweb.asm.tree.ClassNode
import kotlin.test.assertTrue

class ClassesTest {

    lateinit var pool: ClassPool

    @BeforeEach
    fun setup() {
        pool = ClassPool()
        arrayOf(
            "TestClass1",
            "TestClass2",
            "TestClass3"
        ).forEach {
            val bytes = ClassesTest::class.java.classLoader.getResourceAsStream("io/runebox/internal/asm/$it.class")!!.readAllBytes()
            val cls = ClassNode().fromByteArray(bytes)
            pool.addClass(cls)
        }
        pool.init()
    }

    @Test
    fun test() {
        assertTrue { pool.classes.isNotEmpty() }
    }
}