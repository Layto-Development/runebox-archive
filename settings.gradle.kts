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
module("internal:deobfuscator:annotations")
module("internal:injector")
module("internal:injector:annotations")
module("internal:updater")
module(":mixins")
module(":gamepack")
module(":logger")
module(":api")
module("client")
module(":util")
module(":common")
module(":eventbus")

fun module(path: String) {
    val split = path.split(":")
    val moduleName = if(split.size > 1) split.drop(1).joinToString("-") { it } else path

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