package com.mahmutcelik;

import java.util.*;
import java.util.function.*;

public class mainClass {
    public static void main(String[] args) {
//      new mainClass().fourthExample(emp->emp.getAge()>40);
        //IntPredicate INTERFACE ININ test() METODLARI TANIMLANMIS OLDU.
        //SOLDAKI PARAMETER DA SAYI 10DAN BUYUKSE TRUE DONDURECEK TEST METODU
        //SAGDAKI PARAMETER DA SAYI 60DAN KUCUKSE TRUE DONDURECEK TEST METODU
//        new mainClass().fifthExample(number->number>10,number -> number<60);

        new mainClass().ninethExample();

    }

    //FIRST EXAMPLE OF USING FOREACH WITH LAMBDA EXPRESSION
    public void firstExample(){
        Employee employee1 = new Employee("MAHMUT",21);
        Employee employee2 = new Employee("ELA",9);
        Employee employee3 = new Employee("MANGAN",22);
        Employee employee4 = new Employee("TIM",44);

        List<Employee> listOfEmployees = new ArrayList<>();
        listOfEmployees.add(employee1);listOfEmployees.add(employee2);listOfEmployees.add(employee3);listOfEmployees.add(employee4);
        System.out.println("----------------------------");
        listOfEmployees.sort((e1,e2)-> e1.getName().compareTo(e2.getName()));
        listOfEmployees.forEach((employee)-> System.out.println(employee.toString()));

    }

    //SECOND EXAMPLE OF USING FOREACH WITHOUT LAMBDA EXPRESSION AND
    //BELOW METHOD PRINT OUT EMPLOYEES OVER 30 YEARS OLD.
    public void secondExample(){
        Employee employee1 = new Employee("MAHMUT",21);
        Employee employee2 = new Employee("ELA",9);
        Employee employee3 = new Employee("MANGAN",22);
        Employee employee4 = new Employee("TIM",44);
        Employee employee5 = new Employee("FATIH TERIM",69);
        Employee employee6 = new Employee("TATO",32);

        List<Employee> listOfEmployee = new ArrayList<>();
        listOfEmployee.add(employee1);listOfEmployee.add(employee2);
        listOfEmployee.add(employee3);listOfEmployee.add(employee4);
        listOfEmployee.add(employee5);listOfEmployee.add(employee6);

        for(Employee employee : listOfEmployee){
            if(employee.getAge()>30) System.out.println(employee.toString());
        }
    }

    //THIRD EXAMPLE OF USING FOREACH WITH LAMBDA EXPRESSION AND
    //BELOW METHOD PRINT OUT EMPLOYEES OVER 30 YEARS OLD
    public void thirdExample(){
        Employee employee1 = new Employee("MAHMUT",21);
        Employee employee2 = new Employee("ELA",9);
        Employee employee3 = new Employee("MANGAN",22);
        Employee employee4 = new Employee("TIM",44);
        Employee employee5 = new Employee("FATIH TERIM",69);
        Employee employee6 = new Employee("TATO",32);

        List<Employee> listOfEmployee = new ArrayList<>();
        listOfEmployee.add(employee1);listOfEmployee.add(employee2);
        listOfEmployee.add(employee3);listOfEmployee.add(employee4);
        listOfEmployee.add(employee5);listOfEmployee.add(employee6);

        listOfEmployee.forEach((employee) -> {if(employee.getAge()>30) System.out.println(employee.toString());});
    }

    //FOURTH EXAMPLE OF USING FOREACH WITH LAMBDA EXPRESSION AND
    //BELOW METHOD PRINT OUT EMPLOYEES OVER 30 YEARS OLD USING WITH PREDICATE INTERFACE
    /*
     *Predicate<T> is a generic functional interface that represents a single argument
     * function that returns a boolean value (true or false). This interface avaible in
     *java.util.function package and contains a test(T t) method that evaluates the
     * predicate of a given argument.
     * */
    public void fourthExample(Predicate<Employee> ageCondition){
        Employee employee1 = new Employee("MAHMUT",21);
        Employee employee2 = new Employee("ELA",9);
        Employee employee3 = new Employee("MANGAN",22);
        Employee employee4 = new Employee("TIM",44);
        Employee employee5 = new Employee("FATIH TERIM",69);
        Employee employee6 = new Employee("TATO",32);

        List<Employee> listOfEmployee = new ArrayList<>();
        listOfEmployee.add(employee1);listOfEmployee.add(employee2);
        listOfEmployee.add(employee3);listOfEmployee.add(employee4);
        listOfEmployee.add(employee5);listOfEmployee.add(employee6);

        listOfEmployee.forEach((employeeFromList)->{if(ageCondition.test(employeeFromList)) System.out.println(employeeFromList.toString());});
    }

    //CHAINING INT PREDICATES EXAMPLE
    //IT USES and() METHOD THAT CHAINS DIFFERENT PREDICATES
    public void fifthExample(IntPredicate firstPred, IntPredicate secondPred){
        System.out.println(firstPred.and(secondPred).test(40));
    }

    //
    public void sixthExample(){
        Supplier<Integer> supplier = ()-> new Random().nextInt(1000);
        System.out.println(supplier.get());
        List<Integer> ss = new ArrayList<>();
    }

    public void seventhExample(){
        Consumer<String> aa = System.out::println;
        aa.accept(myInterface.firstMethod());
    }

    interface myInterface{
        static String firstMethod() {
            return "ANNEN";
        }

        default void secondMethod() {
            System.out.println("baban");
        }
    }


    public void eightExample(){
        //TAKES ONE PARAMETER RETURNS BOOLEAN
        Predicate<String> s = (oneParameter) -> oneParameter.equals("TIRREK ELA");
        System.out.println(s.test("TIRREK ELA"));

        //TAKES ONE PARAMETER RETURNS WHAT I WANT
        //IN BELOW EXAMPLE IT TAKES INTEGER RETURNS INTEGER WHICH TAKEN INTEGER+5
        //AND AFTER DEFINING LAMBDA EXPRESSION WE NEED TO USE INTERFACES METHOD
        //AND SEND PARAMETER
        Function<Integer,Integer> b = (number) -> number+5;
        System.out.println(b.apply(10));

        //TAKES NO PARAMETER RETURNS WHAT I WANT
        //ALWAYS RETURN TRUE
        Supplier<Boolean> e = () -> true;
        System.out.println(e.get());

        //TAKES ONE PARAMETER RETURNS VOID
        //I USED FUNCTIONAL INTERFACE TO PRINT OUT STRING. IT TAKES ONE PARAMETER
        //AND RETURNS VOID. IT ACCEPT PARAMETER AFTER THAT REALIZE LAMBDA EXPRESSION
        Consumer<String> printExample = (stringToPrint) -> System.out.println(stringToPrint + " LTD STI AS");
        printExample.accept("MAHMUT CELIK");
    }

    //FUNCTION INTERFACES CAN CHAIN ANOTHER INTERFACE

    public void ninethExample(){
        String name = "mahmut celik";
        //I WANT TO USE A INTERFACE TO HOLD FIRST NAME
        Function<String, String> toMakeUppercase = (fullName) -> fullName.toUpperCase(); //We can also use method referencing String::toUpperCase;
        Function<String, String> toGetFirstName = (fullName) -> fullName.substring(0,fullName.indexOf(' '));
        System.out.println(toMakeUppercase.andThen(toGetFirstName).apply(name));

        //toMakeUppercase.andThen(toGetFirstName) firstly it uses uppercase expression
        //after that uses getFirstName expression
    }


}
