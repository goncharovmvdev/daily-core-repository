plugins {
    kotlin("jvm") version "2.1.10"
    `maven-publish`
}
repositories {
    mavenCentral()
}
kotlin {
    jvmToolchain(21)
}
tasks.wrapper {
    gradleVersion = "8.10"
}
publishing {
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/goncharovmvdev/daily-core-repository")
            credentials {
                username = project.findProperty("gpr.user") as String?
                    ?: System.getenv("USERNAME")
                password = project.findProperty("gpr.key") as String?
                    ?: System.getenv("TOKEN")
            }
        }
    }
    publications {
        register<MavenPublication>("gpr") {
            from(components["java"])
        }
    }
}
