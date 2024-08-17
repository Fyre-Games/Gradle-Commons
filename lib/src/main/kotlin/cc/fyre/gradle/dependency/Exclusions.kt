package cc.fyre.gradle.dependency

import org.gradle.api.artifacts.ModuleDependency
import org.gradle.kotlin.dsl.exclude

fun ModuleDependency.withoutKotlin(): ModuleDependency =
    this.exclude("org.jetbrains.kotlin")
        .exclude("org.jetbrains.kotlinx")

fun ModuleDependency.excludeJackson() {
    exclude("com.fasterxml.jackson.core")
}

fun ModuleDependency.excludeKtorClient() {
    exclude("io.ktor")
    exclude("io.ktor.client")
}

fun ModuleDependency.excludeMongo() {
    exclude("org.bson")
    exclude("org.reactivestreams")
    exclude("com.mongodb")
}