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
    }
}

allprojects {
    apply(plugin = "java")

    dependencies {
        implementation(kotlin("stdlib"))
        implementation(kotlin("reflect"))

        testImplementation(kotlin("test"))
        testImplementation("com.willowtreeapps.assertk:assertk:_")
    }

    tasks.test {
        useJUnitPlatform()
    }

    java {
        toolchain {
            vendor.set(JvmVendorSpec.ADOPTIUM)
            languageVersion.set(JavaLanguageVersion.of(17))
        }
    }
}