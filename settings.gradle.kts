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
module("internal:injector")
module("internal:injector:annotations")
module("internal:updater")
module(":mixins")
module(":gamepack")
module(":logger")
module(":api")

fun module(path: String) {
    val split = path.split(":")
    val moduleName = split.drop(1).joinToString("-") { it }

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