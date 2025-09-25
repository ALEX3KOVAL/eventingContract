plugins {
    id("java-library")
    id("maven-publish")
}

group = "alex3koval"
version = "1.13.2"

java {
    withSourcesJar()
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

repositories {
    mavenCentral()
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

            groupId = "alex3koval"
            artifactId = "eventing-contract"
            version = "1.13.2"
        }
    }

    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/ALEX3KOVAL/eventingContract")

            credentials {
                username = "ALEX3KOVAL"
                password = "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"
            }
        }
    }
}
