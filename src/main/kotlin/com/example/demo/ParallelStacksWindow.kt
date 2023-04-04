package com.example.demo

import com.intellij.openapi.ui.SimpleToolWindowPanel
import com.intellij.openapi.ui.Splitter
import com.intellij.ui.OnePixelSplitter
import javax.swing.BorderFactory
import javax.swing.JComponent
import javax.swing.JPanel

class ParallelStacksWindow {
    private val contentToolWindow: JPanel
    val content: JComponent
        get() = contentToolWindow

    init {
        contentToolWindow = SimpleToolWindowPanel(true, true)
        val horizontalSplitter = OnePixelSplitter(true, 0.0f)
        horizontalSplitter.border = BorderFactory.createEmptyBorder()
        horizontalSplitter.dividerPositionStrategy = Splitter.DividerPositionStrategy.KEEP_FIRST_SIZE
        horizontalSplitter.setResizeEnabled(false)
        contentToolWindow.add(horizontalSplitter)
    }
}