package CordappExamplePersonalGithub.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.vcs.GitVcsRoot

object CordappExamplePersonalGithub_HttpsGithubComRagmondoCordappExampleGitRefsHeadsRel : GitVcsRoot({
    uuid = "8efd75b6-7394-4561-bc68-7adb42525e39"
    id = "CordappExamplePersonalGithub_HttpsGithubComRagmondoCordappExampleGitRefsHeadsRel"
    name = "https://github.com/ragmondo/cordapp-example.git#refs/heads/release-V3"
    url = "https://github.com/ragmondo/cordapp-example.git"
    branch = "refs/heads/release-V3"
})
