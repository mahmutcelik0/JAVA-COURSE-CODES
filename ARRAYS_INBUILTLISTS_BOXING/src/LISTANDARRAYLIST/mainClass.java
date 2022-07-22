package LISTANDARRAYLIST;

import java.lang.reflect.Array;
import java.util.*;

public class mainClass {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList listInMain = new GroceryList();

    public static void main(String[] args){
        boolean quit = false;
        int choice = 0;
        printInstructions();

        while(!quit){
            System.out.println("ENTER YOUR CHOICE: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0 -> printInstructions();
                case 1 -> listInMain.printGroceryList();
                case 2 -> addItem();
                case 3 -> modifyItem();
                case 4 -> removeItem();
                case 5 -> searchForItem();
                case 6 -> quit = true;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem(){
        System.out.print("ENTER ITEM TO ADD LIST:");
        listInMain.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.print("ENTER INDEX TO CHANGE:");
        int position = scanner.nextInt();
        scanner.nextLine();
        System.out.print("ENTER NEW ELEMENT TO CHANGE: ");
        listInMain.modifyGroceryItem(scanner.nextLine());
    }

    public static void removeItem(){
        System.out.print("ENTER NUMBER TO DELETE:");
        listInMain.removeItem(scanner.nextLine());

    }

    public static void searchForItem(){
        System.out.println("ENTER ELEMENT TO FIND IN LIST");
        System.out.println(listInMain.find(scanner.nextLine()));

    }

}
