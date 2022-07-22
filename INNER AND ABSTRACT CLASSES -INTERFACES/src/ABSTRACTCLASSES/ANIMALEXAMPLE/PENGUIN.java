package ABSTRACTCLASSES.ANIMALEXAMPLE;

public class PENGUIN extends BIRD{
    public PENGUIN(String name) {
        super(name);
        this.printWingSize();
    }

    @Override
    public void printWingSize() {
        System.out.println("LARGE");
    }
}


