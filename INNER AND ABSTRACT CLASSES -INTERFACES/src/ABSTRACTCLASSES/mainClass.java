package ABSTRACTCLASSES;


import ABSTRACTCLASSES.ANIMALEXAMPLE.ANIMAL;
import ABSTRACTCLASSES.ANIMALEXAMPLE.BAT;
import ABSTRACTCLASSES.ANIMALEXAMPLE.PARROT;
import ABSTRACTCLASSES.ANIMALEXAMPLE.PENGUIN;

public class mainClass {
    public static void main(String[] args) {
        BAT bat = new BAT("BATMAN");
        System.out.println("");
        PARROT parrot = new PARROT("PARROT");
        System.out.println("");
        PENGUIN penguin = new PENGUIN("PENGUIN");


    }
}
