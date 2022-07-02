import java.util.Scanner;

public class MINANDMAXChallenge {

    public static void challengeSolution(){
        Scanner scanner = new Scanner(System.in);

        int minNumber =Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;
        while(true){
            System.out.print("ENTER NUMBER:");
            boolean boolValue = scanner.hasNextInt();
            if(boolValue){
                int gottenNumberFromUser = scanner.nextInt();
                if(gottenNumberFromUser <minNumber) minNumber = gottenNumberFromUser;
                else if(gottenNumberFromUser> maxNumber) maxNumber = gottenNumberFromUser;
            }
            else{
                System.out.println("MIN NUMBER IS:"+minNumber+
                        " MAX NUMBER IS:"+maxNumber);
                break;
            }
            scanner.nextLine(); //handle input
        }
        scanner.close();


    }
}