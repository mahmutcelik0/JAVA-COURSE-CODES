package com.example.lambdawithjavafx;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController{
    @FXML
    private Button clickButton;

    //WITH USING ANONYMOUS CLASS
    public void initialize(){
        clickButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("CLICKED THE BUTTON");
            }
        });
    }

    //WITH USING LAMBDA EXPRESSION TO MAKE EVENTHANDLER
    public void initialize(){
        clickButton.setOnAction((ActionEvent e )-> System.out.println("CLICKED BUTTON WITH USING LAMBDA PART"));
    }


}