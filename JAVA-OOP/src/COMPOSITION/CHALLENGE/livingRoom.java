package COMPOSITION.CHALLENGE;

public class livingRoom extends Room{
    private int TVCount;
    private int sofaCount;
    private String sofaBranch;
    private String carpetBranch;
    private int posterCount;
    private String personOnPosters;
    private String floorColor ;
    private String ceilingColor;
    private int floorWidth;
    private int floorHeight;
    private int doorCount;
    private int windowCount;


    public livingRoom(String floorColor, String ceilingColor, int floorWidth, int floorHeight, int doorCount, int windowCount, int TVCount, int sofaCount, String sofaBranch, String carpetBranch, int posterCount, String personOnPosters) {
        super(floorColor, ceilingColor, floorWidth, floorHeight, doorCount, windowCount);
        this.TVCount = TVCount;
        this.sofaCount = sofaCount;
        this.sofaBranch = sofaBranch;
        this.carpetBranch = carpetBranch;
        this.posterCount = posterCount;
        this.personOnPosters = personOnPosters;
    }

    @Override
    public void liked(){
        super.liked("BED ROOM");
    }

    @Override
    public void informationAboutRoom(){
        super.informationAboutRoom();
        System.out.println(
                "TV COUNT: "+ TVCount
                        +"\nSOFA COUNT: "+ sofaCount
                        +"\nSOFA BRANCH: "+ sofaBranch
                        +"\nCARPET BRANCH: "+ carpetBranch
                        +"\nPOSTER COUNT: "+ posterCount
                        +"\nPERSON ON POSTERS: "+ personOnPosters
        );
    }


    public int getTVCount() {
        return TVCount;
    }

    public int getSofaCount() {
        return sofaCount;
    }

    public String getSofaBranch() {
        return sofaBranch;
    }

    public String getCarpetBranch() {
        return carpetBranch;
    }

    public int getPosterCount() {
        return posterCount;
    }

    public String getPersonOnPosters() {
        return personOnPosters;
    }
}
