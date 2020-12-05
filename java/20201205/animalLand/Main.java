import java.util.*;
public class Main{
	public static void main(String[] args){
		Animal[] animals=new Animal[3];
		animals[0]=new Dog("John");
		animals[1]=new Cat("Mike");
		animals[2]=new Pig("Ham");
		for(Animal animal:animals){
			animal.makeNoize();
			if(animal instanceof Cat){
				((Cat)animals[1]).sleep();
			}
		}
		/*
		Cat c=(Cat)animals[1];
		c.sleep();
		*/
	}
}
