public class Main{
	public static void main(String[] args){
		Goblin gob=new Goblin();
		WereWolf ww=new WereWolf();
		DeathBat db=new DeathBat();
		gob.attack();
		gob.run();
		ww.attack();
		ww.run();
		db.attack();
		db.run();
	}
}
