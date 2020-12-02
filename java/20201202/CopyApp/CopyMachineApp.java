import java.util.*;
public class CopyMachineApp{
	public static void main(String[] args){
		System.out.print("最初に給紙する枚数を入力してください>");
		int sheet=new Scanner(System.in).nextInt();
		CopyMachine cm=new CopyMachine(sheet);
		while(true){
			System.out.print("1.給紙/2.コピー/3.表示/4.終了>");
			int choice=new Scanner(System.in).nextInt();
			switch(choice){
			case 1:
				System.out.print("給紙する枚数を入力して下さい>");
				int sheet1=new Scanner(System.in).nextInt();
				cm.feedPaper(sheet1);
				break;
			case 2:
				System.out.print("コピーする枚数を入力して下さい>");
				int sheet2=new Scanner(System.in).nextInt();
				cm.copy(sheet2);
				break;
			case 3:
				cm.display();
				break;
			case 4:
				System.out.println("アプリケーションを終了します");
				return;
			}
		}
	}
}
class CopyMachine{
	int paper;
	public CopyMachine(int sheet){
		if(sheet<0){
			this.paper=0;
		}else{
			this.paper=sheet;
		}
	}
	public void feedPaper(int sheet){
		System.out.println(sheet+"枚給紙しました。");
		this.paper+=sheet;
	}
	public void copy(int sheet){
		if(this.paper<sheet){
			System.out.println(this.paper+"枚コピーしました。");
			this.paper=0;
		}else{
			System.out.println(sheet+"枚コピーしました。");
			this.paper-=sheet;
		}
	}
	public void display(){
		System.out.println("コピー可能な枚数は"+this.paper+"枚です。");
	}
}
