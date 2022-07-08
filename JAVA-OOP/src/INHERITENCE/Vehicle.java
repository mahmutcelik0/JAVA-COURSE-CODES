package INHERITENCE;

public class Vehicle {
    private int speed;
    private String name;
    private double weight;

    public Vehicle(){
        this(0,"DEFAULT NAME",0.0);
    }
    public Vehicle(int speed, String name, double weight) {
        this.speed = speed;
        this.name = name;
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String toString(){
        return "VEHICLE NAME: "+name +
                "\nSPEED: "+ speed+
                "\nWEIGHT: "+ weight;
    }

    public void stop(){
        this.speed = 0;
    }

    public void move(int speed){
        System.out.println("VEHICLE IS MOVING AT "+ speed + " KM/H");
        this.speed = speed;
    }
}
