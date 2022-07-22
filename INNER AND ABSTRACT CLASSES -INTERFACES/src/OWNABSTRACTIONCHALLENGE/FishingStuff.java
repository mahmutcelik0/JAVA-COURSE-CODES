package OWNABSTRACTIONCHALLENGE;

public abstract class FishingStuff {
    private int price;
    private int lifetime;
    private int productionYear;
    private double usersFeedbackPointAverage;

    public FishingStuff(int price, int lifetime, int productionYear, double usersFeedbackPointAverage) {
        this.price = price;
        this.lifetime = lifetime;
        this.productionYear = productionYear;
        this.usersFeedbackPointAverage = usersFeedbackPointAverage;
    }

    public abstract int catchedFishCount();
    public abstract double stuffDimension();
    public abstract double pullUpSpeed(double stuffDimension, int catchedFishCount);
    public abstract void catchFish();

    @Override
    public String toString(){
        return
                "\n----------------------------"+
                        "\nFISHING STUFF INFORMATIONS"+
                "\nPRICE: "+ this.price
                +"\nLIFETIME: "+ this.lifetime
                +"\nPRODUCTION YEAR: " +this.productionYear
                +"\nUSERS FEEDBACK POINT AVERAGE: " +this.usersFeedbackPointAverage;
    }

    public int getPrice() {
        return price;
    }

    public int getLifetime() {
        return lifetime;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public double getUsersFeedbackPointAverage() {
        return usersFeedbackPointAverage;
    }
}
