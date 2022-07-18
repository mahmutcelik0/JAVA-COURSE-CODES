package com.mahmutcelik;

public class PROCESSOR extends ComputerComponent{
    private double speed;
    private String brim;
    private double amountOfThermalPaste;

    public PROCESSOR(String model, double energyPerHour, double size, String usage, int price, double speed, String brim, double amountOfThermalPaste) {
        super(model, energyPerHour, size, usage, price, PROCESSOR.class.getSimpleName());
        this.speed = speed;
        this.brim = brim;
        this.amountOfThermalPaste = amountOfThermalPaste;
    }
    @Override
    public String toString(){
        return
                super.toString()
                +"\nSPEED: "+this.speed + " "+ this.brim
                +"\nAMOUNT OF THERMAL PASTE: "+ this.amountOfThermalPaste
                +"\nREMAINDER THERMAL PASTE: " + this.remaindThermalPaste();
    }

    private double usageOfThermalPaste(){
        return this.speed + this.getEnergyPerHour();
    }
    public double remaindThermalPaste(){
        return this.amountOfThermalPaste - usageOfThermalPaste();
    }
    public double getSpeed() {
        return speed;
    }

    public String getBrim() {
        return brim;
    }

    public double getAmountOfThermalPaste() {
        return amountOfThermalPaste;
    }
}
