package COMPOSITION.CHALLENGE;

public class BedRoom extends Room{
    private boolean isDoubleBed ;
    private String bedBranch;
    private int drawerCount; //CEKMECE
    private int TVCount;
    private String floorColor ;
    private String ceilingColor;
    private int floorWidth;
    private int floorHeight;
    private int doorCount;
    private int windowCount;
    public BedRoom(String floorColor, String ceilingColor, int floorWidth, int floorHeight, int doorCount, int windowCount, boolean isDoubleBed, String bedBranch, int drawerCount, int TVCount) {
        super(floorColor, ceilingColor, floorWidth, floorHeight, doorCount, windowCount);
        this.isDoubleBed = isDoubleBed;
        this.bedBranch = bedBranch;
        this.drawerCount = drawerCount;
        this.TVCount = TVCount;
    }

    @Override
    public void informationAboutRoom(){
        super.informationAboutRoom();
        if(isDoubleBed) System.out.println("BED IS FOR DOUBLE PERSON");
        else System.out.println("BED IS FOR SINGLE PERSON");
        System.out.println("BED BRANCH: "+ bedBranch+
                            "\nDRAWER COUNT: "+ drawerCount+
                            "\nTV COUNT: " + TVCount);
    }

    @Override
    public void liked(){
        super.liked("BED ROOM");
    }

    public boolean isDoubleBed() {
        return isDoubleBed;
    }

    public String getBedBranch() {
        return bedBranch;
    }

    public int getDrawerCount() {
        return drawerCount;
    }

    public int getTVCount() {
        return TVCount;
    }
}
