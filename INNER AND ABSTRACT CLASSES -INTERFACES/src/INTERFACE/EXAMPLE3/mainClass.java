package INTERFACE.EXAMPLE3;

public class mainClass {
    public static void main(String[] args) {
        Car myCar = new Bugatti(4,2,2,2,6);
        System.out.println(myCar.toString());
        Car myCar2 = new McLaren(4,2,2,2,6);
        System.out.println(myCar2.toString());
    }
}
