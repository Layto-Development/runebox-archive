plugins {
    java
}

dependencies {
    implementation(project(":runebox-deobfuscator-annotations"))
    implementation("org.bouncycastle:bcprov-jdk15on:1.52")
    implementation("org.json:json:20220320")
}

tasks.test {
    useJUnitPlatform()
}

tasks.named<Jar>("jar") {
    archiveVersion.set("")
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
    from(configurations.runtimeClasspath.get().map {
        if(it.isDirectory) it
        else zipTree(it)
    })
}