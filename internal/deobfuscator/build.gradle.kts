import java.net.URL

plugins {
    kotlin("jvm")
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

    create<JavaExec>("deobfuscateGamepack") {
        dependsOn(compileKotlin.get())
        group = "internal"
        mainClass.set("io.runebox.internal.deobfuscator.Deobfuscator")
        workingDir = project.projectDir
        args = listOf("gamepack.jar", "gamepack.deob.jar", "-t")
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