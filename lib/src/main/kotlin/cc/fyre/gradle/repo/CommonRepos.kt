package cc.fyre.gradle.repo

import org.gradle.api.artifacts.dsl.RepositoryHandler
import org.gradle.api.artifacts.repositories.MavenArtifactRepository
import org.gradle.kotlin.dsl.maven

fun RepositoryHandler.fyre(lambda: MavenArtifactRepository.() -> Unit = {}) {
    fyreGames(lambda)
    fyreReleases(lambda)
    fyreSnapshots(lambda)
}

fun RepositoryHandler.fyreGames(lambda: MavenArtifactRepository.() -> Unit = {}) {
    maven("https://maven.fyre.cc/games") {
        name = "fyreGames"
        lambda.invoke(this)
    }
}

fun RepositoryHandler.fyreReleases(lambda: MavenArtifactRepository.() -> Unit = {}) {
    maven("https://maven.fyre.cc/releases") {
        name = "fyreReleases"
        lambda.invoke(this)
    }
}

fun RepositoryHandler.fyreSnapshots(lambda: MavenArtifactRepository.() -> Unit = {}) {
    maven("https://maven.fyre.cc/snapshots") {
        name = "fyreSnapshots"
        lambda.invoke(this)
    }
}

fun RepositoryHandler.papermc(lambda: MavenArtifactRepository.() -> Unit = {}) {
    maven("https://repo.papermc.io/repository/maven-public/") {
        lambda.invoke(this)
    }
}

fun RepositoryHandler.spigotmc(lambda: MavenArtifactRepository.() -> Unit = {}) {
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/") {
        lambda.invoke(this)
    }
}