dependencies {
    implementation(project(":runebox-injector-annotations"))
    implementation(project(":runebox-api"))
}

tasks.named<Jar>("jar") {
    archiveVersion.set("")
}