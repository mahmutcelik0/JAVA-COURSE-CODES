package INNERCLASSES.LOCALINNERCLASS;

public class EXAMPLECLASS {

    public static void ex(){
        System.out.println("OUTER CLASS");

        class MessagePrinter{
            public MessagePrinter(){
                System.out.println("INNER CLASS");
            }
        }
        MessagePrinter ms = new MessagePrinter();


    }

    public static void main(String[] args) {
        ex();
    }

}
