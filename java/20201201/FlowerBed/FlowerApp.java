import java.util.*;
public class FlowerApp{
	public static void main(String[] args){
		System.out.print("何色の花にしますか?>");
		String color=new Scanner(System.in).nextLine();
		System.out.print("種をいくつ植えますか?>");
		int seedNum=new Scanner(System.in).nextInt();
		FlowerBed f=new FlowerBed(color,seedNum);
		while(true){
			System.out.print("何をしますか？1..水汲み2..水撒き3..花壇を見る4..終了>");
			int choice=new Scanner(System.in).nextInt();
			switch(choice){
			case 1:
				f.drawWater();
				break;
			case 2:
				f.waterFlower();
				break;
			case 3:
				f.showStatus();
				break;
			case 4:
				System.out.println("アプリケーションを終了します");
				return;
			}
		}
	}
}
