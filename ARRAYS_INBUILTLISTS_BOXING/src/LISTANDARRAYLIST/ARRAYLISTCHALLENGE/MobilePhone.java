package LISTANDARRAYLIST.ARRAYLISTCHALLENGE;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MobilePhone {

    private static ArrayList<CONTACT> contacts = new ArrayList<>(); //ARRAYLIST THAT HOLDS CONTACTS
    private static Scanner scanner = new Scanner(System.in);    //SCANNER THAT USED WHOLE PROGRAM
    public MobilePhone(){   //CONSTRUCTOR FOR CLASS
        options();  //PRINTING OPTIONS WITH METHOD
        int numberFromUser = 0; //THIS VARIABLE HOLDS NUMBERFROMUSER TO WHILE LOOP.
        boolean falseInput = false; //BOOLEAN VARIABLE USED TO CATCH EXCEPTIONS


//        IF NUMBERFROMUSER TAKEN FROM USER USING SCANNER THAT WON'T BE NUMBER OR HIGHER 5 AND LOWER 0
//        IT WILL BE EXCEPTION AND CATCHED. IF NO EXCEPTION choosingOption WILL CALL AND PROGRAM WILL EXECUTE
//

        do{
            try {
                falseInput = false;

                System.out.print("ENTER NUMBER:");

                numberFromUser = scanner.nextInt();
                scanner.nextLine();
                if(numberFromUser>=0 && numberFromUser<= 5) choosingOptions(numberFromUser);    //CALLING METHOD
                else throw new Exception();
            }
            catch (InputMismatchException e){   //IF NOT NUMBER
                System.out.println("ENTER A ACCEPTABLE INPUT");
                scanner.nextLine();
                falseInput = true;
            }
            catch (Exception e){    //IF NOT IN RANGE
                System.out.println("ENTER A VALID NUMBER");
                falseInput = true;
            }

        }while (numberFromUser !=0 || falseInput);  //IT CONTINUES UNTIL TRUE NUMBER GET
    }

    //USING NUMBERFROMUSER IT GOES TO METHODS THAT USER WANT TO DO
    private void choosingOptions(int numberToSelect){
        switch (numberToSelect) {
            case 0 -> System.exit(0);
            case 1 -> printListOfContacts();
            case 2 -> addNewContact();
            case 3 -> updateExistingContact();
            case 4 -> removeContact();
            case 5 -> searchContact();
        }
    }
    //PRINTING OPTIONS
    private void options(){
        System.out.println(
                """
                        QUIT -------------------- PRESS 0
                        PRINT LIST OF CONTACTS -- PRESS 1
                        ADD NEW CONTACT --------- PRESS 2
                        UPDATE EXISTING CONTACT - PRESS 3
                        REMOVE CONTACT ---------- PRESS 4
                        SEARCH / FIND CONTACT --- PRESS 5"""
        );
    }

    /**
    * IF USER ENTERED 1 THIS METHOD WILL WORK.
    * IF ARRAYLISTS SIZE IS ZERO OR NEGATIVE IT WILL PRINT -> THERE IS NO CONTACTS
    * OTHERWISE IT WILL LOOP ALL ARRAYLIST AND USING CONTACT CLASS'S TOSTRING METHOD ,PRINT CONTACTS
    * INFORMATIONS
    * */
    private void printListOfContacts(){
        if(contacts.size() <= 0) System.out.println("THERE IS NO CONTACTS");
        else {
            System.out.println("\nLIST OF CONTACTS");
            for(int a = 0 ; a < contacts.size() ; a++){
                System.out.println((a+1)+". CONTACTS INFORMATIONS\n"+contacts.get(a).toString());
            }
        }
    }

    /**
    * IF USER ENTERED 2 THIS METHOD WILL WORK
    * IT PROVIDES ADD NEW CONTACTS
    * IT TAKES INPUTS AND USING COUPLE METHODS(checkForAdd) IF CONTACT IS NOT EXIST IN ARRAYLIST IT ADDS
    * OTHERWISE PRINT -> THIS CONTACT EXIST
    * */
    private void addNewContact(){
        System.out.print("ENTER NEW CONTACTS NAME:");
        String newContactName = scanner.nextLine();
        System.out.print("ENTER NEW CONTACTS PHONE NUMBER:");
        String newContactPhoneNumber = scanner.nextLine();

        CONTACT newContact = new CONTACT(newContactName,newContactPhoneNumber);
        if(!checkForAdd(newContact)) contacts.add(newContact);
        else System.out.println("THIS CONTACT EXIST");
    }

    /**
    *IF USER ENTERED 3 THIS METHOD WILL WORK
    * IT PROVIDES UPDATE EXISTING CONTACT
    * IT TAKES EXISTING CONTACTS AND CONTROLS IT USING checks METHOD AND IT EXIST GOES ANOTHER METHOD
    * NAMED checkForUpdate
    * */
    private void updateExistingContact(){
        System.out.print("ENTER EXISTING CONTACT NAME:");
        String existingContactName = scanner.nextLine();
        System.out.print("ENTER EXISTING CONTACT PHONE NUMBER:");
        String existingContactPhoneNumber = scanner.nextLine();

        int numberFromChecks = checks(new CONTACT(existingContactName,existingContactPhoneNumber));
        if(numberFromChecks == -1) {
            System.out.println("THIS CONTACT IS NOT EXIST");
            return;
        }

        checkForUpdate(new CONTACT(existingContactName,existingContactPhoneNumber),numberFromChecks);
    }

    /**
     * IF USER ENTERED 4 THIS METHOD WILL WORK
     * IT TAKES INPUTS FROM USER AND LOOKS ARRAYLIST DOES IT EXIST USING checks METHOD
     * IF NUMBER RETURNED IS -1 MEANS THIS CONTACT IS NOT EXIST AND NOTHING WILL HAPPEN
     * OTHERWISE NUMBER RETURNED IS INDEX OF THE NUMBER TO BE DELETED AND USING IT WITH
     * ARRAYLIST'S remove METHOD , DELETION PERFORMED
     * */
    private void removeContact(){
        System.out.print("ENTER NAME TO REMOVE:");
        String nameToRemove = scanner.nextLine();
        System.out.print("ENTER PHONE NUMBER TO REMOVE:");
        String phoneNumberToRemove = scanner.nextLine();

        int numberFromChecks = checks(new CONTACT(nameToRemove,phoneNumberToRemove));
        if(numberFromChecks == -1){
            System.out.println("THIS CONTACT IS NOT EXIST");
            return;
        }

        contacts.remove(numberFromChecks);
    }

    /**
     * IF USER ENTERED 5 THIS METHOD WILL WORK
     * IT TAKES INPUTS FROM USER AND LOOKS ARRAYLIST DOES IT EXIST USING checks METHOD
     * IF NUMBER RETURNED IS -1 MEANS THIS CONTACT IS NOT EXIST AND
     * PRINT -> THIS CONTACT IS NOT EXIST
     * OTHERWISE
     * PRINT -> THIS CONTACT IS EXIST
     * */
    private void searchContact(){
        System.out.print("ENTER NAME TO SEARCH:");
        String nameToSearch = scanner.nextLine();
        System.out.print("ENTER PHONE NUMBER TO SEARCH:");
        String phoneNumberToSearch = scanner.nextLine();

        int numberFromChechs = checks(new CONTACT(nameToSearch,phoneNumberToSearch));
        if(numberFromChechs == -1) System.out.println("THIS CONTACT IS NOT EXIST");
        else System.out.println("THIS CONTACT IS EXIST");
    }

    /**
     * IT LOOPS ARRAYLIST AND USING CONTACT CLASS'S TOSTRINH METHOD LOOKS EQUALS
     * IF PARAMETER OBJECT AND ONE OF ELEMENT FROM ARRAYLIST IS EQUAL RETURNS TRUE
     * OTHERWISE RETURNS FALSE
     * */
    private boolean checkForAdd(CONTACT fromMethod){
        for(CONTACT contact : contacts){
            if(contact.toString().equals(fromMethod.toString())) return true;
        }
        return false;
    }

    /**
     * THIS METHOD USED FOR UPDATEEXISTINGCONTACT METHOD
     * IT TAKES NEW CONTACT'S INFORMATIONS AND USING checks METHOD LOOKS ARRAYLIST TO CONTROL
     * IS NEW CONTACT EXIST
     * IF NEW CONTACT EXIST UPDATING CONTACT WON'T WORK AND print-> THIS NEW CONTACT IS EXIST
     * ELSE UPDATING CONTACT WILL BE USING WITH ARRAYLIST METHOD -> set()
     * */
    private void checkForUpdate(CONTACT fromMethod,int numberForSet){
        System.out.print("ENTER NEW NAME:");
        String newContactName = scanner.nextLine();

        System.out.print("ENTER NEW PHONE NUMBER:");
        String newContactPhoneNumber = scanner.nextLine();

        int numberFromChecks = checks(new CONTACT(newContactName,newContactPhoneNumber));


        if(numberFromChecks != -1) {
            System.out.println("THIS NEW CONTACT IS EXIST");

        }
        else  {
            contacts.set(numberForSet,new CONTACT(newContactName,newContactPhoneNumber));
        }
    }

    /**
     * THIS METHOD WORKS LIKE ARRAYLIST'S INDEXOF METHOD
     * IT LOOPS WHOLE ARRAYLIST AND IF PARAMETER AND ARRAYLIST'S ELEMENT IS EQUAL RETURNS INDEX
     * OTHERWISE RETURNS -1
     * */
    private int checks(CONTACT fromMethod){
        for(int a = 0 ; a < contacts.size() ; a++){
            if(contacts.get(a).toString().equals(fromMethod.toString())){
                return a;
            }
        }
        return -1;
    }

}
