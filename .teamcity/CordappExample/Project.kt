package CordappExample

import CordappExample.buildTypes.*
import CordappExample.vcsRoots.*
import CordappExample.vcsRoots.CordappExample_HttpsGithubComRagmondoCordappExampleGitRefsHeadsReleaseV3
import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.Project
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "98966948-12f1-4f59-a386-51f83a1795c9"
    id = "CordappExample"
    parentId = "_Root"
    name = "Cordapp Example"

    vcsRoot(CordappExample_HttpsGithubComRagmondoCordappExampleGitRefsHeadsReleaseV3)

    buildType(CordappExample_Build)

    features {
        versionedSettings {
            id = "PROJECT_EXT_4"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.PREFER_SETTINGS_FROM_VCS
            rootExtId = CordappExample_HttpsGithubComRagmondoCordappExampleGitRefsHeadsReleaseV3.id
            showChanges = true
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }
})
