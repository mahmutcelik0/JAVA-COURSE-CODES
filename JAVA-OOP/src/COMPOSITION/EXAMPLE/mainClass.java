package COMPOSITION.EXAMPLE;

public class mainClass {
    public static void main(String[] args){
        Case theCase = new Case("220B","Dell","240",new Dimensions(20,20,5));
        //PCDE KULLANILACAK theCase NESNESI OLUSTURULDU
        Monitor theMonitor = new Monitor("27inch Beast","Acer",27,new Resolution(2540,1440));
        //PCDE KULLANILACAK theMonitor NESNESI OLUSTURULDU
        MotherBoard theMotherBoard = new MotherBoard("BJ-200","Asus",4,6,"v2.44");
        //PCDE KULLANILACAK theMotherBoard NESNESI OLUSTURULDU
        PC thePC = new PC(theCase,theMonitor,theMotherBoard);
        //PC CLASSINDAN NESNE OLUSTURDU VE YUKARDA OLUSTURULAN BILESENLER YOLLANDI
        //KUCUK PARCALAR COMPOSE EDILEREK PC OLUSTU


        thePC.powerUp();
    }
}
