package INTERFACE.EXAMPLE2;

public interface IBottle {

    String getNameOfBottle();
    void setMl(double ml);
    double getMl();
    String getBrand();
    void setBrand(String brand);
    boolean drinkFromBottle(double drinkMl);
    boolean getBottleCapSituation();
    void changeBottleCapSituation();



}
