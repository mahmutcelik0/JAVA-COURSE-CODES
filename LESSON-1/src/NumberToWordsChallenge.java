public class NumberToWordsChallenge {
    public static void numberToWords(int number){
        if(number<0) {
            System.out.println("Invalid Value");
            return;
        }
        int digit = number%10;
        if(number >=0 && number <10){
            printer(digit);
            return;
        }
        else if(number >=10){

            numberToWords(number/10) ;
            printer(digit);
        }
    }


    public static void printer(int digit){
        switch(digit){
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;

        }
    }
}