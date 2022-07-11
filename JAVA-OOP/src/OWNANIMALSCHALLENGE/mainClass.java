package OWNANIMALSCHALLENGE;

import java.util.Scanner;


public class mainClass {
    public static void main(String[] args){
        mainClass mm = new mainClass();
        mm.executionOfProgram();
    }

    public void executionOfProgram(){

        ANIMALS[] animals = new ANIMALS[6];

        Scanner myScanner = new Scanner(System.in);
        ANT ant ;
        BUTTERFLY butterfly;
        CAT cat;
        DOG dog;
        FROG frog;
        SPIDER spider;

        for(int a = 0 ; a < animals.length ; a++){
            System.out.println("");
            switch (a){
                case 0:
                    System.out.println("ENTER INFORMATIONS ABOUT ANTS");
                    System.out.print("ENTER COLONY NAME: ");
                    String colonyName = myScanner.nextLine();
                    System.out.print("ENTER TOTAL ANT COUNT IN COLONY: ");
                    int antCount = myScanner.nextInt();
                    myScanner.nextLine();
                    ant = new ANT(colonyName,antCount);
                    animals[a] = ant;
                    break;
                case 1:
                    System.out.println("ENTER INFORMATIONS ABOUT BUTTERFLIES");
                    System.out.print("ENTER BUTTERFLY TYPE: ");
                    String butterflyType = myScanner.nextLine();
                    System.out.print("ENTER DOES BUTTERFLY HIBERNATE: ");
                    boolean doesItHibernate = myScanner.nextBoolean();
                    myScanner.nextLine();
                    butterfly = new BUTTERFLY(butterflyType,doesItHibernate);
                    animals[a] = butterfly;
                    break;
                case 2:
                    System.out.println("ENTER INFORMATIONS ABOUT CATS");
                    System.out.print("ENTER CAT WEIGHT:");
                    double catWeight = myScanner.nextDouble();
                    myScanner.nextLine();
                    System.out.print("ENTER CAT BREED:");

                    String catBreed = myScanner.nextLine();
                    cat = new CAT(catWeight,catBreed);
                    animals[a] = cat;
                    break;
                case 3:
                    System.out.println("ENTER INFORMATIONS ABOUT DOGS");
                    System.out.print("ENTER DOG WEIGHT:");
                    double dogWeight = myScanner.nextDouble();
                    myScanner.nextLine();
                    System.out.print("ENTER DOG BREED:");
                    String dogBreed =myScanner.nextLine();
                    dog = new DOG(dogWeight,dogBreed);
                    animals[a] = dog;
                    break;
                case 4:
                    frog = new FROG();
                    animals[a] = frog;
                    break;
                case 5:
                    System.out.println("ENTER INFORMATIONS ABOUT SPIDERS");
                    System.out.print("ENTER SPIDER EYE COUNT: ");
                    int eyeCount = myScanner.nextInt();
                    myScanner.nextLine();
                    System.out.print("ENTER SPIDER WEB HEIGHT: ");
                    double spiderWebHeight = myScanner.nextDouble();
                    myScanner.nextLine();
                    System.out.print("ENTER SPIDER WEB WIDTH: ");
                    double spiderWebWidth = myScanner.nextDouble();
                    myScanner.nextLine();
                    spider = new SPIDER(eyeCount,spiderWebHeight,spiderWebWidth);
                    animals[a] = spider;
                    break;
            }

        }

        printingAllAnimals(animals);


    }

    public void printingAllAnimals(ANIMALS[] animals){
        for(int a = 0 ; a < animals.length; a++) System.out.println("-----------------------------------\n"+animals[a].getClass().getSimpleName()+" INFORMATIONS\n"+animals[a].toString());
    }

}
