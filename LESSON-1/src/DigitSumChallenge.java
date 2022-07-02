public class DigitSumChallenge {
    public static int challengeSolution(int number){
        if(number <10) return -1;
        int sumOfDigits = 0;
        while(number >0){
            int leastSignificantDigit = number%10;
            sumOfDigits += leastSignificantDigit;
            number/=10;
        }
        return sumOfDigits;
    }
}