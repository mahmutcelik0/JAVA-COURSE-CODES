package com.example.todolistexample;

import com.example.todolistexample.datamodel.ToDoItem;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class HelloController {
    private List<ToDoItem> toDoList;
    @FXML
    private ListView<ToDoItem> listView;    //<> kullanarak ListView içerisinde ToDoItem sakladıgımızı belırler
    @FXML
    private TextArea centerTextArea;
    @FXML
    private Label deadlineLabel;

//        WORKS LIKE CONSTRUCTOR
    //CONSTRUCTOR CAN'T REACH ELEMENTS FROM FXML BUT initialize() METHOD CAN REACH SO THAT WE USE IT
    public void initialize(){
        ToDoItem item1 = new ToDoItem("Mail birthday card","Buy a 30th birthday card for John", LocalDate.of(2016, Month.APRIL,25));
        ToDoItem item2 = new ToDoItem("Doctor's Appointment","See Dr. Smith at 123 Main Street.", LocalDate.of(2016, Month.MAY,23));
        ToDoItem item3 = new ToDoItem("Finish design proposal for client","I promised Mike I'd email website mockups by Friday 22nd April", LocalDate.of(2016, Month.APRIL,22));
        ToDoItem item4 = new ToDoItem("Pickup Doug at the train station","Doug's arriving on March 23 on the 5:00 train", LocalDate.of(2016, Month.MARCH,23));
        ToDoItem item5 = new ToDoItem("Pick up dry cleaning","The clothes should be ready by Wednesday", LocalDate.of(2016, Month.APRIL,20));
        toDoList = new ArrayList<>();
        toDoList.add(item1);
        toDoList.add(item2);
        toDoList.add(item3);
        toDoList.add(item4);
        toDoList.add(item5);



        //BASLANGICTA BIRININ DEFAULT OLARAK CALISMASINI AYARLAR
        listView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<ToDoItem>() {
            @Override
            public void changed(ObservableValue<? extends ToDoItem> observableValue, ToDoItem toDoItem, ToDoItem t1) {
                if(t1!=null){
                    ToDoItem item = listView.getSelectionModel().getSelectedItem();
                    centerTextArea.setText(item.getDetails());  //TEXTAREA NIN DEGISTIRILMESI
                    DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM d, yyyy");
                    deadlineLabel.setText(df.format(item.getDeadline()));
                }
            }
        });
        listView.getItems().setAll(toDoList);
        listView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE); //TEKLI SECMEYI SAGLADI ??
        listView.getSelectionModel().selectFirst();

    }

    /**
     * LISTVIEW ITEMLARINDAN HERHANGI BIRINE TIKLANDIGINDA CALISIR.
     * STRINGBUILDER CLASS I KULLANILARAK STRING OLUSTURULUYOR VE CENTER DAKI TEXTAREA YA SET LENIYOR.
     * listView.getSelectionModel().getSelectedItem().getDetails() ile tıklanan yerin detayları alınıyor
     * listView.getSelectionModel().getSelectedItem().getDeadLine() ile LocalDate ten olusturdugumuz deadLine nesnemizi alıp ekliyoruz
     * */
    @FXML
    public void eventHandler(){

        centerTextArea.setText(listView.getSelectionModel().getSelectedItem().getDetails().toString());
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM d, yyyy"); //TARIHI ISTEDIGIMIZ BIR FORMATA GETIRMEYI SAGLADI AY GUN, YIL SEKLINDE OLDU
        deadlineLabel.setText(df.format(listView.getSelectionModel().getSelectedItem().getDeadline()));
//        StringBuilder textToAdd = new StringBuilder();
//        textToAdd.append(listView.getSelectionModel().getSelectedItem().getDetails());
//        textToAdd.append("\n\n\n\nDue : ");
//        textToAdd.append(listView.getSelectionModel().getSelectedItem().getDeadline().toString());
//        centerTextArea.setText(textToAdd.toString());
    }


}