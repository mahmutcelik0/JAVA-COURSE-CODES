package com.mahmutcelik;

public class SSD extends ComputerComponent{
    private int capacity;
    private String capacityBrim;
    private int writeSpeed;
    private int readSpeed;
    private String speedBrim;

    public SSD(String model, double energyPerHour, double size, String usage, int price, int capacity, String capacityBrim, int writeSpeed, int readSpeed, String speedBrim) {
        super(model, energyPerHour, size, usage, price, SSD.class.getSimpleName());
        this.capacity = capacity;
        this.capacityBrim = capacityBrim;
        this.writeSpeed = writeSpeed;
        this.readSpeed = readSpeed;
        this.speedBrim = speedBrim;
    }

    @Override
    public String toString(){
        return super.toString()
                +"\nCAPACITY: " + this.capacity + " "+ this.capacityBrim
                +"\nREAD SPEED: "+ this.readSpeed + " "+this.speedBrim
                +"\nWRITE SPEED: " +this.writeSpeed+ " " + this.speedBrim;
    }


    public int getCapacity() {
        return capacity;
    }

    public String getCapacityBrim() {
        return capacityBrim;
    }

    public int getWriteSpeed() {
        return writeSpeed;
    }

    public int getReadSpeed() {
        return readSpeed;
    }

    public String getSpeedBrim() {
        return speedBrim;
    }
}
