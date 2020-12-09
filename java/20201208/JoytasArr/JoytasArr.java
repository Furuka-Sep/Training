import java.util.*;
public class JoytasArr{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<>();
		System.out.println("ArrayListを使ってみよう！");
		System.out.println("Listに数字をどんどん追加していってみよう");
		while(true){
			System.out.print("要素を追加するよ 数字を入れてね(0で終了):");
			int select=sc.nextInt();
			switch(select){
			case 0:
				System.out.println("――結果――");
				System.out.println("要素数:"+list.size());
				System.out.print("要素:");
				for(int i:list){
					System.out.print(i+",");
				}
				System.out.println("");
				return;
			default:	
				list.add(select);
				System.out.println(select+"をListに追加したよ");
				break;
			}
		}
	}
}
