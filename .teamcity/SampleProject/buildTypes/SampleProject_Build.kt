package SampleProject.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v10.triggers.ScheduleTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.ScheduleTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.schedule
import jetbrains.buildServer.configs.kotlin.v10.triggers.vcs
import SampleProject.buildSteps.*

object SampleProject_Build : BuildType({
    uuid = "b4d78b46-439d-4975-a200-ecd8301f8746"
    extId = "SampleProject_Build"
    name = "Build"

    vcs {
        root(SampleProject.vcsRoots.SampleProject_HttpsGithubComSarudakBadTestsRefsHeadsMaster)

    }

    steps {
        script(sayGoodbye)
        script {
            name = "Run Tests"
            scriptContent = "lein test"
        }
    }

    triggers {
        vcs {
        }
        schedule {
            schedulingPolicy = cron {
                minutes = "0/5"
            }
            triggerBuild = always()
            param("revisionRule", "lastFinished")
            param("triggerBuildWithPendingChangesOnly", "")
            param("dayOfWeek", "Sunday")
        }
    }
})
