dependencies {
    implementation("org.bouncycastle:bcprov-jdk15on:1.52")
    implementation("org.json:json:20220320")
}

tasks.named<Jar>("jar") {
    archiveVersion.set("")
}