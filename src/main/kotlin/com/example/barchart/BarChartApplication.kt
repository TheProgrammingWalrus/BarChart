package com.example.barchart

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.chart.*
import javafx.scene.layout.Pane
import javafx.stage.Stage

class BarChartApplication : Application() {
    override fun start(stage: Stage) {
        // Create x-axis and y-axis
        val xAxis = CategoryAxis()
        val yAxis = NumberAxis()

        // create a bar chart
        val barchart1 = StackedBarChart(xAxis, yAxis)
        barchart1.title = "Car Sales by Manufacturer"

        // create a data series
        val dataSeries1 = XYChart.Series<String, Number>()
        dataSeries1.name = "January 2022"
        dataSeries1.data.add(XYChart.Data("Ford", 35000))
        dataSeries1.data.add(XYChart.Data("GM", 45000))
        dataSeries1.data.add(XYChart.Data("Toyota", 20000))

        val dataSeries2 = XYChart.Series<String, Number>()
        dataSeries2.name = "February 2022"
        dataSeries2.data.add(XYChart.Data("Ford", 20000))
        dataSeries2.data.add(XYChart.Data("GM", 33000))
        dataSeries2.data.add(XYChart.Data("Toyota", 27000))

        val dataSeries3 = XYChart.Series<String, Number>()
        dataSeries3.name = "March 2022"
        dataSeries3.data.add(XYChart.Data("Ford", 30000))
        dataSeries3.data.add(XYChart.Data("GM", 50000))
        dataSeries3.data.add(XYChart.Data("Toyota", 46000))

        // add the data series to the chart
        barchart1.data.addAll(dataSeries1, dataSeries2, dataSeries3)

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
    Application.launch(BarChartApplication::class.java)
}