val injectorOnly by configurations.creating

configurations.implementation {
    extendsFrom(injectorOnly)
    isCanBeResolved = true
    isCanBeConsumed = false
}

dependencies {
    injectorOnly(project(":runebox-api"))
    injectorOnly(project(":runebox-injector-annotations"))
    injectorOnly(project(":runebox-mixins"))
    injectorOnly(project(":runebox-gamepack"))

    implementation(project(":runebox-logger"))
    api(project(":runebox-injector-annotations"))

    api("org.ow2.asm:asm:_")
    api("org.ow2.asm:asm-commons:_")
    api("org.ow2.asm:asm-util:_")
    api("org.ow2.asm:asm-tree:_")
    implementation("com.google.guava:guava:_")
}

tasks {
    create<JavaExec>("injectGamepack") {
        onlyIf { listOf(
                project(":runebox-api"),
                project(":runebox-injector-annotations"),
                project(":runebox-mixins"),
                project(":runebox-gamepack")
            ).any { it.tasks.getByName("jar").didWork } }

        group = "internal"
        mainClass.set("io.runebox.internal.injector.Injector")
        workingDir = project.projectDir
        classpath = sourceSets["main"].runtimeClasspath
        args = listOf(
            project(":runebox-mixins").buildDir.resolve("libs/runebox-mixins.jar").absolutePath,
            project(":runebox-gamepack").buildDir.resolve("libs/runebox-gamepack.jar").absolutePath,
            project(":runebox-gamepack").buildDir.resolve("libs/runebox-gamepack.injected.jar").absolutePath
        )
    }
}