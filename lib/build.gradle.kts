plugins {
    id("java-library")
}

version = "1.5.0"
group = "com.github.ALEX3KOVAL"

repositories {
    mavenCentral()
}

java {
    withSourcesJar()
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
