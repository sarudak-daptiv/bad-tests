package SampleProject

import SampleProject.buildTypes.*
import SampleProject.vcsRoots.*
import SampleProject.vcsRoots.SampleProject_HttpsGithubComSarudakBadTestsRefsHeadsMaster
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings.*
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.versionedSettings

object Project : Project({
    uuid = "46870df5-d59d-4a68-9864-a712fc5fed73"
    extId = "SampleProject"
    parentId = "_Root"
    name = "SampleProject"

    vcsRoot(SampleProject_HttpsGithubComSarudakBadTestsRefsHeadsMaster)

    buildType(SampleProject_Build)
    buildType(SampleProject_SampleConfig)

    features {
        versionedSettings {
            id = "PROJECT_EXT_2"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.PREFER_SETTINGS_FROM_VCS
            rootExtId = SampleProject_HttpsGithubComSarudakBadTestsRefsHeadsMaster.extId
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
        }
    }
})
