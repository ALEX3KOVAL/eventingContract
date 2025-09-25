plugins {
    id("java")
    id("maven-publish")
}

allprojects {
    group = "com.github.ALEX3KOVAL"
    version = "1.5.0"
}

subprojects {
    apply(plugin = "java")

    repositories {
        mavenCentral()
    }
}

project(":lib") {
    apply(plugin = "maven-publish")

    publishing {
        publications {
            create<MavenPublication>("mavenJava") {
                from(components["java"])
            }
        }
    }
}