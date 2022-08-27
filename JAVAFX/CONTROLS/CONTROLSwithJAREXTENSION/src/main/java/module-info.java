module com.example.controlswithjarextension {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.controlswithjarextension to javafx.fxml;
    exports com.example.controlswithjarextension;
}