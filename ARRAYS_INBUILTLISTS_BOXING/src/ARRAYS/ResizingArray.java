package ARRAYS;

import java.util.Scanner;

public class ResizingArray {
    private static Scanner scanner = new Scanner(System.in);
    private static int[] baseData = new int[10];

    public ResizingArray(){
        getInput();
        printArray();
        resizeArray();
        printArray();
    }

    private static void getInput(){
        for(int a = 0 ; a < baseData.length ; a++){
            baseData[a] = scanner.nextInt();
        }
    }

    private static void printArray(){
        for(int b = 0 ; b < baseData.length ; b++){
            System.out.print(baseData[b] + " ");
        }
        System.out.println();
    }

    private static void resizeArray(){
        int[] copyVarToAccessArray = baseData;  //base datadaki arrayin adresini buraya da kopyalar yani array e 2 tane variable erişiyor
        baseData = new int[12]; //base data artık farklı bir arrayi gösteriyor copyVar olan ise ilk başta oluşturulanı gosteriyor

        for(int a = 0 ; a < copyVarToAccessArray.length ; a++){
            baseData[a] = copyVarToAccessArray[a];
        }


    }
}
