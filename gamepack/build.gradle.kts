plugins {
    kotlin("jvm")
}

dependencies {
    implementation(project(":runebox-deobfuscator-includes"))
    implementation("org.bouncycastle:bcprov-jdk15on:1.52")
    implementation("org.json:json:20220320")
    implementation("com.google.guava:guava:_")
    testImplementation(kotlin("stdlib"))
    testImplementation(kotlin("reflect"))
    testImplementation(kotlin("test"))
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