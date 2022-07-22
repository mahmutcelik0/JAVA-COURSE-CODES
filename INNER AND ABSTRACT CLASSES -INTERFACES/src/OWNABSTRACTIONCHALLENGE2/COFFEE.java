package OWNABSTRACTIONCHALLENGE2;

import java.util.Scanner;

public abstract class COFFEE {
    private String cupSize;
    private String coffeeBeanVariety;
    private double amountOfCoffee;
    private double hideFinalMililiter;
    protected Scanner scanner = new Scanner(System.in);

    public COFFEE(String cupSize, String coffeeBeanVariety, double amountOfCoffee) {
        this.cupSize = cupSize;
        this.coffeeBeanVariety = coffeeBeanVariety;
        this.amountOfCoffee = amountOfCoffee;
    }


    public abstract void drinkForCoffeeVarieties();
    public abstract double finalMililiter();

    public abstract void setFinalMililiter();



    public void drink(String className) {
        System.out.println("YOU CAN "+getHideFinalMililiter()+" DRINK "+className);

        boolean canDrink = true;

        while(canDrink){
            System.out.print("HOW MUCH MILILITER DOU YOU WANT TO DRINK:");
            double oneDrink = scanner.nextDouble();
            scanner.nextLine();

            if(oneDrink >= getHideFinalMililiter()){
                System.out.println("YOU DRANK ALL "+className);
                setHideFinalMililiter(0);
                canDrink = false;
            }
            else{
                double remaind = getHideFinalMililiter() - oneDrink;
                setHideFinalMililiter(remaind);
                System.out.println("YOU HAVE "+getHideFinalMililiter() + " MORE "+ className);
                System.out.print("DOU YOU WANT TO DRINK AGAIN (TRUE OR FALSE):");
                canDrink = scanner.nextBoolean();
            }
        }

    }

    @Override
    public String toString(){
        return
                "CUP SIZE: "+this.cupSize
                +"\nCOFFEE BEAN VARIETY: "+this.coffeeBeanVariety
                +"\nAMOUNT OF PURE COFFEE: "+ this.amountOfCoffee;


    }

    public void properties(String className){
        System.out.println(
                "\n---------------------------------------\n"
                        +className+"\n"
                        +toString()

        );
    }

    public void properties(){
        properties(getClass().getSimpleName());
    }
    public String getCupSize() {
        return cupSize;
    }

    public String getCoffeeBeanVariety() {
        return coffeeBeanVariety;
    }

    public double getAmountOfCoffee() {
        return amountOfCoffee;
    }

    public double getHideFinalMililiter() {
        return hideFinalMililiter;
    }

    public void setHideFinalMililiter(double hideFinalMililiter) {
        this.hideFinalMililiter = hideFinalMililiter;
    }
}
