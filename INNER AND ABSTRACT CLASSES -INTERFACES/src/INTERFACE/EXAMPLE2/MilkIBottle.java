package INTERFACE.EXAMPLE2;

public class MilkIBottle implements IBottle {
    private String brand;
    private double mililiter;
    private boolean bottleCapSituation;

    public MilkIBottle(String brand){
        this(brand,1000,false);
    }
    public MilkIBottle(String brand, double mililiter){
        this(brand,mililiter,false);
    }
    public MilkIBottle(String brand, double mililiter, boolean bottleCapSituation){
        this.brand = brand;
        this.mililiter = mililiter;
        this.bottleCapSituation = bottleCapSituation;
    }

    @Override
    public String toString(){
        return
                "\n---------------------------\n"+
                        "BOTTLE BRAND: "+ this.brand
                        +"\nMILILITER: "+ this.mililiter
                        +"\nBOTTLE CAP SITUATION: "+ this.bottleCapSituation+"\n---------------------------\n";
    }

    @Override
    public boolean drinkFromBottle(double drinkMl){
        if(!bottleCapSituation){
            System.out.println("HOU HAVE TO OPEN BOTTLE CAP");
            return false;
        }
        else{
            if(mililiter< drinkMl){
                System.out.println("THERE IS NOT ENOUGH MILK TO DRINK");
                return false;
            }
            else{
                System.out.println("YOU DRANK "+ drinkMl + " ML MILK");
                this.mililiter = this.mililiter- drinkMl;
                return true;
            }
        }
    }

    @Override
    public boolean getBottleCapSituation(){
        return this.bottleCapSituation;
    }

    @Override
    public String getNameOfBottle(){
        return MilkIBottle.class.getSimpleName();
    }

    @Override
    public void setMl(double ml){
        this.mililiter = ml;
    }

    @Override
    public double getMl(){
        return this.mililiter;
    }

    @Override
    public String getBrand(){
        return this.brand;
    }

    @Override
    public void setBrand(String brand){
        this.brand = brand;
    }



    @Override
    public void changeBottleCapSituation(){
        this.bottleCapSituation = !bottleCapSituation;
    }



}
