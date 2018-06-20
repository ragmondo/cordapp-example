package CordappExamplePersonalGithub.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.gradle
import jetbrains.buildServer.configs.kotlin.v2017_2.triggers.vcs

object CordappExamplePersonalGithub_Build : BuildType({
    uuid = "f9557ed1-cb46-4fcd-ba8c-88744a73b685"
    id = "CordappExamplePersonalGithub_Build"
    name = "Build"

    vcs {
        root(CordappExamplePersonalGithub.vcsRoots.CordappExamplePersonalGithub_HttpsGithubComRagmondoCordappExampleGitRefsHeadsRel)

    }

    steps {
        gradle {
            tasks = "clean build test"
            buildFile = ""
            useGradleWrapper = true
        }
    }

    triggers {
        vcs {
        }
    }
})
