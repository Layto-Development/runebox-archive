dependencies {
    implementation(project(":runebox-logger"))
    implementation("org.ow2.asm:asm:_")
    implementation("org.ow2.asm:asm-commons:_")
    implementation("org.ow2.asm:asm-util:_")
    implementation("org.ow2.asm:asm-tree:_")
    implementation("me.tongfei:progressbar:_")
}

tasks {

    val updateGamepack by register<JavaExec>("updateGamepack") {
        dependsOn(":runebox-gamepack:build")
        group = "internal"
        mainClass.set("io.runebox.internal.updater.Updater")
        classpath = sourceSets["main"].runtimeClasspath
        args = listOf(
            project(":runebox-gamepack").buildDir.resolve("libs/runebox-gamepack.jar").absolutePath,
            project(":runebox-deobfuscator").buildDir.resolve("deob/gamepack.deob.jar").absolutePath,
            project.buildDir.resolve("libs/gamepack.updated.jar").absolutePath
        )
    }
}