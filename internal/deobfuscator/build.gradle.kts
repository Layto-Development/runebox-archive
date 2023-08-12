import java.net.URL

plugins {
    kotlin("jvm")
    java
}

dependencies {
    implementation(project(":runebox-asm"))
    implementation(project(":runebox-logger"))
    implementation("com.github.ajalt.clikt:clikt:_")
}

tasks {
    create("downloadGamepack") {
        group = "internal"
        doLast { downloadGamepack() }
    }

    create<JavaExec>("deobfuscateGamepack") {
        dependsOn(compileKotlin.get())
        group = "internal"
        mainClass.set("io.runebox.internal.deobfuscator.DeobfuscatorKt")
        workingDir = project.projectDir
        args = listOf("gamepack.jar", "gamepack.deob.jar", "--test", "--dependencies")
        classpath = sourceSets["main"].runtimeClasspath
    }
}

fun downloadGamepack() {
    println("Downloading latest gamepack.jar...")

    val url = URL("http://oldschool1.runescape.com/gamepack.jar")
    val file = file("gamepack.jar")

    if(file.exists()) file.delete()
    file.createNewFile()

    file.writeBytes(url.readBytes())

    println("Completed download of gamepack.jar.")
}