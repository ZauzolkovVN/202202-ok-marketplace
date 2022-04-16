rootProject.name = "ok-202202-marketplace"

pluginManagement {
    plugins {
        val kotlinVersion: String by settings
        val kotestVersion: String by settings

        kotlin("jvm") version kotlinVersion apply false
        kotlin("multiplatfrom") version kotlinVersion apply false
        id("io.kotest.multiplatform") version kotestVersion apply false
    }
}

include("m1l1-hello-world")
include("m1l4-dsl")
include("m1l5-coroutines")
include("m1l7-multiplatform")
include("m2l2-testing")
