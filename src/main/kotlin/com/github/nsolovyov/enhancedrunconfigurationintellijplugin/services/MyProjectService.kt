package com.github.nsolovyov.enhancedrunconfigurationintellijplugin.services

import com.github.nsolovyov.enhancedrunconfigurationintellijplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
