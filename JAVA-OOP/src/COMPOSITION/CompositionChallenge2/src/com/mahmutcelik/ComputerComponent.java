package com.mahmutcelik;

public class ComputerComponent {
    private String model;
    private double energyPerHour;
    private double size;
    private String usage;
    private int price;
    private String componentName;

    public ComputerComponent(String model, double energyPerHour, double size, String usage, int price, String componentName) {
        this.model = model;
        this.energyPerHour = energyPerHour;
        this.size = size;
        this.usage = usage;
        this.price = price;
        this.componentName = componentName;
    }

    public String pricePerformance(){
        if(this.price/this.energyPerHour >1) return ("THIS "+this.componentName+" IS NOT PRICE PERFORMANCE COMPONENT");
        else return("THIS "+this.componentName+" IS PRICE PERFORMANCE COMPONENT");
    }

    @Override
    public String toString(){
        return
                "---------------------------------"
                +"\nCOMPONENT NAME: "+ this.componentName
                +"\nMODEL: " + this.model
                +"\nENERGY PER HOUR: " + this.energyPerHour
                +"\nSIZE: " +this.size
                +"\nUSAGE: " + this.usage
                +"\nPRICE: " + this.price + "\n"
                +this.pricePerformance();
    }


    public String getComponentName() {
        return componentName;
    }

    public String getModel() {
        return model;
    }

    public double getEnergyPerHour() {
        return energyPerHour;
    }

    public double getSize() {
        return size;
    }

    public String getUsage() {
        return usage;
    }

    public int getPrice() {
        return price;
    }
}
