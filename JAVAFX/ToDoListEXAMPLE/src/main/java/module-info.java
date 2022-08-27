module com.example.todolistexample {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.todolistexample to javafx.fxml;
    exports com.example.todolistexample;
}