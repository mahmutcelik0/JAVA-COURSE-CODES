package OWNANIMALSCHALLENGE;

public class SPIDER extends ANIMALS{
    private double spiderWebHeight;
    private double spiderWebWidth;
    private boolean doesHavePoison;

    public SPIDER(int eyeCount,double spiderWebHeight, double spiderWebWidth){
        super("EGG","BUG",10,"GR",5,eyeCount,10);
        this.spiderWebHeight = spiderWebHeight;
        this.spiderWebWidth = spiderWebWidth;
        this.doesHavePoison = (getAge() > 3);
    }


    public double spiderWebArea(){
        return spiderWebWidth*spiderWebHeight;
    }

    @Override
    public String toString(){
        return
                super.toString()
                +"\nSPIDER WEB AREA: "+ (spiderWebArea())
                +"\nDOES HAVE POISON: "+ this.doesHavePoison;
    }
    public double getSpiderWebHeight() {
        return spiderWebHeight;
    }

    public double getSpiderWebWidth() {
        return spiderWebWidth;
    }

    public boolean getDoesHavePoison() {
        return doesHavePoison;
    }
}
