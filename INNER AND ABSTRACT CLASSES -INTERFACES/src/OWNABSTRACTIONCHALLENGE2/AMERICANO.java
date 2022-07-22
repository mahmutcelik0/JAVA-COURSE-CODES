package OWNABSTRACTIONCHALLENGE2;

public class AMERICANO extends COFFEE implements  WATER{
    private double water;
    public AMERICANO(double amountOfCoffee) {
        super("MIDDLE CUP", "DARK BEAN", amountOfCoffee);
        setWaterML();
        setFinalMililiter();

    }

    @Override
    public void properties() {
        super.properties(getClass().getSimpleName());
        System.out.println("WATER ML: "+ this.water);
    }

    @Override
    public void setWaterML() {
        this.water = getAmountOfCoffee();
    }

    @Override
    public double getWaterML() {
        return this.water;
    }

    @Override
    public void drinkForCoffeeVarieties() {
        super.drink(getClass().getSimpleName());
    }

    /**
     * 5TE 1 ORANINDA KAHVE 4 TE 1 ORANINDA SU
     * */
    @Override
    public double finalMililiter() {
        return (getAmountOfCoffee()/5.0 + getWaterML()/4.0);
    }

    @Override
    public void setFinalMililiter() {
        setHideFinalMililiter(finalMililiter());
    }
}
