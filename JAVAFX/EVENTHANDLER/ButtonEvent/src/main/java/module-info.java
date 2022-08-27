module com.example.buttonevent {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.buttonevent to javafx.fxml;
    exports com.example.buttonevent;
}