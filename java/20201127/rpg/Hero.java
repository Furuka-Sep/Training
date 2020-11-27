public class Hero{
	String name;//名前の宣言
	int hp=100;			//HPの宣言
	public Hero(String name){
		this.name=name;
	}
	public Hero(String name,int hp){
		this.name=name;
		this.hp=hp;
	}
	public void sleep(){
		this.hp+=100;
		System.out.println(this.name+"は、眠って回復した！");
	}
	public void sit(int sec){
		this.hp+=sec;
		System.out.println(this.name+"は、"+sec+"秒座った！");
		System.out.println("HPが"+sec+"ポイント回復した");
	}
	public void slip(){
		this.hp -=5;
		System.out.println(this.name+"は、転んでしまった！");
		System.out.println("5のダメージ！");
	}
	public void run(){
		System.out.println(this.name+"は、逃げ出した！");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは"+this.hp+"でした");
	}
}
