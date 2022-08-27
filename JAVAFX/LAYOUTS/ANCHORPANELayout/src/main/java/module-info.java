module com.example.anchorpanelayout {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.anchorpanelayout to javafx.fxml;
    exports com.example.anchorpanelayout;
}