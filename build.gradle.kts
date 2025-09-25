plugins {
    id("java-library")
    id("maven-publish")
}

group = "ru.alex3koval.eventingContract"
version = "1.6.0"

java {
    withSourcesJar()
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

tasks.getByName<Jar>("jar") {
    enabled = true
}

dependencies {
    implementation(libs.com.fasterxml.jackson.core.jackson.databind)

    compileOnly(libs.org.projectlombok.lombok)
    annotationProcessor(libs.org.projectlombok.lombok)

    implementation(libs.io.projectreactor.reactor.core)
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])

            groupId = "com.github.ALEX3KOVAL"
            artifactId = "eventingContract"
            version = "v1.11.0"
        }
    }

    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/ALEX3KOVAL/eventingContract")

            credentials {
                username = System.getenv("GITHUB_USERNAME")
                password = System.getenv("GITHUB_TOKEN")
            }
        }
    }
}
