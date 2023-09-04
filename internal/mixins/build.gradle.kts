dependencies {
    implementation(project(":runebox-injector-annotations"))
    implementation(project(":runebox-gamepack-api"))
}

tasks {
    named<Jar>("jar") {
        archiveVersion.set("")
    }
}