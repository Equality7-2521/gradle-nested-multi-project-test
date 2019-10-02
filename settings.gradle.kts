rootProject.name = "foobarbaz"

pluginManagement {
    plugins {
        kotlin("jvm") version "1.3.50"
    }
}

include(":server")
include(":service:one:impl")
include(":service:two:impl")
