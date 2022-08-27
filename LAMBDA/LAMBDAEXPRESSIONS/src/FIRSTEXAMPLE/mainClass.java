package FIRSTEXAMPLE;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;


@FunctionalInterface
interface apple{
    int printRandomCount(int firstNumber, int secondNumber);
}


public class mainClass {

    public static void main(String[] args) {
    /*
        apple a = (int x,int y) -> x*y;
        //INTERFACE TEN BELLEKTE YER AYIRDIK VE LAMBDA EXPRESSION KULLANARAK
        //INTERFACE ICINDEKI METODUN NE YAPACAGINI BELIRLIYORUZ.SONRASINDA BELLEKTE AYIRDIGIMIZ YERDEN METODU
        //CAGIRDIGIMIZDA LAMBDA EXPRESSIONDA TANIMLADIGIMIZ ISLEM GERCEKLESİR.
        System.out.println(a.printRandomCount(3,4));
    */
        mainClass main = new mainClass();
//        main.example();

        /*main.cannotUseBlockStatement();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.forEach((Integer a) -> {
            System.out.println(a.toString());
        });*/

        main.usageOfConsumer();

    }


    public void example(){
        int firstNumber = new Random().nextInt(0,10);
        int secondNumber = new Random().nextInt(0,10);

        apple e = (int number1, int number2)->
        {
            System.out.println("FIRST NUMBER: "+number1);
            System.out.println("SECOND NUMBER: " + number2);
            return number1*number2; //IF WE USE BLOCK STRUCTURE WITHIN LAMBDA EXPRESSIONS, WE USE RETURN OTHERWISE IT WILL AUTOMATICALLY RETURN RESULT
        };

        System.out.println(e.printRandomCount(firstNumber,secondNumber));
    }

    public void cannotUseBlockStatement(){
//      apple m = (int firstNumber, int secondNumber) -> (firstNumber*secondNumber); //NO BLOCK STATEMENT SUCH AS FOR , IF ... AND SO THERE IS NO PROBLEM IN LINE

//      apple n = (int firstNumber, int secondNumber) -> (if(firstNumber < secondNumber) );  IN THIS LINE THERE IS A PROBLEM BECAUSE OF IF STATEMENT

        apple e = (int firstNumber, int secondNumber) -> {
            System.out.println("FIRST NUMBER: "+ firstNumber);
            System.out.println("SECOND NUMBER: "+ secondNumber);

            if(firstNumber > secondNumber) System.out.println("FIRST NUMBER IS HIGHER THAT SECOND NUMBER");
            else if(firstNumber < secondNumber) System.out.println("SECOND NUMBER IS HIGHER THAT FIRST NUMBER");
            else System.out.println("NUMBERS ARE EQUAL");
            return firstNumber*secondNumber;
        };

        System.out.println(e.printRandomCount(new Random().nextInt(0,10), new Random().nextInt(0,10)));

    }


    public void usageOfConsumer(){
        ArrayList<Integer> exampleList = new ArrayList<>();
        exampleList.add(1);
        exampleList.add(2);
        exampleList.add(3);
        exampleList.add(4);
        exampleList.add(5);

        Consumer<Integer> consumer = (Integer a) -> {System.out.println(a.toString());};
        exampleList.forEach(consumer);
        exampleList.forEach(System.out::println);

    }

}
