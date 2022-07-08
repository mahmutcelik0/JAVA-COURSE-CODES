package CONSTRUCTORS;



public class Dog extends Animal{
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;
    
    
    public Dog(String name,int size, int weight,int eyes,int legs,int tail, int teeth,String coat){
        super(name,1,1,size,weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
    @Override //animal classından extend edilme olduğu için ve eat metodu animal 
    //classı içinde olduğundan kullabilmek için @Override ekleriz yani Dog classından
    //ait eat() metodu oluşturuyoruz.
    public void eat(){
        System.out.println("Dog.eat() called");
        chew();
        super.eat(); //super.metodAdı kullanılarak superclass metodu cağırılır.
    }
    
    
    private void chew(){
        System.out.println("Dog.chew() called");
    }
    
    public void walk(){
        System.out.println("Dog.walk() called");
        super.move(5);
    }
    
    public void run(){
        System.out.println("Dog.run() called");
        move(40);
    }
    
    @Override
    public void move(int speed){
        System.out.println("Dog.move() called");
        moveLegs(speed);
    }
    
    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");
    }
    
}