import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class mainClass {
    public static void main(String[] args) {
        new mainClass().sixthChallenge();
    }

    /*
    * CHALLENGE #1
    * WRITE THE FOLLOWING ANONYMOUS CLASS AS A LAMBDA EXPRESSION
     Runnable runnable = new Runnable() {
        @Override
        public void run() {
           String myString = "Let's split this up into an array";
           String[] parts = myString.split(" ");
           for(String part:parts){
               System.out.println(part);
           }
       }
    }
     */
    public void firstChallenge(){
        Runnable run = () -> Arrays.stream("Let's split this up into an array".split(" ")).forEach(System.out::println);
        run.run();

//        Stream.of("Let's split this up into an array".split(" ")).forEach(System.out::println);
    }

    /*CHALLENGE #2
    * WRITE THE FOLLOWING METHOD AS A LAMDA EXPRESSION. DON'T WORRY ABOUT ASSIGNING IT TO ANYTHING
     public static String everySecondChar(String source){
         StringBuilder returnVal = new StringBuilder();
         for(int i = 0; i < source.length() ; i++){
             if(i%2 == 1) {
                 returnVal.append(source.charAt(i));
             }
         }
         return returnVal.toString();
     }
    *  */
    public void secondChallenge(){
        Function<String, String> solution = (source) ->
        {
            StringBuilder returnVal = new StringBuilder();
            for(int i = 0; i < source.length() ; i++){
                if(i%2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };
        System.out.println(solution.apply("ABCD"));
    }

    /*CHALLENGE #3
    NOW WRITE A LAMDA EXPRESSION THAT MAPTS TO THE JAVA.UTIL.SUPPLIER INTERFACE.THIS LAMBDA SHOULD
    RETURN THE STRING "I LOVE JAVA!" ASSIGN IT TO A VARIABLE CALLED iLoveJava.
    * */
    public void thirdChallenge(){
        Supplier<String> iLoveJava  = () -> "I LOVE JAVA";
        String[] chars = iLoveJava.get().split("");
        Arrays.stream(chars).forEach(System.out::println);
    }

    /*
    * QUESTION: THERE ARE MANY INTERFACES IN THE JAVA SDK, AND SOMETIMES WE CAN USE A LAMBDA EXPRESSION
    * INSTEAD OF CREATING AN INSTANCE THAT IMPLEMENTS THE INTERFACE WE WANT TO USE.
    *
    * GIVEN A SPECIFIC INTERFACE, HOW CAN WE TELL WHETHER WE CAN MAP A LAMBDA EXPRESSION TO IT?
    * WHAT'S THE CRITERIA THAT HAS TO BE MET?
    *
    * ANSWER: THE INTERFACE HAS TO BE A FUNCTIONAL INTERFACE. IT CAN HAVE ONLY A SINGLE METHOD
    * THAT MUST BE IMPLEMENTED. A FUNCTIONAL INTERFACE CAN CONTAIN MORE THAN ONE METHOD, BUT ALL
    * THE METHODS BUT ONE MUST HAVE DEFAULT IMPLEMENTATIONS
    *
    * MOST OF THE TIME, THE DOCUMENTATION FOR AN INTERFACE WILL STATE WHETHER IT'S A FUNCTIONAL INTERFACE
    * */

    /*
    * QUESTION: WITH THAT IN MIND, CAN WE USE A LAMBDA EXPRESSION TO REPRESENT AN INSTANCE OF THE
    * JAVA.UTIL.CONCURRENT.CALLABLE INTERFACE?
    *
    * HINT: YOU'LL HAVE TO CHECH THE DOCUMENTATION. AS A JAVA DEVELOPER, YOU HAVE TO BE COMFORTABLE
    * WITH LOOKING UP AND READING DOCUMENTATION.
    *
    * ANSWER:THECALLABLE INTERFACE HAS ONLY ONE METHOD THAT HAS TO BE IMPLEMENTED - THE CALL() METHOD.
    * SO WE CAN USE A LAMBDA FOR IT. THE DOCUMENTATION ALSO STATES THAT IT'S A FUNCTIONAL INTERFACE
    * */

    /*
    * QUESTION: IS THE JAVA.UTIL.COMPARATOR INTERFACE A FUNCTIONAL INTERFACE?
    *
    * ANSWER: YES, IT IS. DESPITE CONTAINING OVER 10 METHODS, ONLY ONE METHOD HAS TO BE IMPLEMENTED
    * -COMPARE(). BECAUSE OF THAT, IT'S A FUNCTIONAL INTERFACE.
    * */

    /*CHALLENGE #4
    * SUPPOSE WE HAVE THE FOLLOWING LIST OF THE TOP 5 MALE AND FEMALE NAMES FOR 2015:
    *   List<String> topNames2015 = Arrays.asList("Amelia","Olivia","emily","Isla"
    ,       "Ava","oliver","Jack","Charlie","harry","Jacob");
    *
    * WRITE CODE TO PRINT THE ITEMS IN THE LIST IN SORTED ORDER, AND WITH THE FIRST LETTER IN EACH
    * NAME UPPER-CASED. THE NAME "harry" SHOULD BE PRINTED AS "Harry" AND SHOULD BE PRINTED AFTER
    * "Emily" AND BEFORE "Isla". USE LAMBDA EXPRESSIONS WHEREVER POSSIBLE
    * */

    public void fourthChallenge(){
        List<String> topNames2015 = Arrays.asList("Amelia","Olivia","emily","Isla","Ava","oliver","Jack","Charlie","harry","Jacob");
        topNames2015.stream().map((name) -> name.substring(0,1).toUpperCase() + name.substring(1))
                .sorted().forEach(System.out::println);
    }

    /*CHALLENGE #5
    * INSTEAD OF PRINTING OUT THE SORTED NAMES, PRINT OUT HOW MANY NAMES BEING WITH THE LETTER 'A'
    * INSTEAD ABOVE CHALLENGE
    * */
    public void fifthChallenge(){
        List<String> topNames2015 = Arrays.asList("Amelia","Olivia","emily","Isla","Ava","oliver","Jack","Charlie","harry","Jacob");
        topNames2015.stream().map((name) -> name.substring(0,1).toUpperCase() + name.substring(1))
                .filter((name) -> name.startsWith("A")).forEach(System.out::println);
    }

    public void sixthChallenge(){
        List<String> topNames2015 = Arrays.asList("Amelia","Olivia","emily","Isla","Ava","oliver","Jack","Charlie","harry","Jacob");
        topNames2015.stream().map(name -> name.substring(0,1).toUpperCase() + name.substring(1))
                .peek(System.out::println).sorted().forEach(System.out::println);
    }











}
