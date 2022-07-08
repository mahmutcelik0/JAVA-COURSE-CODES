package INHERITENCE;

public class Car extends  Vehicle{
    private String handSteering;
    private int gearCount;

    public Car(int speed, String name, double weight, String handSteering, int gearCount){
        super(speed,name,weight);
        this.handSteering = handSteering;
        this.gearCount = gearCount;
    }

    public Car(){
        super(0,"DEFAULT CAR",0.0);
        this.handSteering = "DEFAULT STEER";
        this.gearCount = 0;
    }

    public String getHandSteering() {
        return handSteering;
    }

    public void setHandSteering(String handSteering) {
        this.handSteering = handSteering;
    }

    public int getGearCount() {
        return gearCount;
    }

    public void setGearCount(int gearCount) {
        this.gearCount = gearCount;
    }

    public String toString(){
        return super.toString() +
                "\nHAND STEERING: "+ handSteering+
                "\nGEAR COUNT: " + gearCount;
    }

    @Override
    public void move(int speed){
        System.out.println("CAR IS VEHICLE");
        super.move(speed);
    }

}
