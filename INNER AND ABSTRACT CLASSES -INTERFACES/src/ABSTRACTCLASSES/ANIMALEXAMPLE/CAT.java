package ABSTRACTCLASSES.ANIMALEXAMPLE;

public class CAT extends ANIMAL{
    public CAT(String name) {
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


}
