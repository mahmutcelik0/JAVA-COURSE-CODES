module com.example.sliderandspinner {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sliderandspinner to javafx.fxml;
    exports com.example.sliderandspinner;
}