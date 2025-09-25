plugins {
    id("java")
    id("maven-publish")
}

group = "ru.alex3koval.eventingContract"
version = "1.6.0"

java {
    withSourcesJar()
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
        }
    }
}
