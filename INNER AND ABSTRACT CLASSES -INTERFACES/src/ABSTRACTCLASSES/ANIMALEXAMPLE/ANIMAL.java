package ABSTRACTCLASSES.ANIMALEXAMPLE;

public abstract class ANIMAL {
    private String name;

    public ANIMAL(String name) {
        this.name = name;
    }

    public abstract void eat();
    public abstract void breathe();

    public String getName(){
        return this.name;
    }
}
