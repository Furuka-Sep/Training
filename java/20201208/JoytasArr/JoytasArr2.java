import java.util.*;
public class JoytasArr2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("ArrayListを使ってみよう");
		System.out.println("Listにスライムを追加していってみよう");
		ArrayList<Slime> slimes=new ArrayList<>();
		while(true){
			System.out.print("スライムを追加する？|1.yes|2.no|>");
			int select=sc.nextInt();
			switch(select){
			case 1:
				System.out.print("追加するスライムの名前を決めてね");
				String name=sc.next();
				Slime s=new Slime(name);
				slimes.add(s);
				break;
			default:
				//for(int i=0;i<slimes.size();i++){
				for(Slime sl:slimes){
					sl.attack();
				}
				return;
			}
		}
	}
}
class Slime{
	String name;
	public Slime(String name){
		this.name=name;
		System.out.println(this.name+"が現れた！");
	}
	public void attack(){
		System.out.println(this.name+"の攻撃:5ポイントのダメージを与えた！");
	}
}
