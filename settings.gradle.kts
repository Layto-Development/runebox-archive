plugins {
    id("de.fayard.refreshVersions") version "0.51.0"
    id("com.gradle.enterprise") version "3.14.1"
}

rootProject.name = "runebox"

gradleEnterprise {
    buildScan {
        termsOfServiceUrl = "https://gradle.com/terms-of-service"
        termsOfServiceAgree = "yes"
        publishOnFailure()
    }
}

module("internal:deobfuscator")
module(":logger")

fun module(path: String) {
    val split = path.split(":")
    val moduleName = split.lastOrNull() ?: path

    include(moduleName)

    if(split.size > 1) {
        val projectPath = path.replace(":", "/")
        project(":$moduleName").projectDir = file(projectPath)
    }

    project(":$moduleName").name = "runebox-$moduleName"
}

fun gradleModule(path: String) {
    includeBuild(path.replace(":", "/"))
}