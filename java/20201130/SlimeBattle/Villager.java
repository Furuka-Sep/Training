public class Villager{
	String name;
	int hp=20;
	public Villager(String name){
		this.name=name;
	}
	public void attack(){
		int damage=new Random().nextInt(3)+1;
		System.out.println(this.name+"は、スライムに攻撃した！スライムに"+damage+"のダメージ！");	
	}
	public void escape(){
		int run=new Random().nextInt(100)+1;
		if(run<=70){
			System.out.println(this.name+"は、逃げ出した！");
		}else{

	}
}
