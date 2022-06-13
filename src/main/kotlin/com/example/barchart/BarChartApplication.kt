package com.example.barchart

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.layout.Pane
import javafx.stage.Stage

class HelloApplication : Application() {
    override fun start(stage: Stage) {
        val pane = Pane()
        val scene = Scene(pane, 320.0, 240.0)
        stage.title = "Bar Chart"
        stage.scene = scene
        stage.show()
    }
}

fun main() {
    Application.launch(HelloApplication::class.java)
}