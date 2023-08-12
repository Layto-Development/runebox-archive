plugins {
    kotlin("jvm")
    java
}

dependencies {
    api("org.ow2.asm:asm:_")
    api("org.ow2.asm:asm-commons:_")
    api("org.ow2.asm:asm-util:_")
    api("org.ow2.asm:asm-tree:_")
    api("com.google.guava:guava:_")
    implementation("info.leadinglight:jdot:_")
}