package COMPOSITION.CHALLENGE;

public class diningRoom extends Room{
    private int tableCount;
    private String dinnerSetBrand;
    private int dinnerSetCount;
    private double marketPlaceOfDinnerSet;
    private String floorColor ;
    private String ceilingColor;
    private int floorWidth;
    private int floorHeight;
    private int doorCount;
    private int windowCount;


    public diningRoom(String floorColor, String ceilingColor, int floorWidth, int floorHeight, int doorCount, int windowCount, int tableCount, String dinnerSetBrand, int dinnerSetCount, double marketPlaceOfDinnerSet) {
        super(floorColor, ceilingColor, floorWidth, floorHeight, doorCount, windowCount);
        this.tableCount = tableCount;
        this.dinnerSetBrand = dinnerSetBrand;
        this.dinnerSetCount = dinnerSetCount;
        this.marketPlaceOfDinnerSet = marketPlaceOfDinnerSet;
    }


    @Override
    public void informationAboutRoom(){
        super.informationAboutRoom();
        System.out.println(
                "\nTABLE COUNT: "+ tableCount
                +"\nDINNER SET BRAND: "+ dinnerSetBrand
                +"\nDINNER SET COUNT: "+ dinnerSetCount
                +"\nMARKETPLACE OF DINNER SET: "+ marketPlaceOfDinnerSet
        );
    }

    @Override
    public void liked(){
        super.liked("DINING ROOM");
    }

    public int getTableCount() {
        return tableCount;
    }

    public String getDinnerSetBrand() {
        return dinnerSetBrand;
    }

    public int getDinnerSetCount() {
        return dinnerSetCount;
    }

    public double getMarketPlaceOfDinnerSet() {
        return marketPlaceOfDinnerSet;
    }


}
