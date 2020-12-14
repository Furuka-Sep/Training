import java.util.*;
public class PersonApp{
	public static void main(String[] args){
		Person p=new Person();
		p.setAge(-128);
	}
}
class Person{
	int age;
	public void setAge(int age){
		if(age < 0){
			throw new IllegalArgumentException
				("年齢は0以上の数を指定すべきです。指定値="+age);
		}this.age=age;
	}
}
