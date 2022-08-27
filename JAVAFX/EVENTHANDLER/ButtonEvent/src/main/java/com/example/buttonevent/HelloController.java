package com.example.buttonevent;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;


public class HelloController {
    @FXML
    private TextField nameFromText;


    @FXML
    private Button sayHello, sayBye;
    @FXML
    private CheckBox checkBoxToDelete;
    @FXML
    private TextField secondExample;

    @FXML
    private Label labelID;
    @FXML
    private TextField runnableAnswer;
    @FXML
    private Button runnableButton;

    @FXML
    public void buttonEventHandler(){
        System.out.println("HELLO WORLD!!");
    }

    @FXML
    public void printTheName(){
        System.out.println("HELLO " + nameFromText.getText());
    }
    @FXML
    public void sayDifferentOuts(ActionEvent e){

        if(e.getSource().equals(sayHello)){
            System.out.println("HELLO, "+ secondExample.getText());
        }
        else if(e.getSource().equals(sayBye)){
            System.out.println("GOODBYE, "+ secondExample.getText());
        }
        else{
            System.out.println("SOMETHING IS WRONG");
        }
    }

    @FXML
    public void initialize(){
        sayHello.setDisable(true);
        sayBye.setDisable(true);
    }

    @FXML
    public void handleKeyReleased(){
        String text = secondExample.getText();
        boolean disableButtons = text.isEmpty() || text.trim().isEmpty();
        sayHello.setDisable(disableButtons);
        sayBye.setDisable(disableButtons);
    }

    @FXML
    public void deleteText(){
        if(checkBoxToDelete.isSelected()){
            secondExample.clear();
            initialize();
        }

    }

    /*
    @FXML
    public void processRunnable(){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try{
                    runnableButton.setDisable(true);
                    Thread.sleep(3000);

                    String fromTextField = runnableAnswer.getText();
                    try{
                        int number = Integer.parseInt(fromTextField);
                        runnableAnswer.setText(String.valueOf(number*2));
                    }catch (NumberFormatException e){
                        runnableAnswer.setText(fromTextField+" TOP");
                    }
                    finally {
                        runnableButton.setDisable(false);
                    }

                }
                catch (InterruptedException e){
                    //ssss
                }
            }
        };
        new Thread(runnable).start();
    }
    */

    private String ll;

    /*
    @FXML
    public void processRunnable(){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    runnableButton.setDisable(true);
                    Thread.sleep(3000);


                    try{
                        int number = Integer.parseInt(runnableAnswer.getText());
                        runnableAnswer.setText(String.valueOf(number*2));
                    }catch (NumberFormatException e){
                        runnableAnswer.setText(runnableAnswer+" TOP");
                    }finally {
                        runnableButton.setDisable(false);
                    }


                }catch (InterruptedException e){
                    //---
                }


            }
        };
        new Thread(runnable).start();
    }
    */

    @FXML
    public void processRunnable(){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try{
                    String sleepPlace = Platform.isFxApplicationThread()?"UI THREAD":"Background Thread";
                    System.out.println("GOING TO SLEEP ON: "+ sleepPlace);
                    Thread.sleep(3000);

                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            String changePlace = Platform.isFxApplicationThread()?"UI THREAD":"Background Thread";
                            System.out.println("GOING TO CHANGE LABEL ON: "+ changePlace);
                            labelID.setText("aa");
                        }
                    });
                }catch (InterruptedException e){
                    //---
                }
            }
        };
        new Thread(runnable).start();
    }

}