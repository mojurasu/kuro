package com.github.sitischu.kuro.services

import com.intellij.openapi.project.Project
import com.github.sitischu.kuro.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
