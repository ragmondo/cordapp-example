package CordappExample.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.vcs.GitVcsRoot

object CordappExample_HttpsGithubComRagmondoCordappExampleGitRefsHeadsReleaseV3 : GitVcsRoot({
    uuid = "d42f650e-33f2-4617-9595-f74692275962"
    id = "CordappExample_HttpsGithubComRagmondoCordappExampleGitRefsHeadsReleaseV3"
    name = "https://github.com/ragmondo/cordapp-example.git#refs/heads/release-V3"
    url = "https://github.com/ragmondo/cordapp-example.git"
    branch = "refs/heads/release-V3"
    authMethod = password {
        userName = "ragmondo"
        password = "credentialsJSON:db562bdb-12be-4407-96b3-7c3e761209d4"
    }
})
