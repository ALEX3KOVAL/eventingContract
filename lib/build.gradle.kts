plugins {
    id("java-library")
    id("maven-publish")
}

version = "1.4.0"
group = "com.github.ALEX3KOVAL"

repositories {
    mavenCentral()
}

java {
    withSourcesJar()
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
        }
    }
}

dependencies {
    implementation(libs.com.fasterxml.jackson.core.jackson.databind)

    compileOnly(libs.org.projectlombok.lombok)
    annotationProcessor(libs.org.projectlombok.lombok)

    implementation(libs.io.projectreactor.reactor.core)
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}
