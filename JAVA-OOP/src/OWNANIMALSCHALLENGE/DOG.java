package OWNANIMALSCHALLENGE;

public class DOG extends ANIMALS{
    private int boneCount;
    private String dogBreed;
    private boolean isEducatedDog;

    public DOG(double weight,String dogBreed){
        super("NORMAL","MEAT",weight,"KG",5,2,200);
        this.boneCount = 200;
        this.dogBreed = dogBreed;
        this.isEducatedDog = dogBreed.toUpperCase().equals("HUSKY");
    }

    @Override
    public String toString(){
        return
                super.toString()
                +"\nBONE COUNT: "+ this.boneCount
                +"\nDOG BREED: "+ this.dogBreed
                +"\nIS EDUCATED DOG: "+ this.isEducatedDog;
    }

    public int getBoneCount() {
        return boneCount;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public boolean isEducatedDog() {
        return isEducatedDog;
    }
}
