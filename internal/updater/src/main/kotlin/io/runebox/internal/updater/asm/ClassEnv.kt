package io.runebox.internal.updater.asm

import io.runebox.internal.updater.Updater
import org.tinylog.kotlin.Logger
import java.io.File

class ClassEnv(val updater: Updater) {

    val poolA = ClassPool(this, false)
    val poolB = ClassPool(this, false)
    val sharedPool = ClassPool(this, true)

    fun init(jarA: File, jarB: File) {
        poolA.loadJar(jarA)
        poolB.loadJar(jarB)

        poolA.init()
        poolB.init()
    }

}