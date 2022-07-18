package com.mahmutcelik;

public class POWERSUPPLY extends ComputerComponent{
    private double energyCapacity;

    public POWERSUPPLY(String model, double energyPerHour, double size, String usage, int price , double energyCapacity) {
        super(model, energyPerHour, size, usage, price, POWERSUPPLY.class.getSimpleName());
        this.energyCapacity = energyCapacity;
    }

    @Override
    public String toString(){
        return super.toString()
                +"\nENERGY CAPACITY: " +this.energyCapacity;
    }

    public double getEnergyCapacity() {
        return energyCapacity;
    }
}
