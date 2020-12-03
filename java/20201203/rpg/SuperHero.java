public class SuperHero extends Hero{
	boolean flying;
	public SuperHero(){
		System.out.println("SuperHeroのコンストラクタが動作");
	}
	//飛ぶ
	public void fly(){
		this.flying=true;
		System.out.println("飛び上がった");
	}
	//着地
	public void land(){
		this.flying=false;
		System.out.println("着地した");
	}
	//クラスの再定義(オーバーライド)
	@Override//←必須
	public void run(){
		System.out.println(this.name+"は撤退した");
	}
	@Override
	public void attack(Matango m){
		super.attack(m);
		if(this.flying){
			super.attack(m);
		}
	}
}
