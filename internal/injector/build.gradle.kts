plugins {
    kotlin("jvm")
}

dependencies {
    implementation(project(":runebox-logger"))
    implementation(project(":runebox-injector-annotations"))
    implementation("org.ow2.asm:asm:_")
    implementation("org.ow2.asm:asm-commons:_")
    implementation("org.ow2.asm:asm-util:_")
    implementation("org.ow2.asm:asm-tree:_")
    implementation("com.google.guava:guava:_")
}

tasks {
    create<JavaExec>("injectGamepack") {
        group = "internal"
        dependsOn(compileKotlin.get())
        dependsOn(project(":runebox-mixins").tasks.compileJava.get())
        mainClass.set("io.runebox.internal.injector.Injector")
        workingDir = project.projectDir
        classpath = sourceSets["main"].runtimeClasspath
        args = listOf(
            project(":runebox-gamepack").buildDir.resolve("libs/runebox-gamepack.jar").absolutePath,
            project(":runebox-mixins").buildDir.resolve("libs/runebox-mixins.jar").absolutePath,
            project.buildDir.resolve("libs/runebox-gamepack.injected.jar").absolutePath
        )
    }
}