import java.util.*;
public class BuildApp{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		List<Building> list=new ArrayList<>();
		while(true){
			System.out.print("1.ビル建設:2.ビルを見る:3.全てのビルを見る:4.終わり|>");
			int select=sc.nextInt();
			switch(select){
				case 1:
					System.out.print("建物の幅を入力:");
					int width=sc.nextInt();
					Building b=new Building(width);
					list.add(b);
					break;
				case 2:
					if(list.isEmpty()){
						System.out.println("まずはビルを建てましょう");
					}else{
					;
					}
					break;
				case 3:
					if(list.isEmpty()){
						System.out.println("まずはビルを建てましょう");
					}else{
						Building.displayAll(list);
					}
					break;
				default:
					return;
			}
		}
	}
}
