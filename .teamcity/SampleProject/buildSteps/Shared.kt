package SampleProject.buildSteps

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*

val sayGoodbye = ScriptBuildStep({
    name = "Say goodbye"
    scriptContent = "echo Goodbye"
})
