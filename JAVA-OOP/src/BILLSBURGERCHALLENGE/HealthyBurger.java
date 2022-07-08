package BILLSBURGERCHALLENGE;

import java.util.Scanner;

public class HealthyBurger extends Hamburger{

    private int naturalSaltGram ;
    private int freshMintCount ;

    public HealthyBurger( String meat, int price){
        super("Brown Rye Bread Roll",meat,price,"Healthy Burger");
        super.setCounts();
        setCounts();
    }

    @Override
    protected void setCounts(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER FRESH MINT COUNT: ");
        this.freshMintCount = scanner.nextInt();
        System.out.print("ENTER NATURAL SALT GRAM COUNT: ");
        this.naturalSaltGram = scanner.nextInt();
    }

    @Override
    public void informationAboutBurger(){
        super.informationAboutBurger(10,5,naturalSaltGram,freshMintCount,"NATURAL SALT GRAM","FRESH MINT COUNT");
    }

    public int getNaturalSaltGram() {
        return naturalSaltGram;
    }

    public int getFreshMintCount() {
        return freshMintCount;
    }
}
