import java.net.URI

plugins {
    `maven-publish`
    `java-gradle-plugin`
    id("org.gradle.kotlin.kotlin-dsl") version "4.5.0"
    id("net.linguica.maven-settings") version "0.5"
    kotlin("jvm") version "1.9.0"
}

group = "cc.fyre.gradle"

repositories {
    mavenCentral()
}

dependencies {

    implementation(gradleApi())

    compileOnly("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    compileOnly(platform("org.jetbrains.kotlin:kotlin-bom"))

    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}

publishing {

    repositories {

        maven("https://maven.fyre.cc/releases") {
            name = "fyreReleases"
        }

    }

}

gradlePlugin {
    plugins {
        create("commons") {
            id = "cc.fyre.gradle.commons"
            implementationClass = "cc.fyre.gradle.CommonsPlugin"
        }
    }
}