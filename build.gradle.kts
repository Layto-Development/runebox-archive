import de.fayard.refreshVersions.core.versionFor

plugins {
    kotlin("jvm")
}

tasks.wrapper {
    gradleVersion = versionFor("version.gradle")
}

allprojects {
    group = "io.runebox"
    version = "0.0.1"

    repositories {
        mavenLocal()
        mavenCentral()
        maven(url = "https://jitpack.io")
        maven(url = "https://maven.fabricmc.net")
    }
}

allprojects {
    apply(plugin = "java")

    if(project.name !in listOf(
        "runebox-gamepack",
        "runebox-gamepack-api",
        "runebox-injector-annotations",
        "runebox-mixins"
    )) {
        dependencies {
            implementation(kotlin("stdlib"))
            implementation(kotlin("reflect"))

            testImplementation(kotlin("test"))
            testImplementation("com.willowtreeapps.assertk:assertk:_")
        }

        tasks.test {
            useJUnitPlatform()
        }
    }

    java {
        toolchain {
            vendor.set(JvmVendorSpec.ADOPTIUM)
            languageVersion.set(JavaLanguageVersion.of(11))
        }
    }
}