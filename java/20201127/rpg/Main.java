import java.util.*;
public class Main{
	public static void main(String[] args){
		int n=new Random().nextInt(1);//これと根本は同じ
		Hero h=new Hero();//Heroクラスの呼び出し。番地にhを割り当て
		h.name="ロト";//hに名前を付ける
		h.sleep();//Heroクラスのsleepを実行
		System.out.println(h.hp);//hのhpを表示
		Hero h2=new Hero();
		h2.name="ジェシカ";
		h2.sleep();
		h2.hp-=10;
		System.out.println(h2.hp);
		Hero h3=new Hero();
		h3.name="ククール";
		h3.hp=200;
		h.sit(10);
		h2.sleep();
		h3.slip();
		Matango m1=new Matango();
		m1.hp=50;
		m1.suffix='A';
		Matango m2=new Matango();
		m2.hp=40;
		m2.suffix='B';
		m2.run();
		m1.run();
		h3.run();
	}
}
