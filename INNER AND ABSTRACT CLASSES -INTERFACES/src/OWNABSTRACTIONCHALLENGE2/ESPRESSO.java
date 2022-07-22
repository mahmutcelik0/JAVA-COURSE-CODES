package OWNABSTRACTIONCHALLENGE2;

public class ESPRESSO extends COFFEE{
    public ESPRESSO(double amountOfCoffee) {
        super("SMALL CUP", "DARK ROASTED BEANS", amountOfCoffee);
        setFinalMililiter();
    }

    @Override
    public void properties() {
        super.properties(getClass().getSimpleName());
    }

    /**
     * 5TE 1 ORANINDA ESPRESSO
     * */
    @Override
    public double finalMililiter(){
        return getAmountOfCoffee()/5;
    }

    @Override
    public void setFinalMililiter(){
        setHideFinalMililiter(finalMililiter());
    }

    @Override
    public void drinkForCoffeeVarieties(){
        super.drink(getClass().getSimpleName());
    }


}
