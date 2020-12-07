import java.util.*;
public class DogMain{
	public static void main(String[] args){
		Dog d1=new Dog("john");
		System.out.println(d1.getName());
		Dog d2=new Dog("Paul",2);
		d2.setWeight(4000d);
		System.out.printf("%s(%d)の体重は、%.1fです%n",d2.getName(),d2.getAge(),d2.getWeight());
		Dog d3=new Dog("George",3,2000d);
		d3.agePlus();
		System.out.printf("%s(%d)の体重は、%.1fです%n",d3.getName(),d3.getAge(),d3.getWeight());
		Dog[] dogs=new Dog[3];
		dogs[0]=d1;
		dogs[1]=d2;
		dogs[2]=d3;
		for(Dog d:dogs){
			d.waw();
			System.out.println(d.getId());
		}
	}
}
