plugins {
    java
}

dependencies {
    implementation(project(":runebox-api"))
    implementation(project(":runebox-common"))
    implementation(project(":runebox-util"))
    implementation(project(":runebox-logger"))
    runtimeOnly("org.bouncycastle:bcprov-jdk15on:1.52")
    runtimeOnly("org.json:json:20220320")
}

tasks {
    val shadowJar = create<Jar>("shadowJar") {
        group = "build"
        archiveClassifier.set("shaded")
        duplicatesStrategy = DuplicatesStrategy.EXCLUDE
        manifest {
            attributes["Main-Class"] = "io.runebox.client.RuneBox"
        }
        from(configurations.runtimeClasspath.get().map {
            if(it.isDirectory) it
            else zipTree(it)
        })
        with(jar.get())
    }

    create<JavaExec>("run") {
        group = "application"
        mainClass.set("io.runebox.client.RuneBox")
        workingDir = project.projectDir
        classpath = sourceSets["main"].runtimeClasspath
    }

    build {
        finalizedBy(shadowJar)
    }

    processResources {
        dependsOn(":runebox-injector:injectGamepack")
        from("${project(":runebox-gamepack").buildDir}/libs/runebox-gamepack.injected.jar")
    }
}