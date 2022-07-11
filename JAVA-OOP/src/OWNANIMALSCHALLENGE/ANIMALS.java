package OWNANIMALSCHALLENGE;

public class ANIMALS {
    private String reproductive; //UREME
    private String feeding;
    private double weight;
    private String weightBrim;
    private int age;
    private int eyeCount;
    private double height;

    public ANIMALS(String reproductive, String feeding, double weight, String weightBrim,int age, int eyeCount, double height) {
        this.reproductive = reproductive;
        this.feeding = feeding;
        this.weight = weight;
        this.weightBrim = weightBrim;
        this.age = age;
        this.eyeCount = eyeCount;
        this.height = height;

    }
    public ANIMALS(){
        this("DEFAULT","DEFAULT",0.0,"DEFAULT",0,0,0.0);
    }
    public void printAboutAnimal(){
        System.out.println(toString());
    }


    @Override
    public String toString(){
        return
                "REPRODUCTIVE: "+ this.reproductive
                +"\nFEEDING: " + this.feeding
                +"\nWEIGHT: "+ this.weight + weightBrim
                +"\nAGE: "+ this.age
                +"\nEYE COUNT: "+ this.eyeCount
                +"\nHEIGHT: "+ this.height;
    }



    public String getReproductive() {
        return reproductive;
    }

    public String getFeeding() {
        return feeding;
    }

    public double getWeight() {
        return weight;
    }

    public String getWeightBrim() {return weightBrim;}

    public int getAge() {
        return age;
    }

    public int getEyeCount() {
        return eyeCount;
    }

    public double getHeight() {
        return height;
    }

}
