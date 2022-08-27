module com.example.textfield {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.textfield to javafx.fxml;
    exports com.example.textfield;
}