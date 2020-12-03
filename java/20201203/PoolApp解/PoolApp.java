import java.util.Scanner;
public class PoolApp {
	public static void main(String[] args) {
		Pool pool=new Pool();
		Scanner s=new Scanner(System.in);
		while(true){
			System.out.print("1. 給水 / 2. 排水 / 3. 表示 / 4. 終了>");
			int select=s.nextInt();
			switch(select){
			case 1:
				double water;
				do{
					System.out.print("給水する水量を入力して下さい >");
					water=s.nextDouble();
					if(water<0){
						System.out.println("[給水量は正の値をいれてください。]");
					}
				}while(water < 0);
				pool.feedWater(water);
				break;
			case 2:
				do{
					System.out.print("排水する水量を入力して下さい >");
					water=s.nextDouble();
					if(water<0){
						System.out.println("[排水量は正の値をいれてください。]");
					}
				}while(water < 0);
				pool.drainWater(water);
				break;
			case 3:
				pool.display();
				break;
			default:
				System.out.println("アプリケーションを終了します。");
				s.close();
				System.exit(0);
			}
		}
	}
}
class Pool {
	private static final double MAX=600.0d;
	private double water;
	public Pool(){
		this.water=0.0;
	}
	public void feedWater(double water){
		double feed=this.water+water > MAX ? MAX-this.water:water;
		this.water += feed;
		System.out.printf("%.1f立方メートル給水しました。%n",feed);
		
	}
	public void drainWater(double water){
		double drain = this.water-water > 0 ? water : this.water;
		this.water -= drain;
		System.out.printf("%.1f立方メートル排水しました。%n", drain);
		
	}
	public void display(){
		System.out.printf("現在の水量は%.1f立方メートルです。%n", this.water);
	}
}
