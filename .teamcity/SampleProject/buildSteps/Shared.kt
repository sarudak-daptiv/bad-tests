package SampleProject.buildSteps

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*

val sayHello = ScriptBuildStep({
    name = "Say hello"
    scriptContent = "echo Hello"
})
