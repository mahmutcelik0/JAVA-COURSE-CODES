module com.example.flowpanelayout {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.flowpanelayout to javafx.fxml;
    exports com.example.flowpanelayout;
}