module com.example.firstpproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.firstpproject to javafx.fxml;
    exports com.example.firstpproject;
}