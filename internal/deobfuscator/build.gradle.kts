import org.jetbrains.java.decompiler.main.decompiler.ConsoleDecompiler
import java.io.ByteArrayInputStream
import java.net.URL
import java.util.jar.JarEntry
import java.util.jar.JarFile
import java.util.jar.JarOutputStream
import java.util.zip.ZipInputStream

val decompiled by configurations.creating

plugins {
    java
}

dependencies {
    implementation(project(":runebox-logger"))
    implementation(project(":runebox-util"))
    implementation("org.ow2.asm:asm:_")
    implementation("org.ow2.asm:asm-commons:_")
    implementation("org.ow2.asm:asm-util:_")
    implementation("org.ow2.asm:asm-tree:_")
    implementation("com.google.guava:guava:_")
    implementation("org.jgrapht:jgrapht-core:_")
    implementation("com.github.javaparser:javaparser-core:_")
    runtimeOnly(project(":runebox-deobfuscator-annotations"))
    implementation("org.bouncycastle:bcprov-jdk15on:1.52")
    implementation("org.json:json:20220320")
}

java.sourceSets["main"].java {
    srcDir("build/deob/decomp")
}

tasks {

    create("downloadGamepack") {
        group = "internal"
        doLast { downloadGamepack() }
    }


    create<JavaExec>("deobfuscateBytecode") {
        mainClass.set("io.runebox.internal.deobfuscator.bytecode.BytecodeDeobfuscator")
        workingDir = project.projectDir
        args = listOf("build/deob/gamepack.jar", "build/deob/gamepack.deob.jar", "-t")
        classpath = sourceSets["main"].runtimeClasspath
    }

    create<JavaExec>("deobfuscateAst") {
        mainClass.set("io.runebox.internal.deobfuscator.ast.AstDeobfuscator")
        workingDir = project.projectDir
        args = listOf("build/deob/decomp/", "build/deob/decomp/")
        classpath = sourceSets["main"].runtimeClasspath
    }

    create("decompileDeobGamepack") {
        doLast { decompileGamepack(file("build/deob/gamepack.jar"), file("build/deob/gamepack.deob.jar")) }
    }

    create<Jar>("compileDecompiledDeobSources") {
        dependsOn(compileJava.get())
        doFirst {
            if(file("build/deob/gamepack.deob.jar").exists()) {
                file("build/deob/gamepack.deob.jar").delete()
            }
        }
        archiveBaseName.set("gamepack.deob")
        archiveVersion.set("")
        archiveClassifier.set("")
        destinationDirectory.set(file("build/deob/"))
        duplicatesStrategy = DuplicatesStrategy.EXCLUDE
        from(file("build/classes/java/main/"))
    }

    register("deobfuscateGamepack") {
        dependsOn(build)
        group = "internal"
        finalizedBy("deobfuscateBytecode")
        finalizedBy("decompileDeobGamepack")
        finalizedBy("deobfuscateAst")
    }
}

fun downloadGamepack() {
    println("Downloading latest gamepack.jar...")

    val url = URL("http://oldschool1.runescape.com/gamepack.jar")
    val file = file("build/deob/gamepack.jar")

    if(file.exists()) file.delete()
    file.parentFile.mkdirs()
    file.createNewFile()

    val tempJar = file(file.absolutePath+".tmp")
    tempJar.createNewFile()
    tempJar.writeBytes(url.readBytes())

    JarOutputStream(file.outputStream()).use { jos ->
        JarFile(tempJar).use { jar ->
            jar.entries().asSequence().forEach { entry ->
                if(entry.name.endsWith(".class")) {
                    val bytes = jar.getInputStream(entry).readAllBytes()
                    jos.putNextEntry(JarEntry(entry.name))
                    jos.write(bytes)
                    jos.closeEntry()
                }
            }
        }
    }

    tempJar.deleteRecursively()

    println("Completed download of vanilla gamepack.jar.")
}

fun decompileGamepack(inputFile: File, outputFile: File) {
    println("Decompiling deob gamepack.")

    val inputFile = file("build/deob/gamepack.deob.jar")
    val outputDir = file("build/deob/decomp/")
    val outputFile = outputDir.resolve("gamepack.deob.jar")

    if(outputDir.exists()) {
        outputDir.deleteRecursively()
    }
    outputDir.mkdirs()

    ConsoleDecompiler.main(arrayOf("-asc=1", "-dgs=1", inputFile.absolutePath, outputDir.absolutePath))

    println("Extracting classes from output jar.")

    JarFile(outputFile).use { jar ->
        jar.entries().asSequence().forEach { entry ->
            jar.getInputStream(entry).use { input ->
                val f = outputDir.resolve(entry.name)
                f.parentFile.mkdirs()
                f.createNewFile()
                f.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
        }
    }
    outputFile.delete()

    println("Completed decompiling deob gamepack.")
}