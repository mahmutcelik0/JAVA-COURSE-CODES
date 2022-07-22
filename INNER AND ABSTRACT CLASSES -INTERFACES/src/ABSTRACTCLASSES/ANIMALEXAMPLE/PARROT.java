package ABSTRACTCLASSES.ANIMALEXAMPLE;

public class PARROT extends BIRD implements CanFly{
    public PARROT(String name) {
        super(name);
        this.printWingSize();
        this.fly();
    }

    @Override
    public void printWingSize() {
        System.out.println("MEDIUM");
    }

    @Override
    public void fly() {
        System.out.println(getName()+" can fly");
    }
}
