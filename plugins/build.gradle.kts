dependencies {
    implementation(project(":runebox-logger"))
    implementation(project(":runebox-common"))
    implementation(project(":runebox-util"))
    implementation("org.pf4j:pf4j:_")
}

subprojects {
    val subProject = this

    tasks.named<Jar>("jar") {
        archiveBaseName.set(subProject.name)
        archiveVersion.set("")
        archiveClassifier.set("")
    }

    val installPlugin = tasks.register<Copy>("installPlugin") {
        group = "plugin"
        onlyIf { tasks.getByName("jar").didWork }
        doFirst {
            project(":runebox-client").buildDir.resolve("plugins/${subProject.name}.jar").also {
                if(it.exists()) it.delete()
            }
        }
        from(tasks.getByName("jar"))
        into(project(":runebox-client").buildDir.resolve("plugins/"))
    }

    tasks.compileKotlin {
        finalizedBy(installPlugin)
    }
}