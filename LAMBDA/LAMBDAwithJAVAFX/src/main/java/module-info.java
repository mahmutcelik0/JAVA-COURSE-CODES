module com.example.lambdawithjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lambdawithjavafx to javafx.fxml;
    exports com.example.lambdawithjavafx;
}