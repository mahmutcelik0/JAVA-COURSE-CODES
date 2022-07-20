package com.mahmutcelik;

public class RAM extends ComputerComponent{
    private int capacity;
    private String capacityBrim;
    private String ddrOrGddr;
    private int rNumber;

    public RAM(String model, double energyPerHour, double size, String usage, int price, int capacity, String capacityBrim, String ddrOrGddr, int rNumber) {
        super(model, energyPerHour, size, usage, price, RAM.class.getSimpleName());
        this.capacity = capacity;
        this.capacityBrim = capacityBrim;
        this.ddrOrGddr = ddrOrGddr;
        this.rNumber = rNumber;
    }

    @Override
    public String toString(){
        return
                super.toString()
                +"\nCAPACITY: "+ this.capacity + " "+this.capacityBrim
                +"\n"+this.ddrOrGddr + this.rNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getCapacityBrim() {
        return capacityBrim;
    }

    public String getDdrOrGddr() {
        return ddrOrGddr;
    }

    public int getrNumber() {
        return rNumber;
    }
}
