package com.mahmutcelik;

public class MAINBOARD extends ComputerComponent{
    private int slotCount;
    private int currentRamCount;
    private RAM ram;
    private PROCESSOR processor;


    public MAINBOARD(String model, double energyPerHour, double size, String usage, int price, int slotCount, int currentRamCount, RAM ram, PROCESSOR processor) {
        super(model, energyPerHour, size, usage, price,MAINBOARD.class.getSimpleName() );
        this.slotCount = slotCount;
        this.currentRamCount = currentRamCount;
        this.ram = ram;
        this.processor = processor;
    }
    /**ISLEMCI VE RAMLERIN HARCADIKLARI ENERJI TOPLAMLARI ANAKARTTAN FAZLAYSA UYUMLU DEGILDIR*/
    public void compatibility(){
        double compNumber = ram.getEnergyPerHour()*this.currentRamCount + processor.getEnergyPerHour();
        if(compNumber > (double) getEnergyPerHour()) System.out.println("THESE COMPONENTS ARE NOT COMPATIBLE");
        else System.out.println("THESE COMPONENTS ARE COMPATIBLE");
    }

    @Override
    public String toString(){
        return
                super.toString()
                +"\nRAM SLOT COUNT: "+ this.slotCount
                +"\nCURRENT RAM COUNT: "+this.currentRamCount;
    }

    public int getSlotCount() {
        return slotCount;
    }

    public int getCurrentRamCount() {
        return currentRamCount;
    }

    public RAM getRam() {
        return ram;
    }

    public PROCESSOR getProcessor() {
        return processor;
    }
}
