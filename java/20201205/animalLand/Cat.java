public class Cat extends Animal{
	public Cat(String name){
		super(name);
	}
	@Override
	public void makeNoize(){
		System.out.println(this.name+"<Meow");
	}
	public void sleep(){
		System.out.println(this.name+"は膝の上で寝てる...");
	}
}
