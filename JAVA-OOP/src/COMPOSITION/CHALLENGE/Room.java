package COMPOSITION.CHALLENGE;

import java.util.Scanner;

public class Room {
    private String floorColor ;
    private String ceilingColor;
    private int floorWidth;
    private int floorHeight;
    private int doorCount;
    private int windowCount;

    public Room(String floorColor, String ceilingColor, int floorWidth, int floorHeight, int doorCount, int windowCount) {
        this.floorColor = floorColor;
        this.ceilingColor = ceilingColor;
        this.floorWidth = floorWidth;
        this.floorHeight = floorHeight;
        this.doorCount = doorCount;
        this.windowCount = windowCount;
    }


    private int getArea(){
        return floorHeight*floorWidth;
    }

    public void informationAboutRoom(){
        System.out.println("AREAS OF FLOOR AND CEIL: "+ getArea()+
                            "\nCOLOR OF FLOOR: "+ getFloorColor()+
                            "\nCOLOR OF CEIL: "+ getCeilingColor()+
                            "\nWINDOW COUNT: "+ getWindowCount()+
                            "\nDOOR COUNT: "+ getDoorCount());
    }

    private static final Scanner scanner = new Scanner(System.in);

    //METHOD OVERLOADING LIKED
    public void liked(){

        System.out.print("DID YOU LIKED ROOM ATTRIBUTES:");
        boolean liked = scanner.nextBoolean();
        if(liked) System.out.println("WE ARE GRATEFUL");
        else System.out.println("WHAT SHOULD WE DO TO MAKE ROOM BETTER?");
    }
    public void liked(String roomName){
        System.out.print("DID YOU LIKED "+ roomName + " ATTRIBUTES:");
        boolean liked = scanner.nextBoolean();
        if(liked) System.out.println("WE ARE GRATEFUL FOR "+ roomName);
        else System.out.println("WHAT SHOULD WE DO TO MAKE "+ roomName + " BETTER?");
    }

    public Room(){
        this("DEFAULT COLOR","DEFAULT COLOR",0,0,0,0);
    }

    public String getFloorColor() {
        return floorColor;
    }

    public String getCeilingColor() {
        return ceilingColor;
    }

    public int getFloorWidth() {
        return floorWidth;
    }

    public int getFloorHeight() {
        return floorHeight;
    }

    public int getDoorCount() {
        return doorCount;
    }

    public int getWindowCount() {
        return windowCount;
    }
}
