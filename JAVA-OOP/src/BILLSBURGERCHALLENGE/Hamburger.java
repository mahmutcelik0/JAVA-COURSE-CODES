package BILLSBURGERCHALLENGE;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Hamburger {
    private String breadRollType;
    private String meat;
    private int price;
    private String name;

    private int lettuceCount = 0;
    private int tomatoCount = 0;
    private int pickleCount = 0;
    private int onionCount  = 0;

    private int lettucePrice = 1, tomatoPrice = 2, picklePrice = 1, onionPrice = 3;

    public Hamburger(String breadRollType, String meat,int price, String name) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
        this.name = name;
        if(getClass().getSimpleName().equals("Hamburger")) setCounts();
    }

    public void informationAboutBurger(){
        basicAdditionPrices();
        System.out.println("HAMBURGER'S FINAL PRICE IS: "+ basicHamburgerFinalPrice());
    }

    protected void informationAboutBurger(int firstAdditionPrice, int secondAdditionPrice,int firstAdditionCount ,int secondAdditionCount , String firstAdditionName , String secondAdditionName){
        basicAdditionPrices();
        System.out.println("ORDERED "+ firstAdditionName+" COUNT: " + firstAdditionCount + "-----" + " SINGLE " +firstAdditionName+ " PRICE: "+ firstAdditionPrice +"-----"+ " WHOLE " +firstAdditionName+ " PRICE: "+ firstAdditionCount*firstAdditionPrice);
        System.out.println("ORDERED " + secondAdditionName+ " COUNT: "+ secondAdditionCount + "-----" + " SINGLE " +secondAdditionName+ " PRICE: "+ secondAdditionPrice +"-----"+ " WHOLE " +secondAdditionName+ " PRICE: "+ secondAdditionCount*secondAdditionPrice);
        System.out.println("HAMBURGER'S FINAL PRICE IS: "+ (basicHamburgerFinalPrice() + firstAdditionCount*firstAdditionPrice + secondAdditionPrice*secondAdditionCount));
    }
    protected void setCounts(){
        try {
            Scanner scanner = new Scanner(System.in);
            for(int i = 0; i < 4 ; i++){
                System.out.print("ENTER COUNT OF ");
                switch (i) {
                    case 0 -> {
                        System.out.print("LETTUCE: ");
                        this.lettuceCount = scanner.nextInt();
                    }
                    case 1 -> {
                        System.out.print("TOMATO: ");
                        this.tomatoCount = scanner.nextInt();
                    }
                    case 2 -> {
                        System.out.print("PICKLE: ");
                        this.pickleCount = scanner.nextInt();
                    }
                    case 3 -> {
                        System.out.print("ONION: ");
                        this.onionCount = scanner.nextInt();
                    }
                }
            }
        }
        catch (InputMismatchException e){
            System.out.println("THERE IS A ERROR!");
            System.exit(0);
        }

    }
    private void basicAdditionPrices(){
        System.out.println("HAMBURGER'S BASE PRICE IS: "+ price);
        System.out.println("ORDERED LETTUCE COUNT: "+ lettuceCount + "-----" + " SINGLE LETTUCE PRICE: "+ lettucePrice +"-----"+ " WHOLE LETTUCE PRICE: "+ lettucePrice*lettuceCount);
        System.out.println("ORDERED TOMATO COUNT: "+ tomatoCount + "-----" + " SINGLE TOMATO PRICE: "+ tomatoPrice +"-----"+ " WHOLE TOMATO PRICE: "+ tomatoPrice*tomatoCount);
        System.out.println("ORDERED PICKLE COUNT: "+ pickleCount + "-----" + " SINGLE PICKLE PRICE: "+ picklePrice +"-----"+ " WHOLE PICKLE PRICE: "+ picklePrice*pickleCount);
        System.out.println("ORDERED ONION COUNT: "+ onionCount + "-----" + " SINGLE ONION PRICE: "+ onionPrice +"-----"+ " WHOLE ONION PRICE: "+ onionPrice*onionCount);

    }
    private int basicHamburgerFinalPrice(){
        return (price + lettucePrice*lettuceCount + tomatoPrice*tomatoCount + picklePrice*pickleCount + onionPrice*onionCount);
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
