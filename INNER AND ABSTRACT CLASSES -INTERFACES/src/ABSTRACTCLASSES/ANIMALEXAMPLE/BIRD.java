package ABSTRACTCLASSES.ANIMALEXAMPLE;

public abstract class BIRD extends ANIMAL{
    public BIRD(String name) {
        super(name);
        this.eat();
        this.breathe();
    }

    @Override
    public void eat() {
        System.out.println(getName() + " IS PECKING");
    }

    @Override
    public void breathe() {
        System.out.println("BREATHE IN,BREATHE OUT");
    }

    public abstract void printWingSize();
}
