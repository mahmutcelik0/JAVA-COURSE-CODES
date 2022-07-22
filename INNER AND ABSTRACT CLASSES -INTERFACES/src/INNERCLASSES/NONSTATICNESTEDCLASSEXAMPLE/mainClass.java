package INNERCLASSES.NONSTATICNESTEDCLASSEXAMPLE;

public class mainClass {
    public static void main(String[] args) {
        //Gear gr = new Gear(); //-> HATALI

        //DOGRU YAPI OLUSTURMAK ICIN ONCELIKLE
        // UPPERCLASS.INNERCLASS objectName = upperClassObject.new INNERCLASS();
        GearBox mcLaren = new GearBox(5);
        GearBox.Gear firstGear = mcLaren.new Gear(1,1.3);
    }
}
