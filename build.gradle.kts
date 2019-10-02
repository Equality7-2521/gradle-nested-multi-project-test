plugins {
    base
    kotlin("jvm") apply false
}

allprojects {
    group = "foobarbaz"
    version = "0.1.0-SNAPSHOT"

    repositories {
        jcenter()
    }
}

subprojects {
    apply {
        plugin("kotlin")
    }

    dependencies {
        "implementation"(platform(kotlin("bom")))
        "implementation"(kotlin("stdlib-jdk8"))
    }
}
