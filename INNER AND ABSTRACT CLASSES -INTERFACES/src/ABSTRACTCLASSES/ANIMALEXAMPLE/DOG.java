package ABSTRACTCLASSES.ANIMALEXAMPLE;

public abstract class DOG extends ANIMAL{
    public DOG(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " IS EATING");
    }

    @Override
    public void breathe() {
        System.out.println("BREATHE IN, BREATHE OUT");
    }

    public abstract void bark();

}
