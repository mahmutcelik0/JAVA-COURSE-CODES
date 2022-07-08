package COMPOSITION.CHALLENGE;

public class BathRoom extends Room{
    private boolean isAlWC;
    private boolean isBathTub;
    private int fountainCount;
    private int mirrorCount;
    private String mirrorBranch;

    private String floorColor ;
    private String ceilingColor;
    private int floorWidth;
    private int floorHeight;
    private int doorCount;
    private int windowCount;

    public BathRoom(String floorColor, String ceilingColor, int floorWidth, int floorHeight, int doorCount, int windowCount, boolean isAlWC, boolean isBathTub, int fountainCount, int mirrorCount, String mirrorBranch) {
        super(floorColor, ceilingColor, floorWidth, floorHeight, doorCount, windowCount);
        this.isAlWC = isAlWC;
        this.isBathTub = isBathTub;
        this.fountainCount = fountainCount;
        this.mirrorCount = mirrorCount;
        this.mirrorBranch = mirrorBranch;
    }

    @Override
    public void informationAboutRoom(){
        super.informationAboutRoom();
        if(isAlWC) System.out.println("WC IS ALATURKA");
        else System.out.println("WC IS SITTABLE");
        if(isBathTub) System.out.println("BATH HAS A BATHTUB");
        else System.out.println("BATH HAS A SHOWER");
        System.out.println("FOUNTAIN COUNT: "+ fountainCount+
                "\nMIRROR COUNT: "+ mirrorCount+
                "\nMIRROR BRANCH: "+ mirrorBranch);
    }

    @Override
    public void liked(){
        super.liked("BATHROOM");
    }





    public boolean isAlWC() {
        return isAlWC;
    }

    public boolean isBathTub() {
        return isBathTub;
    }

    public int getFountainCount() {
        return fountainCount;
    }

    public int getMirrorCount() {
        return mirrorCount;
    }

    public String getMirrorBranch() {
        return mirrorBranch;
    }
}
