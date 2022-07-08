package BILLSBURGERCHALLENGE;

import java.util.Scanner;

public class DeluxeHamburger extends Hamburger{
    private int chips;
    private int drinks;

    public DeluxeHamburger(String meat, int price){
        super("DELUXE BREAD",meat,price, "DELUXE HAMBURGER");
        super.setCounts();
        setCounts();
    }


    @Override
    protected void setCounts(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER CHIPS COUNT: ");
        this.chips = scanner.nextInt();
        System.out.print("ENTER DRINKS COUNT: ");
        this.drinks = scanner.nextInt();
    }

    @Override
    public void informationAboutBurger(){
        super.informationAboutBurger(20,20,chips,drinks,"CHIPS","DRINKS");
    }

    public int getChips() {
        return chips;
    }

    public int getDrinks() {
        return drinks;
    }
}
