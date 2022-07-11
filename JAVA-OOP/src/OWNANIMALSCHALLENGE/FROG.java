package OWNANIMALSCHALLENGE;

public class FROG extends ANIMALS {
    private boolean stickySkin; //YAPISKAN CILT
    private int heartChambersCount;

    public FROG(){
        super("EGG","BUG",5.0,"GR",1,2,10);
        this.stickySkin = true;
        this.heartChambersCount = 3;
    }

    @Override
    public String toString(){
        return
                super.toString()
                +"\nSTICK SKIN: "+ this.stickySkin
                +"\nHEART CHAMBER COUNT: "+ this.heartChambersCount;
    }

    public boolean isStickySkin() {
        return stickySkin;
    }

    public int getHeartChambersCount() {
        return heartChambersCount;
    }
}
