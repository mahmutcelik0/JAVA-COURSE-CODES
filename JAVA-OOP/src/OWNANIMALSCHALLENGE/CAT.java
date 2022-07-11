package OWNANIMALSCHALLENGE;

public class CAT extends ANIMALS{
    private int boneCount;
    private boolean doesFallOnFourLegs;
    private String catBreed;

    public CAT(double weight, String catBreed){
        super("NORMAL","MEAT",weight,"KG",3,2,20);
        this.boneCount = 280;
        this.catBreed = catBreed;
        this.doesFallOnFourLegs = !(weight > 10);
    }

    @Override
    public String toString(){
        return
                super.toString()
                +"\nBONE COUNT: "+ this.boneCount
                +"\nDOES FALL ON FOUR LEGS: "+ this.doesFallOnFourLegs
                +"\nCAT BREED: " + this.catBreed;
    }


    public int getBoneCount() {
        return boneCount;
    }

    public boolean isDoesFallOnFourLegs() {
        return doesFallOnFourLegs;
    }

    public String getCatBreed() {
        return catBreed;
    }
}

