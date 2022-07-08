package INHERITENCE;

public class mainClass {
    public static void main(String[] args){
        Lamborghini lambo = new Lamborghini(300,100.5,
                "CIRCLE STEERING",0,true,
                "LAST POCKET");

        lambo.move(100);
        lambo.stop();
        System.out.println(lambo.getSpeed());

    }
}
