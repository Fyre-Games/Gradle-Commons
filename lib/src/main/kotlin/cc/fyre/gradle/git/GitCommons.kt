package cc.fyre.gradle.git

import org.gradle.api.Project
import java.io.ByteArrayOutputStream

fun Project.getGitHash():String {

    val output = ByteArrayOutputStream()

    exec {
        standardOutput = output // Only the std, not errors as it's not to worry about as long as it's a repo
        commandLine = listOf("git", "rev-parse", "--short", "HEAD")
    }

    return output.toString().trim()
}
