module com.example.stackpanelayout {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.stackpanelayout to javafx.fxml;
    exports com.example.stackpanelayout;
}