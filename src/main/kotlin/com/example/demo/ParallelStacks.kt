package com.example.demo

import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowFactory
import com.intellij.ui.content.ContentFactory

class ParallelStacks: ToolWindowFactory {
    override fun createToolWindowContent(project: Project, toolWindow: ToolWindow) {
        val window = ParallelStacksWindow()
        val contentFactory = ContentFactory.getInstance()
        val content = contentFactory.createContent(window.content, "", false)
        toolWindow.contentManager.addContent(content)
    }
}