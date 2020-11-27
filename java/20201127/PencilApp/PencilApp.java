import java.util.*;
public class PencilApp{
	public static void main(String[] args){
		System.out.print("何色の鉛筆を作りますか>");
		String color=new Scanner(System.in).nextLine();
		Pencil p=new Pencil(color);
		while(true){
			System.out.print("操作を入力 1.書く,2.情報を見る,3.終了");
			int choice=new Scanner(System.in).nextInt();
			switch(choice){
				case 1:
					p.write();
					break;
				case 2:
					p.info();
					break;
				case 3:
					p.exit();
					return;
			}
		}
	}
}
