package SampleProject.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object SampleProject_HttpsGithubComSarudakBadTestsRefsHeadsMaster : GitVcsRoot({
    uuid = "2a7b0a27-f25c-4b07-8c08-2a3b1df52743"
    extId = "SampleProject_HttpsGithubComSarudakBadTestsRefsHeadsMaster"
    name = "https://github.com/sarudak-daptiv/bad-tests#refs/heads/master"
    url = "https://github.com/sarudak-daptiv/bad-tests"
    authMethod = password {
        userName = "sarudak-daptiv"
        password = "zxx363fb6b9bfb377f4775d03cbe80d301b"
    }
})
