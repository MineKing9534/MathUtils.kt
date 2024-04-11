import java.io.ByteArrayOutputStream

plugins {
    kotlin("jvm") version "1.9.23"
    `maven-publish`
}

group = "de.mineking"
version = "1.0.1"

var commit = extractCommit()
var release = System.getenv("RELEASE") == "true"

repositories {
    mavenCentral()
    maven { url = uri("https://maven.mineking.dev/releases") }
}

dependencies {
    implementation("de.mineking:MathUtils:1.0.1")

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}

publishing {
    repositories {
        maven {
            url = uri("https://maven.mineking.dev/" + (if(release) "releases" else "snapshots"))

            credentials {
                username = System.getenv("MAVEN_USERNAME")
                password = System.getenv("MAVEN_SECRET")
            }
        }
    }

    publications {
        create<MavenPublication>("maven") {
            groupId = "de.mineking"
            artifactId = "MathUtils.kt"
            version = if (release) this.version else commit

            from(components["java"])
        }
    }
}


fun extractCommit(): String {
    val os = ByteArrayOutputStream()
    project.exec {
        commandLine = "git rev-parse --verify --short HEAD".split(" ")
        standardOutput = os
    }
    return String(os.toByteArray()).trim()
}
