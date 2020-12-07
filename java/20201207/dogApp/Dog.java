public class Dog{
	public static int count=0;
	private int id;
	private String name;
	private int age;
	private double weight;
	public Dog(String name){
		this.setName(name);
		count++;
		this.setId(count);
	}
	public Dog(String name,int age){
		this(name);
		this.setAge(age);
	}
	public Dog(String name,int age,double weight){
		this(name,age);
		this.setWeight(weight);
	}
	public void agePlus(){
		this.age++;
	}
	public void waw(){
		System.out.println(this.name+"は吠えた");
	}
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
	public double getWeight(){
		return this.weight;
	}
	public int getId(){
		return this.id;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setAge(int age){
		if(age<0){
			this.age=0;
		}else{
			this.age=age;
		}
	}
	public void setWeight(double weight){
		if(weight < 500){
			throw new IllegalArgumentException("わんこの体重の値が異常です。g単位で入力してください");
		}else{
			this.weight=weight;
		}
	}
	public void setId(int id){
		this.id=id;
	}
}
