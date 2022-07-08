package POLYMORPHISM;

class Car {
    private boolean engine;
    private int cylinder;
    private int wheels;
    private  String name;

    public Car(String name , int cylinder){
        this.cylinder = cylinder;
        this.wheels = 4;
        this.engine = true;
        this.name = name;
    }

    public void startEngine(){
        System.out.println("CAR ENGINE IS STARTING");
    }

    public void accelerate(){
        System.out.println("CAR'S SPEED IS GETTING HIGHER");
    }

    public void brake(){
        System.out.println("CAR'S SPEED IS GETTING LOWER");
    }

    public String simpleName(){
        return getClass().getSimpleName();
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinder() {
        return cylinder;
    }

    public int getWheels() {
        return wheels;
    }

    public String getName() {
        return name;
    }
}

class Passat extends Car{
    public Passat(int cylinders) {
        super("PASSAT",cylinders);
    }

    @Override
    public void startEngine(){
        System.out.println("PASSAT ENGINE IS STARTING");
    }

    @Override
    public void accelerate(){
        System.out.println("PASSAT'S SPEED IS GETTING HIGHER");
    }

    @Override
    public void brake(){
        System.out.println("PASSAT'S SPEED IS GETTING LOWER");
    }
}

class Bugatti extends Car{
    public Bugatti(int cylinder){
        super("BUGATTI",cylinder);
    }

    @Override
    public void startEngine(){
        System.out.println("BUGATTI ENGINE IS STARTING");
    }

    @Override
    public void accelerate(){
        System.out.println("BUGATTI'S SPEED IS GETTING HIGHER");
    }

    @Override
    public void brake(){
        System.out.println("BUGATTI'S SPEED IS GETTING LOWER");
    }
}

class LIMUZIN extends Car{
    public LIMUZIN(int cylinder){
        super("LIMUZIN",cylinder);
    }

    @Override
    public void startEngine(){
        System.out.println("LIMUZIN ENGINE IS STARTING");
    }

    @Override
    public void accelerate(){
        System.out.println("LIMUZIN'S SPEED IS GETTING HIGHER");
    }

    @Override
    public void brake(){
        System.out.println("LIMUZIN'S SPEED IS GETTING LOWER");
    }

}
public class mainClass {
    public static void main(String[] args){
        Car myCar = new Car("AAA",12);
        myCar.startEngine();
        myCar.accelerate();
        myCar.brake();
        System.out.println(myCar.simpleName());
    }
}
