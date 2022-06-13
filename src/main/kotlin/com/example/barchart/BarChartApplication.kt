package com.example.barchart

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.chart.BarChart
import javafx.scene.chart.CategoryAxis
import javafx.scene.chart.NumberAxis
import javafx.scene.chart.XYChart
import javafx.scene.layout.Pane
import javafx.stage.Stage

class HelloApplication : Application() {
    override fun start(stage: Stage) {
        // Create x-axis and y-axis
        val xAxis = CategoryAxis()
        val yAxis = NumberAxis()

        // create a bar chart
        val barchart1 = BarChart(xAxis, yAxis)
        barchart1.title = "Car Sales by Manufacturer"

        // create a data series
        val dataSeries1 = XYChart.Series<String, Number>()
        dataSeries1.name = "January 2022"
        dataSeries1.data.add(XYChart.Data("Ford", 35000))
        dataSeries1.data.add(XYChart.Data("GM", 45000))
        dataSeries1.data.add(XYChart.Data("Toyota", 20000))

        // add the data series to the chart
        barchart1.data.add(dataSeries1)

        // create a pane and add the bar chart to it
        val pane = Pane()
        pane.children.add(barchart1)

        // create a scene and add the pane to it
        val scene = Scene(pane, 500.0, 500.0)

        // add the scene to the stage
        stage.title = "Bar Chart"
        stage.scene = scene

        stage.show()
    }
}

fun main() {
    Application.launch(HelloApplication::class.java)
}