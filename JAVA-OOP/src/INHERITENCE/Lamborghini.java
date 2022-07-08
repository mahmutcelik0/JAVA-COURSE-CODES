package INHERITENCE;

public class Lamborghini extends Car {
    private boolean carWind;
    private String techPocket;

    public Lamborghini(int speed, double weight,
                       String handSteering, int gearCount, boolean carWind,
                       String techPocket){
        super(speed,"LAMBORGHINI",weight,handSteering,gearCount);
        this.carWind = carWind;
        this.techPocket = techPocket;
    }

    public Lamborghini(){
        super(0,"DEFAULT NAME",0.0,"DEFAULT STEERING",0);
        this.carWind = false;
        this.techPocket = "DEFAULT POCKET";
    }

    public boolean isCarWind() {
        return carWind;
    }

    public void setCarWind(boolean carWind) {
        this.carWind = carWind;
    }

    public String getTechPocket() {
        return techPocket;
    }

    public void setTechPocket(String techPocket) {
        this.techPocket = techPocket;
    }

    @Override
    public String toString(){
        return super.toString()+
                "\nCAR WIND: "+ carWind+
                "\nTECHNOLOGY POCKET: "+ techPocket;
    }

    @Override
    public void move(int speed){
        System.out.println("LAMBORGHINI IS CAR");
        super.move(speed);
    }

    public void somethingElse(){
        System.out.println("Lamgorghini.somethingElse() called");
    }
}
