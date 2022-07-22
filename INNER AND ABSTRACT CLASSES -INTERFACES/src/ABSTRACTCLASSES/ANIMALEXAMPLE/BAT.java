package ABSTRACTCLASSES.ANIMALEXAMPLE;

public class BAT extends BIRD implements CanFly{
    public BAT(String name) {
        super(name);
        this.printWingSize();
        this.fly();
    }

    @Override
    public void printWingSize(){
        System.out.println("SMALL");
    }
    @Override
    public void fly() {
        System.out.println(getName()+ " can fly");
    }
}
