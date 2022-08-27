module com.example.choicebox {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.choicebox to javafx.fxml;
    exports com.example.choicebox;
}