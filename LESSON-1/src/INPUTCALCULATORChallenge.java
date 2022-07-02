import java.util.Scanner;

public class INPUTCALCULATORChallenge {
    public static void challangeSolution(){
        Scanner scanner = new Scanner(System.in);
        int sumOfNumbers = 0;
        int numberCount = 0;
        while(true){
            boolean boolValue = scanner.hasNextInt();
            if(boolValue){
                sumOfNumbers += scanner.nextInt();
                numberCount++;
            }
            else{
                if(numberCount ==0){
                    System.out.println("SUM = 0 AVG = 0");
                    break;
                }
                long average = Math.round(sumOfNumbers/(double)numberCount);
                if((sumOfNumbers/numberCount)>= average+0.5) average++;

                System.out.println("SUM = "+ sumOfNumbers + " AVG = "+ average);
                break;
            }
            scanner.nextLine();
        }
    }
}