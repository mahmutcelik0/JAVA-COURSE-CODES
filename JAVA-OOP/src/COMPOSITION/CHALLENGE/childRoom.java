package COMPOSITION.CHALLENGE;

public class childRoom extends Room{
    private int bedCount;
    private int toyCount;
    private String toyBranch;
    private int drawerCount;

    private String floorColor ;
    private String ceilingColor;
    private int floorWidth;
    private int floorHeight;
    private int doorCount;
    private int windowCount;

    public childRoom(String floorColor, String ceilingColor, int floorWidth, int floorHeight, int doorCount, int windowCount, int bedCount, int toyCount, String toyBranch, int drawerCount) {
        super(floorColor, ceilingColor, floorWidth, floorHeight, doorCount, windowCount);
        this.bedCount = bedCount;
        this.toyCount = toyCount;
        this.toyBranch = toyBranch;
        this.drawerCount = drawerCount;
    }

    @Override
    public void informationAboutRoom(){
        super.informationAboutRoom();
        System.out.println("BED COUNT: "+ bedCount+
                "\nTOY COUNT: " + toyCount+
                "\nTOY BRANCH: " + toyBranch+
                "\nDRAWER COUNT: " + drawerCount);
    }


    @Override
    public void liked(){
        super.liked("CHILD ROOM");
    }

    public int getBedCount() {
        return bedCount;
    }

    public int getToyCount() {
        return toyCount;
    }

    public String getToyBranch() {
        return toyBranch;
    }

    public int getDrawerCount() {
        return drawerCount;
    }
}
