package com.mahmutcelik;

import java.lang.reflect.Array;
import java.util.*;
import java.lang.String;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class mainClass {
    public static void main(String[] args) {
        new mainClass().reduceExample();
    }

    //stream().map(...) EXAMPLE USAGE WITH INTEGER
    public void firstExample(){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        List<Integer> squaresOfNumbers = numbers.stream().map((a) -> a + a).toList();

        squaresOfNumbers.forEach(System.out::println); //THIS PART USES METHOD REFERENCING
    }

    //stream().map(...) EXAMPLE USAGE WITH STRING
    public void secondExample(){
        List<String> names = Arrays.asList("MAHMUT","TIM","ELA");
        List<String> addNewLineSymbol = names.stream().map((a)-> new StringBuilder(a).append("\n").toString()).toList();

        addNewLineSymbol.forEach(System.out::print);
    }

    //stream().filter(...) EXAMPLE USAGE WITH INTEGER
    public void thirdExample(){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,5);
        List<Integer> choosenNumbers = numbers.stream().filter((a)->a.equals(5)).collect(Collectors.toList());

        choosenNumbers.forEach(System.out::println);
    }

    //stream().filter(...) EXAMPLE USAGE WITH STRING
    public void fourthExample(){
        List<String> names = Arrays.asList("MAHMUT","TIM","ELA");
        List<String> filteredNames = names.stream().filter((name) -> name.equals("MAHMUT")).toList();
        filteredNames.stream().forEach(System.out::println);
    }

    //WHILE WE USE STREAM MAIN DATA WON'T CHANGE. THIS IS EXAMPLE OF THAT MAINTAIN.
    public void fifthExample(){
        List<Integer> datas = Arrays.asList(1,2,3,4,5);

        List<Integer> newDatas = datas.stream().map((s)->s*s).toList();

        System.out.println("NEW DATA");
        newDatas.stream().forEach(System.out::println);

        System.out.println("OLD DATA");
        datas.stream().forEach(System.out::println);
    }

    //EXAMPLE OF COMPARING IMPERATIVE (OLD FASHION) AND DECLARATIVE CODES
    public void comparingExampleIMPERATIVE(){
        List<String> names = new ArrayList<>(Arrays.asList("AAA","BBB","CCC","DDD","EEE"));
        String newNameToAdd = "FFF";
        boolean canAdd = false;

        for(String aName: names){
            if(aName.equals(newNameToAdd)){
                canAdd = false;
                break;
            }
            canAdd = true;
        }

        if(canAdd) {
            names.add(newNameToAdd);
        }
        for(String name: names) System.out.println(name);
    }

    public void comparingExampleDECLARATIVE(){
        List<String> names = new ArrayList<>(Arrays.asList("AAA","BBB","CCC","DDD","EEE"));

        boolean doesHave = names.stream().anyMatch((name) -> name.equalsIgnoreCase("FFF"));
        if(!doesHave) names.add("FFF");
        names.forEach(System.out::println);
    }

    //BELOW EXAMPLE THERE ARE NUMBERS WITH LETTERS AND I HAVE USED SOME LAMBDA EXPRESSIONS TO MAKE DIFFERENT THINGS
    //BELOW OF THIS METHOD WILL MAKE KIND THINGS LIKE THIS
    public void exampleWithoutStream(){
        List<String> someBingoNumbers = Arrays.asList(
                "N40","N36",
                "B12","B6",
                "G53","G49","G60","G50","g64",
                "I26","I17","I29",
                "O71");

        someBingoNumbers.forEach(System.out::println);
        List<String> gNumbers = new ArrayList<>();
        //gNumbers arraylist must be effectively-final because I will add new Strings in lambda expression
        //to arraylist. If arraylist won't be effectively-final it will cause an error

        someBingoNumbers.forEach((first)->
        {
            if(first.toUpperCase().startsWith("G")) gNumbers.add(first);
        });

        System.out.println("NUMBERS THAT BEGIN WITH G/g");
        gNumbers.forEach(System.out::println);

        System.out.println("NUMBERS THAT BEGIN WITH G/g AND SORTED");
        gNumbers.sort(String::compareToIgnoreCase); //firstString.comparteToIgnoreCase(secondString) yerine method reference kullanıldı
        gNumbers.forEach(System.out::println);

    }

    public void exampleWithStream(){
        List<String> someBingoNumbers = Arrays.asList(
                "N40","N36",
                "B12","B6",
                "G53","G49","G60","G50","g64",
                "I26","I17","I29",
                "O71");
        someBingoNumbers.stream()
                .filter((number)-> number.toUpperCase().startsWith("G"))
                .sorted(String::compareToIgnoreCase)
                .forEach(System.out::println);

    }

    //Belirli bir tipte birden fazla eleman içeren stream oluşturabiliriz
    // fakat birden fazla tipte elemanlar içeren stream oluşturamayız
    public void exampleOfStream(){
        Stream<String> stream = Stream.of("I26","I17","I29","O71");
        Stream<String> secondStream = Stream.of("AA","BB","CC");

        //WE CAN CONCATENATE STREAMS
        Stream<String> concatenatesStream = Stream.concat(stream,secondStream);
    }

    //EXAMPLE OF USAGE distinct() intermediate operation
    public void exampleOfdistinct(){
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> anotherNumbers = new ArrayList<>(Arrays.asList(3,4,5,6,7));

        //FIRSTLY I WILL CONCATENATE LISTS
        numbers.addAll(anotherNumbers);
        System.out.println("--------CONCATENATION RESULTS--------");
        numbers.forEach(System.out::println);

        //USING distinct() method
        numbers = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println("--------DISTINCT USAGE RESULTS--------");
        numbers.forEach(System.out::println);
    }

    //EXAMPLE OF USAGE peek() intermediate operation
    public void exampleOfpeek(){
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> anotherNumbers = new ArrayList<>(Arrays.asList(3,4,5,6,7));

        //I WILL CONCATENATE LISTS AND USING PEEK STREAM WON'T FINISH
        numbers.addAll(anotherNumbers);
        System.out.println("PRINTING OUT WITH USING PEEK");
        List<Integer> concatenatedLists = numbers.stream().peek(System.out::println).collect(Collectors.toList());
        System.out.println("PRINTING OUT WITH USING FOREACH");
        concatenatedLists.forEach(System.out::println);
    }

    //EXAMPLE OF USAGE flatmap() intermediate operation
    public void exampleOfflatmap(){
        Employee john = new Employee("John Doe",30);
        Employee jane = new Employee("Jane Deer",25);
        Employee jack = new Employee("Jack Hill",40);
        Employee snow = new Employee("Snow White",22);

        Department hr = new Department("Human Resources");
        hr.addEmployee(jane);
        hr.addEmployee(jack);
        hr.addEmployee(snow);

        Department accounting = new Department("Accounting");
        accounting.addEmployee(john);

        List<Department> departments = new ArrayList<>();
        departments.add(hr); departments.add(accounting);
        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .forEach(System.out::println);
    }

    //ANOTHER EXAMPLE OF flatMap()
    public void anotherExampleofFlatMap(){
        List<Character> myName = new ArrayList<>(Arrays.asList('M','A','H','M','U','T'));
        List<Character> mySurname = new ArrayList<>(Arrays.asList('C','E','L','I','K'));

        List<List> myFullName = new ArrayList<>();
        myFullName.add(myName);myFullName.add(mySurname);

        //BEFORE USING FLATMAP
        System.out.println("-------BEFORE USING FLATMAP -------\n"+myFullName);

        //USING FLATMAP
        System.out.println("-------USING FLATMAP -------");
        myFullName.stream()
                .flatMap((inList) -> inList.stream()).
                forEach(System.out::print);

    }

    //COLLECTORS DIFFERENT SYNTAX
    public void collectors(){
        List<String> someBingoNumbers = Arrays.asList(
                "N40","N36",
                "B12","B6",
                "G53","G49","G60","G50","g64",
                "I26","I17","I29",
                "O71");
        List<String> sortedNumbers = someBingoNumbers.stream()
                .map(String::toUpperCase)
                .filter(s-> s.startsWith("G"))
                .sorted()
                .collect(ArrayList::new,ArrayList::add,ArrayList::addAll);
        sortedNumbers.forEach(System.out::println);
    }

    //reduce() example
    public void reduceExample(){
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        numbers.stream().reduce((integer, integer2) -> integer<integer2 ? integer: integer2);
        numbers.forEach(System.out::println);
    }




}
