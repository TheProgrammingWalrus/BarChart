module com.example.barchart {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.example.barchart to javafx.fxml;
    exports com.example.barchart;
}