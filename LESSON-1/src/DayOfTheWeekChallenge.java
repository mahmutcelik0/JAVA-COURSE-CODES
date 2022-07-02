public class DayOfTheWeekChallenge {

    public static void printDayOfTheWeek(int number){

        switch (number){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("INVALID DAY");
                break;
        }

    }

    public static void dayOfTheWeekChallenge(int number){

        if(number ==0) System.out.println("Sunday");
        else if(number ==1) System.out.println("Monday");
        else if(number ==2) System.out.println("Monday");
        else if(number ==3) System.out.println("Monday");
        else if(number ==4) System.out.println("Monday");
        else if(number ==5) System.out.println("Monday");
        else if(number ==6) System.out.println("Monday");
        else System.out.println("INVALID DAY");
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/100));

    }

    public static boolean isPrime(int n){
        if(n ==1) return false;
        for(int i= 2 ; i <= n/2 ; i++){
            if(n % i ==0) return false;
        }
        return true;
    }

    public static void primeNumberChallenge(int minNumber, int maxNumber, int maxPrimeCount){
        int primeCount = 0;
        for(int a = minNumber ; a < maxNumber ; a++){
            boolean isPrimeBool = isPrime(a);
            if(isPrimeBool){
                System.out.println("PRIME NUMBER:" + a);
                primeCount++;
            }
            if(primeCount >= maxPrimeCount) break;
        }
    }

    public static void sum3and5Challenge(){

        int sumOfDivisibleCount = 0;
        int sumsOfDivisibles = 0;
        for(int a = 1 ; a <= 1000 ; a++){
            if(sumOfDivisibleCount == 5) break;
            if(a%3 == 0 && a%5 ==0){
                sumOfDivisibleCount++;
                sumsOfDivisibles += a;
                System.out.println("DIVISIBLE NUMBER IS:" + a);
            }
        }
        System.out.println("SUMS OF DIVISIBLE NUMBERS: "+ sumsOfDivisibles);
    }
    static int bigsConstant = 5; static int smallsConstant = 1;

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount <0 || smallCount <0 || goal <0) return false;
        if((bigCount*bigsConstant + smallCount*smallsConstant) < goal) return false;
        else if((bigCount*bigsConstant + smallCount*smallsConstant) == goal) return true;
        else{
            if(goal%bigsConstant == 0) return true;
            else if(goal%bigsConstant <=smallCount) return true;
            else return false;
        }
    }
}