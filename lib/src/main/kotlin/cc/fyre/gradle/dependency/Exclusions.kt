package cc.fyre.gradle.dependency

import org.gradle.api.artifacts.ModuleDependency
import org.gradle.kotlin.dsl.exclude

fun ModuleDependency.withoutKotlin(): ModuleDependency =
    this.exclude("org.jetbrains.kotlin")
        .exclude("org.jetbrains.kotlinx")
