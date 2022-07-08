package CLASSES;

public class Car {
    private int wheels;
    private int doors;
    private String engine;
    private String model;
    private String color;

    public void setDoors(int doors){
        this.doors = doors;
    }

    public int getDoors(){
        return this.doors;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return this.model;
    }
}
