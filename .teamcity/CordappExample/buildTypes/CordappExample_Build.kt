package CordappExample.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.v2017_2.triggers.vcs

object CordappExample_Build : BuildType({
    uuid = "f2e82a52-704d-4e00-b04c-021648af7010"
    id = "CordappExample_Build"
    name = "Build"

    vcs {
        root(CordappExample.vcsRoots.CordappExample_HttpsGithubComRagmondoCordappExampleGitRefsHeadsReleaseV3)

    }

    steps {
        maven {
            goals = "clean test"
            pomLocation = ".teamcity/pom.xml"
            mavenVersion = defaultProvidedVersion()
        }
    }

    triggers {
        vcs {
        }
    }
})
