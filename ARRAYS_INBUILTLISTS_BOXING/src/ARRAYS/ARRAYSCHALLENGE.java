package ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class ARRAYSCHALLENGE {
    private int[] array;
    private static Scanner myScanner;



    public void programWithoutSortMethod(){
        array = getIntegers();
        System.out.println("BEFORE SORTING");
        printArray(array);
        int[] newArray = sortTheArray();
        System.out.println("AFTER SORTING");
        printArray(newArray);
    }
    public void programWithSortMethod(){
        array = getIntegers();
        System.out.println("BEFORE SORTING");
        printArray(array);
        sortWithMethod(array);
        System.out.println("AFTER SORTING");
        printArray(array);
    }
    private int[] getIntegers(){
        myScanner = new Scanner(System.in);
        System.out.print("ENTER THE LENGTH OF ARRAY: ");
        int lengthOfArray = myScanner.nextInt();

        int[] array = new int[lengthOfArray];
        for(int a = 0 ; a < array.length ; a++){
            System.out.print("ENTER THE "+ (a+1)+ ". ELEMENT OF ARRAY: ");
            array[a] = myScanner.nextInt();
        }

        return array;
    }

    private void printArray(int[] array){
        for(int i = 0 ; i < array.length ; i++) System.out.println(
                (i+1)+". ELEMENT OF ARRAY IS: "+ array[i]
        );
    }

    private int[] sortTheArray(){
        for(int a= 0 ; a < array.length-1 ; a++){
            for(int b = a+1 ; b < array.length ; b++){
                if(array[b] > array[a]){
                    int temp = array[b];
                    array[b] = array[a];
                    array[a] = temp;
                }
            }
        }

        return array;
    }

    private void sortWithMethod(int[] arrayToSort){
        Arrays.sort(arrayToSort);   //IT SORTS ASCENDING
    }


}
