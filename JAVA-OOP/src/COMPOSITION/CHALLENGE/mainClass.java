package COMPOSITION.CHALLENGE;

public class mainClass {
    public static void main(String[] args){

    BathRoom bathRoom = new BathRoom("Black","White",20,30,1,1,false,true,3,2,"Herve van der Straeten");
    BedRoom bedRoom = new BedRoom("Black","White",20,30,1,1,true,"YATAS",10,1);
    childRoom childroom = new childRoom("Black","White",20,30,1,1,3,24,"ENJOY",8);
    diningRoom diningroom = new diningRoom("Black","White",20,30,1,1,1,"MASACIM",3,19999.99);
    livingRoom livingroom = new livingRoom("Black","White",20,30,1,1,1,2,"YATAS","HALICIM",4,"MaNga");

    House myHouse = new House(bathRoom,bedRoom,childroom,diningroom,livingroom,"DENIZLI");
    myHouse.informationAboutHome();


    }
}
