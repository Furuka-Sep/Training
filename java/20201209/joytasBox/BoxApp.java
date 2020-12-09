import java.util.*;
public class BoxApp{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Box red=new Box("赤","円形",1);
		Box blue=new Box("青","四角",2);
		Box green=new Box("緑","四角",3);
		ArrayList<Box> list=new ArrayList<>();
		list.add(red);
		list.add(blue);
		list.add(green);
		while(true){
			System.out.print("1. ボール投入 / 2. ボール取出 / 3. ボール総数表示 / 4. 終了>");
			int select=sc.nextInt();
			switch(select){
			case 1:
				for(int i=0;i<list.size();i++){
					list.get(i).displayInfo(i);
				}
				System.out.print("ボールを投入する箱の番号を入力して下さい >");
				int num=sc.nextInt();
					if(num >= list.size()||num < 0){
						System.out.println("箱の番号の入力が誤っています。");
					}else{
						System.out.print("投入するボールの個数を入力して下さい >");
						int ball=sc.nextInt();
				list.get(num).insertBalls(ball);
					}
				break;
			case 2:
				for(int i=0;i<list.size();i++){
					list.get(i).displayInfo(i);
				}
				System.out.print("ボールを取り出す箱の番号を入力して下さい >");
				int num2=sc.nextInt();
				System.out.print("取り出すボールの個数を入力して下さい >");
				int ball2=sc.nextInt();
				list.get(num2).removeBalls(ball2);
				break;
			case 3:
				Box.displayTotalNumber();
				break;
			default:
				return;
			}
		}
	}
}
