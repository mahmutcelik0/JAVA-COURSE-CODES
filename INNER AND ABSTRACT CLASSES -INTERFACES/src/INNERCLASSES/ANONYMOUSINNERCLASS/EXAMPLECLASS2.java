package INNERCLASSES.ANONYMOUSINNERCLASS;

class Coffee{
    private double pureCoffeeGram = 200;
    private double milkMililiter = 300;
    private double sugarGram = 10;
    private String nameOfCoffee = "AMERICANO";
    private double mixture = this.pureCoffeeGram + this.milkMililiter + this.sugarGram;

    @Override
    public String toString(){
        return
                "COFFEE GRAM: "+ this.pureCoffeeGram
                +"\nMILK MILILITER: "+ this.milkMililiter
                +"\nSUGAR GRAM: " + this.sugarGram
                +"\nNAME OF COFFEE: "+ this.nameOfCoffee;
    }

    public void printInfo(){
        System.out.println(this.toString());
    }

    public void drink(double sipMl){
        if(sipMl >= getMixture()){
            System.out.println("YOU HAVE FINISHED COFFEE");
        }
        else{
            setMixture(getMixture()-sipMl);
            System.out.println("YOU HAVE "+ getMixture() + " COFFEE");
        }
    }

    public double getPureCoffeeGram() {
        return pureCoffeeGram;
    }

    public double getMilkMililiter() {
        return milkMililiter;
    }

    public double getSugarGram() {
        return sugarGram;
    }

    public String getNameOfCoffee() {
        return nameOfCoffee;
    }

    public double getMixture() {
        return mixture;
    }

    public void setMixture(double mixture) {
        this.mixture = mixture;
    }


}


public class EXAMPLECLASS2 {

    static Coffee americano = new Coffee(){


        @Override
        public void drink(double sipMl){
            super.drink(sipMl);
        }

        @Override
        public void printInfo(){
            System.out.println("");
            super.printInfo();
        }
    };

    public static void main(String[] args) {
        americano.printInfo();
        americano.drink(100);
        americano.printInfo();
    }
}
