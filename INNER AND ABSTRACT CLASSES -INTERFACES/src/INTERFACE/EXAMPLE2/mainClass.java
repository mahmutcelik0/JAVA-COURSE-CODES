package INTERFACE.EXAMPLE2;

public class mainClass {
    public static void main(String[] args) {
        IBottle wb = new MilkIBottle("PINAR",500,false);
        System.out.println(wb.toString());
        wb.changeBottleCapSituation();
        wb.drinkFromBottle(400);
        System.out.println(wb.toString());

    }
}
