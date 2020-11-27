import java.util.*;
public class MonkeyApp{
	public static void main(String[] args){
		System.out.print("サルの名前は>");
		String name=new Scanner(System.in).nextLine();
		System.out.print("サルの年齢は>");
		int age=new Scanner(System.in).nextInt();
		Monkey m=new Monkey(name,age);
		while(true){
			System.out.print("何をさせますか？1.挨拶,2.竹馬,3.逆立ち,4.終了>");
			int choice=new Scanner(System.in).nextInt();
			if(choice==1){
				m.greet();
			}else if(choice==2){
				m.takeuma();
			}else if(choice==3){
				m.sakadachi();
			}else{
				System.out.println("アプリケーションを終了します");
				break;
			}
		}
	}
}
