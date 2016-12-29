package SampleProject.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script

object SampleProject_SampleConfig : BuildType({
    uuid = "a01bf2c6-3ecc-4196-985d-6700e5773792"
    extId = "SampleProject_SampleConfig"
    name = "SampleConfig"

    steps {
        script {
            scriptContent = """
                #!/bin/bash
                THE_RANDOM=${'$'}RANDOM
                echo ${'$'}THE_RANDOM
                SHOULD_FAIL=${'$'}(( THE_RANDOM % 2 ))
                echo ${'$'}SHOULD_FAIL
                if [ ${'$'}SHOULD_FAIL = 1 ];
                then
                	echo "Apple"
                 exit 1
                fi
                
                echo "Banananana"
                exit 0
            """.trimIndent()
        }
        script {
            scriptContent = "echo Hello"
        }
    }
})
