import java.util.*;
public class PoolApp{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Pool p=new Pool();
		while(true){
			System.out.print("1.給水/2.排水/3.表示/4.終了>");
			int select=sc.nextInt();
			switch(select){
			case 1:
				System.out.print("給水する水量を入力して下さい>");
				double water;
				water=sc.nextDouble();
				p.feedWater(water);
				break;
			case 2:
				System.out.print("排水する水量を入力して下さい>");
				water=sc.nextDouble();
				p.drainWater(water);
				break;
			case 3:
				p.display();
				break;
			default:
				System.out.println("アプリケーションを終了します");
				return;
			}
		}
	}
}
class Pool{
	double water;
	public Pool(){
		this.water=0.0;
	}
	public void feedWater(double water){
		if(water<=0){
			System.out.println("正の値を入れて下さい");
		}else if(water>600.0){
			this.water=600.0;
			System.out.printf("%.1f立方メートル給水しました※満水です%n",this.water);
		}else{
			this.water+=water;
			System.out.printf("%.1f立方メートル給水しました%n",this.water);
		}
	}
	public void drainWater(double water){
		if(this.water==0){
			System.out.println("排水する水がありません");
		}else if(water<=0){
			System.out.println("正の値を入れてください");
		}else if(this.water<=water){
			System.out.printf("立方メートル排水しました%n",this.water);
			this.water=0.0;
		}else{
			this.water-=water;
			System.out.printf("立方メートル排水しました。%n",water);
		}
	}
	public void display(){
		System.out.printf("現在の水量は%.1f立方メートルです%n",this.water);
	}
}
