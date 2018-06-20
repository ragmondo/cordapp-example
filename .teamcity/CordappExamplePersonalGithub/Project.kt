package CordappExamplePersonalGithub

import CordappExamplePersonalGithub.buildTypes.*
import CordappExamplePersonalGithub.vcsRoots.*
import CordappExamplePersonalGithub.vcsRoots.CordappExamplePersonalGithub_HttpsGithubComRagmondoCordappExampleGitRefsHeadsRel
import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.Project
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "daf9b954-55ff-49a8-af68-48e8110271f0"
    id = "CordappExamplePersonalGithub"
    parentId = "_Root"
    name = "Cordapp Example - personal github *NAMECHANGE*"

    vcsRoot(CordappExamplePersonalGithub_HttpsGithubComRagmondoCordappExampleGitRefsHeadsRel)

    buildType(CordappExamplePersonalGithub_Build)

    features {
        versionedSettings {
            id = "PROJECT_EXT_2"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.PREFER_SETTINGS_FROM_VCS
            rootExtId = CordappExamplePersonalGithub_HttpsGithubComRagmondoCordappExampleGitRefsHeadsRel.id
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }
})
