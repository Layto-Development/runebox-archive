plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
    `maven-publish`
    id("com.gradle.plugin-publish") version "1.2.0"
    id("org.ajoberstar.grgit") version "5.2.0"
}

repositories {
    mavenLocal()
    mavenCentral()
    maven(url = "https://jitpack.io")
    maven(url = "https://maven.fabricmc.net/")
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(kotlin("reflect"))
    implementation(gradleApi())
    implementation("net.fabricmc:fabric-fernflower:2.0.0")
}

tasks {
    create("sourcesJar", Jar::class) {
        group = "build"
        archiveClassifier.set("sources")
        from(sourceSets["main"].allSource)
    }
}

val defaultArtifactTasks = arrayOf(
    tasks["sourcesJar"]
)

artifacts {
    defaultArtifactTasks.forEach { archives(it) }
}

gradlePlugin {
    plugins {

    }
}
