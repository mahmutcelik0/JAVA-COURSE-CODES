package com.example.firstpproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));


        Scene scene = new Scene(fxmlLoader.load(), 700,400);

        //MAKING WITH CODE
//        GridPane fxmlloader = new GridPane();
//        fxmlloader.setAlignment(Pos.CENTER);
//        fxmlloader.setVgap(10);
//        fxmlloader.setHgap(10);
//
//        Label greeting = new Label("FUCK OFF");
//        greeting.setTextFill(Color.GREEN);
//        greeting.setFont(Font.font("Times New Roman", FontWeight.BOLD,30));
//
//        fxmlloader.getChildren().add(greeting);

        stage.setTitle("Hello!");
//        stage.setScene(new Scene(fxmlloader,400,400));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}