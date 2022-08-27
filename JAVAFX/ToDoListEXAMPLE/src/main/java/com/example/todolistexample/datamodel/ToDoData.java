package com.example.todolistexample.datamodel;

import java.time.format.DateTimeFormatter;
import java.util.List;

public class ToDoData {
    private static ToDoData instance = new ToDoData();
    private static String fileName = "ToDoListItems.txt";

    private List<ToDoItem> toDoItems;
    private DateTimeFormatter formatter;

    public static ToDoData getInstance(){
        return instance;
    }

    private ToDoData(){
        formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    }

    public List<ToDoItem> getToDoItems(){
        return toDoItems;
    }

    public void setToDoItems(List<ToDoItem> toDoItems){
        this.toDoItems = toDoItems;
    }
}
