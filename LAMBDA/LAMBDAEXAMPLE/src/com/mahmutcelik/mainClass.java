package com.mahmutcelik;

import jdk.dynalink.beans.StaticClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class mainClass{

    public static void main(String[] args) {

        //FIRST
//      new Thread(new RunnableExample()).start();


        //SECOND
        /*
        Runnable toRun = new Runnable() {
            @Override
            public void run() {
                System.out.println("RUNNING FROM ANONYMOUS ");
            }
        };
        new Thread(toRun).start();  //CREATING A NEW THREAD
        */

        //THIRD
        //THREAD CLASSININ CONSTRUCTOR INA BAKIYOR VE ICERISINE RUNNABLE INTERFACE INDEN BIR NESNE GELMESI GEREKTIGINI GORUYOR. LAMBDA EXPRESSION KOYDUGUMUZDA ISE
        //RUNNABLE INTERFACE INDEKI TEK METODA GIDIYOR VE PARAMETER OLARAK HICBIR SEY ALMADIGI ICIN UYUMLU OLUYOR VE O METODUN YAPACAGI ISI SOYLEMIS OLUYORUZ
        // () -> ....
        //SOL KISIM PARAMETERS ORTA KISIM ARROW SAG KISIM LAMBDA BODY
        //new Thread(()->{System.out.println("RUNNING FROM LAMBDA");}).start();
//        sortEmployees();
//        sortEmployeesWithLambda();


//        System.out.println(new AnotherClass().doSomething("MAHMUT","CELIK"));

        //ANONYMOUS CLASS ICERISINDE KULLANILABILMESI ICIN NUMBER IN FINAL OLARAK TANIMLANMASI GEREKTI
        final int number = 5;
        {
            //ANONYMOUS CLASS THAT DEFINES INTERFACE (INTERFACE TEN NESNE OLUSTURULDU VE ANONYMOUS CLASS KULLANILARAK ICERISINDEKI ABSTRACT METODUN NE YAPMASI
            // GEREKTIGI TANIMLANDI)
            UpperConcat a = new UpperConcat() {
                @Override
                public String upperAndConcat(String s1, String s2) {
                    System.out.println("FROM ANONYMOUS CLASS "+ number);
                    return "AA";
                }
            };
            a.upperAndConcat("MAHMUT","CELIK");
        }

        System.out.println("FROM OUTSIDE "+number);
        new mainClass().method();


    }

    public void method(){
        int secondNumber = 3;

        {
            UpperConcat ex = (String s1, String s2) -> {

                System.out.println(secondNumber);
                return "aa";
            };
            ex.upperAndConcat("MAHMUT","CELIK");
        }

    }

    /**
     * WITH USING EMPLOYEE CLASS WE HAVE INSTANTIATED NEW OBJECTS AND ADD THEM TO ARRAYLIST
     * USING COLLECTIONS SORT METHOD WE CAN SORT ALL EMPLOYEES INSIDE LIST
     *TO MAKE SORTING WE HAVE TO USE COMPARATOR INTERFACE. IN THIS SITUATION WE CAN USE 2 WAYS.
     * 1 -> WE CAN USE ANONYMOUS CLASS TO DEFINE INTERFACES METHOD.
     * 2 -> WE CAN USE LAMBDA EXPRESSION TO DEFINE FUNCTIONAL INTERFACES METHOD.
     * WE USED ANONYMOUS CLASS IN THIS METHOD AND OVERRIDING COMPARE METHOD USED compareTo METHOD FROM STRING CLASS.
     * FINALLY TIME TO PRINT LIST ELEMENTS. I USED forEach METHOD FROM LIST INTERFACE. TO USE THAT METHOD I USED LAMBDA EXPRESSION TO PRINT RESULTS
     * INSTEAD OF DOING THAT I CAN USE CONSUMER INTERFACE WITH ANONYMOUS CLASS
     * */
    public static void sortEmployees(){
        Employee employee1 = new Employee("MAHMUT CELIK",21);
        Employee employee2 = new Employee("TIRREK ELA",9);
        Employee employee3 = new Employee("SERDAR TEZCAN",43);
        Employee employee4 = new Employee("ALI KOC",99);

        List<Employee> listOfEmployees = new ArrayList<>();
        listOfEmployees.add(employee1);listOfEmployees.add(employee2);listOfEmployees.add(employee3);listOfEmployees.add(employee4);
        Collections.sort(listOfEmployees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getName().compareTo(e2.getName());
            }
        });

        listOfEmployees.forEach((Employee e)-> System.out.println(e.getName()));

    }

    //THIS IS DIFFERENT WAY ABOVE METHOD
    public static void sortEmployeesWithLambda(){
        Employee employee1 = new Employee("MAHMUT CELIK",21);
        Employee employee2 = new Employee("TIRREK ELA",9);
        Employee employee3 = new Employee("SERDAR TEZCAN",43);
        Employee employee4 = new Employee("ALI KOC",99);

        List<Employee> listOfEmployees = new ArrayList<>();
        listOfEmployees.add(employee1);
        listOfEmployees.add(employee2);
        listOfEmployees.add(employee3);
        listOfEmployees.add(employee4);

        Collections.sort(listOfEmployees,(Employee e1, Employee e2)-> e1.getName().compareTo(e2.getName()));

        listOfEmployees.forEach((Employee e)-> System.out.println(e.getName()));
    }





}
/*
//CLASS THAT IMPLEMENTS RUNNABLE INTERFACE. IT USED FOR STARTING OR CREATING NEW THREADS
class RunnableExample implements Runnable{
    @Override
    public void run(){
        System.out.println("RUNNING FROM CLASS - IMPLEMENTS RUNNABLE"+ getClass().getSimpleName());
    }

}*/

/**
 * THIS CLASS USED TO CREATE EMPLOYEES TO STORE IN ARRAYLIST
 *
 * */
class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

@FunctionalInterface
interface UpperConcat{
    String upperAndConcat(String s1, String s2);
}

//CLASS THAT USES LAMBDA EXPRESSION TO DEFINE UpperConcat FUNCTIONAL INTERFACE
class AnotherClass{
    public String doSomething(String s1,String s2){
        UpperConcat str = (firstString,secondString)->firstString.toUpperCase()+secondString.toUpperCase();

        return str.upperAndConcat(s1,s2);
    }
}