package OWNABSTRACTIONCHALLENGE;

import java.util.Scanner;

public class FishingRod extends FishingStuff implements  IThrow{
    private static Scanner scanner = new Scanner(System.in);
    private String fishingRodName;
    private String typeOfFeed;
    private double ropeLength;

    public FishingRod(int price, int lifetime, int productionYear, double usersFeedbackPointAverage, String fishingRodName, String typeOfFeed, double ropeLength) {
        super(price, lifetime, productionYear, usersFeedbackPointAverage);
        this.fishingRodName = fishingRodName;
        this.typeOfFeed = typeOfFeed;
        this.ropeLength = ropeLength;
        System.out.println(this.toString());
        this.catchFish();
    }


    @Override
    public String toString(){
        return
                super.toString()+
                        "\nFISHING ROD NAME: "+ this.fishingRodName
                +"\nTYPE OF FEED: "+ this.typeOfFeed
                +"\nROPE LENGTH: "+ this.ropeLength
                +"\n";

    }

    @Override
    public void throwStuff(){
        System.out.println("FISHING ROD IS THROWING");
    }

    @Override
    public int catchedFishCount() {
        System.out.print("ENTER NUMBER CATCHED FISH COUNT:");
        int returnNumber = scanner.nextInt();
        scanner.nextLine();
        return returnNumber;
    }

    @Override
    public double stuffDimension() {
        System.out.print("ENTER ROD'S LENGTH (DOUBLE,):");
        double returnNumber = scanner.nextDouble();
        scanner.nextLine();
        return returnNumber;
    }

    /**
     * ROPELENGTH* STUFFDIMENSION / CATCHEDFISHCOUNT
     * */

    @Override
    public double pullUpSpeed(double stuffDimension, int catchedFishCount) {
        return ropeLength * stuffDimension / catchedFishCount;
    }


    @Override
    public void catchFish(){
        throwStuff();
        int catchedFishCount = this.catchedFishCount();
        double stuffDimension = this.stuffDimension();
        double pullUpSpeed = this.pullUpSpeed(stuffDimension,catchedFishCount);

        System.out.println(
                "YOU CAUGHT "+ catchedFishCount + " FISH"
                +"\nSUTFF DIMENSION: "+stuffDimension
                +"\nPULL UP SPEED: "+ pullUpSpeed
        );
    }




    public String getFishingRodName() {
        return fishingRodName;
    }

    public String getTypeOfFeed() {
        return typeOfFeed;
    }

    public double getRopeLength() {
        return ropeLength;
    }
}
