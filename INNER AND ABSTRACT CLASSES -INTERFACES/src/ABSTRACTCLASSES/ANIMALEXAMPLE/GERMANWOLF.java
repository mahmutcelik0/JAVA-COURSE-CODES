package ABSTRACTCLASSES.ANIMALEXAMPLE;

public class GERMANWOLF extends DOG{
    public GERMANWOLF(String name) {
        super(name);
    }

    @Override
    public void bark() {
        System.out.println(getName() + " IS BARKING");
    }
}
