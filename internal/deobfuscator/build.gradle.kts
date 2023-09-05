import org.jetbrains.java.decompiler.main.decompiler.ConsoleDecompiler
import java.net.URL
import java.util.jar.JarFile

plugins {
    java
}

dependencies {
    implementation(project(":runebox-logger"))
    implementation("org.ow2.asm:asm:_")
    implementation("org.ow2.asm:asm-commons:_")
    implementation("org.ow2.asm:asm-util:_")
    implementation("org.ow2.asm:asm-tree:_")
    implementation("com.google.guava:guava:_")
    runtimeOnly("org.bouncycastle:bcprov-jdk15on:1.52")
    runtimeOnly("org.json:json:20220320")
}

tasks {
    create("downloadGamepack") {
        group = "internal"
        doLast { downloadGamepack() }
    }

    create("decompileDeobGamepack") {
        group = "internal"
        doLast { decompileGamepack() }
    }

    create<JavaExec>("deobfuscateGamepack") {
        dependsOn(build.get())
        group = "internal"
        mainClass.set("io.runebox.internal.deobfuscator.Deobfuscator")
        workingDir = project.projectDir
        args = listOf("build/deob/gamepack.jar", "build/deob/gamepack.deob.jar", "-t")
        classpath = sourceSets["main"].runtimeClasspath
    }
}

fun downloadGamepack() {
    println("Downloading latest gamepack.jar...")

    val url = URL("http://oldschool1.runescape.com/gamepack.jar")
    val file = file("build/deob/gamepack.jar")

    if(file.exists()) file.delete()
    file.parentFile.mkdirs()
    file.createNewFile()

    file.writeBytes(url.readBytes())

    println("Completed download of gamepack.jar.")
}

fun decompileGamepack() {
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