import java.util.*;
public class Cat{
	Random rnd=new Random();
	char type;
	String name;
	int intimacy;
	static char[] types={'A','B','C'};
	Cat(){
		this.type=types[rnd.nextInt(3)];
	}
	public void collect(){
		System.out.println(this.type+"-type cat appeared!");
	}
	public void join(){
		System.out.println(this.name+" joined!");
	}
	public void play(){
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	public char getType(){
		return this.type;
	}
	public int getIntimacy(){
		return this.intimacy;
	}
}
