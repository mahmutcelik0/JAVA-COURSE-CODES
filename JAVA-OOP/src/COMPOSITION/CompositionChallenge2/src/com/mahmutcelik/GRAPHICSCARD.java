package com.mahmutcelik;

public class GRAPHICSCARD extends ComputerComponent{
    private int numberOfFans;

    public GRAPHICSCARD(String model, double energyPerHour, double size, String usage, int price, int numberOfFans) {
        super(model, energyPerHour, size, usage, price, GRAPHICSCARD.class.getSimpleName());
        this.numberOfFans = numberOfFans;
    }

    @Override
    public String toString(){
        return
                super.toString()
                +"\nFAN COUNT: "+ this.numberOfFans;
    }

    public boolean isLiquidCoolerNecessary(){
        return (getEnergyPerHour()/this.numberOfFans > 50);
    }

    public int getNumberOfFans() {
        return numberOfFans;
    }
}
