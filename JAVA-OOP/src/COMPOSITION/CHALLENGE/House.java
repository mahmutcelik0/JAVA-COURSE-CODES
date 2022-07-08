package COMPOSITION.CHALLENGE;

import java.util.InputMismatchException;
import java.util.Scanner;
public class House {
    private BathRoom bathRoom;  //COMPOSITION
    private BedRoom bedRoom;
    private childRoom childroom;
    private diningRoom diningroom;
    private livingRoom livingroom;
    private int roomCount;
    private String location;

    public House(BathRoom bathRoom, BedRoom bedRoom, childRoom childroom, diningRoom diningroom, livingRoom livingroom, String location) {
        this.bathRoom = bathRoom;
        this.bedRoom = bedRoom;
        this.childroom = childroom;
        this.diningroom = diningroom;
        this.livingroom = livingroom;
        this.roomCount = 4;
        this.location = location;
    }

    public void informationAboutHome(){
        System.out.print("WHICH ROOM'S INFORMATION DO YOU WANT TO SEE (ENTER WITHOUT SPACE):");
        Scanner scanner = new Scanner(System.in);
        try{
            String roomToSee = scanner.nextLine();
            String newName = roomToSee.toUpperCase();
            switch (newName) {
                case "BATHROOM" -> bathRoom.informationAboutRoom();
                case "BEDROOM" -> bedRoom.informationAboutRoom();
                case "CHILDROOM" -> childroom.informationAboutRoom();
                case "DININGROOM" -> diningroom.informationAboutRoom();
                case "LIVINGROOM" -> livingroom.informationAboutRoom();
                default -> throw new InputMismatchException();
            }
        }
        catch (InputMismatchException e) {
            System.out.println("YOU'VE ENTERED WRONG INPUT");
            System.exit(0);
        }
    }

    public void liked(){
        Scanner scanner = new Scanner(System.in);
        boolean liked = scanner.nextBoolean();
        if(liked) System.out.println("WE ARE GRATEFUL");
        else System.out.println("WHAT SHOULD WE DO TO MAKE ROOM BETTER");
    }

    public BathRoom getBathRoom() {
        return bathRoom;
    }

    public BedRoom getBedRoom() {
        return bedRoom;
    }

    public childRoom getChildroom() {
        return childroom;
    }

    public diningRoom getDiningroom() {
        return diningroom;
    }

    public livingRoom getLivingroom() {
        return livingroom;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public String getLocation() {
        return location;
    }
}
