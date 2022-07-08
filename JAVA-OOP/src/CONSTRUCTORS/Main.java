package CONSTRUCTORS;

/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		Animal animal = new Animal("SSS",1,1,100,200);
		Dog dog = new Dog("MYDOG",150,250,2,4,1,20,"HUSKY");
		dog.walk();
		System.out.println("--------------");
		dog.run();
	}
}
