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
    maven("https://maven.fyre.services/games") {
        name = "fyreGames"
        lambda.invoke(this)
    }
}

fun RepositoryHandler.fyreReleases(lambda: MavenArtifactRepository.() -> Unit = {}) {
    maven("https://maven.fyre.services/releases") {
        name = "fyreReleases"
        lambda.invoke(this)
    }
}

fun RepositoryHandler.fyreSnapshots(lambda: MavenArtifactRepository.() -> Unit = {}) {
    maven("https://maven.fyre.services/snapshots") {
        name = "fyreSnapshots"
        lambda.invoke(this)
    }
}

fun RepositoryHandler.papermc(lambda: MavenArtifactRepository.() -> Unit = {}) {
    maven("https://repo.papermc.io/repository/maven-public/",action = lambda)
}

fun RepositoryHandler.spigotmc(lambda: MavenArtifactRepository.() -> Unit = {}) {
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/",action = lambda)
}

fun RepositoryHandler.dmulloy(lambda: MavenArtifactRepository.() -> Unit = {}) {
    maven("https://repo.dmulloy2.net/repository/public/",action = lambda)
}

fun RepositoryHandler.sonatype(lambda: MavenArtifactRepository.() -> Unit = {}) {
    sonatypeCentral(lambda)
    sonatypeSnapshots(lambda)
}

fun RepositoryHandler.sonatypeCentral(lambda: MavenArtifactRepository.() -> Unit = {}) {
    maven(url = "https://oss.sonatype.org/content/repositories/central",action = lambda) 
}

fun RepositoryHandler.sonatypeSnapshots(lambda: MavenArtifactRepository.() -> Unit = {}) {
    maven(url = "https://oss.sonatype.org/content/repositories/snapshots",action = lambda)
}

fun RepositoryHandler.reposilite(lambda: MavenArtifactRepository.() -> Unit = {}) {
    reposiliteReleases(lambda)
    reposiliteSnapshots(lambda)
    reposiliteMavenCentral(lambda)
}

fun RepositoryHandler.reposiliteReleases(lambda: MavenArtifactRepository.() -> Unit = {}) {
    maven(url = "https://maven.reposilite.com/releases",action = lambda)
}

fun RepositoryHandler.reposiliteSnapshots(lambda: MavenArtifactRepository.() -> Unit = {}) {
    maven(url = "https://maven.reposilite.com/snapshots",action = lambda)
}

fun RepositoryHandler.reposiliteMavenCentral(lambda: MavenArtifactRepository.() -> Unit = {}) {
    maven(url = "https://maven.reposilite.com/maven-central",action = lambda)
}