module com.example.tilepanelayout {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tilepanelayout to javafx.fxml;
    exports com.example.tilepanelayout;
}