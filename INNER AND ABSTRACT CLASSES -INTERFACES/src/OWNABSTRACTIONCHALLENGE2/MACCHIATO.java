package OWNABSTRACTIONCHALLENGE2;

public class MACCHIATO extends COFFEE implements CARAMAL,CREMA,MILK,WATER{
    private double caramel;
    private double milk;
    private double crema;
    private double water;

    public MACCHIATO(double amountOfCoffee) {
        super("BIG CUP", "NORMAL BEAN", amountOfCoffee);
        setCremaML();
        setCaramelML();
        setMilkML();
        setWaterML();
        setFinalMililiter();

    }

    @Override
    public void properties(){
        super.properties(getClass().getSimpleName());
    }

    @Override
    public void drinkForCoffeeVarieties() {
        super.drink(getClass().getSimpleName());
    }

    @Override
    public double finalMililiter() {
        return getAmountOfCoffee()/5 +
                this.caramel+
                this.crema+
                this.milk+
                this.water;
    }

    @Override
    public void setFinalMililiter() {
        setHideFinalMililiter(finalMililiter());
    }




    @Override
    public void setCaramelML() {
        this.caramel = getAmountOfCoffee()/10;
    }

    @Override
    public double getCaramelML() {
        return this.caramel;
    }



    @Override
    public void setCremaML() {
        this.crema = getAmountOfCoffee()/10;
    }

    @Override
    public double getCremaML() {
        return this.crema;
    }

    @Override
    public void setMilkML() {
        this.milk = getAmountOfCoffee()/5;
    }

    @Override
    public double getMilkML() {
        return this.milk;
    }

    @Override
    public void setWaterML() {
        this.water = getAmountOfCoffee();
    }

    @Override
    public double getWaterML() {
        return this.water;
    }
}
