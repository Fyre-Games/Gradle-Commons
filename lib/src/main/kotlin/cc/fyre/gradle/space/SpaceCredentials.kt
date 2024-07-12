package cc.fyre.gradle.space

import org.gradle.api.artifacts.repositories.AuthenticationSupported

@Deprecated(message = "Space shutdown.")
fun AuthenticationSupported.spaceCredentials(explicit: Boolean = false) {

    val clientId = System.getenv()["JB_SPACE_CLIENT_ID"]
    val clientSecret = System.getenv()["JB_SPACE_CLIENT_SECRET"]

    if (!explicit && (clientId == null || clientSecret == null)) {
        return
    }

    credentials{
        username = clientId
        password = clientSecret
    }
}