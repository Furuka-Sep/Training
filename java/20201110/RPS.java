import java.util.*;
public class RPS{
	public static void main(String[] args){
		System.out.println("じゃんけんをしましょう。");
		System.out.print("グー０,チョキ1,パー2>");
		int num=new Scanner(System.in).nextInt();
		String[] rps={"グー","チョキ","パー"};
		int index =new Random().nextInt(rps.length);
		if(num==index){
			System.out.printf("PCは%s%n引き分けです",rps[index]);
		}else if(num==0 && index==1 || num==1 && index==2 || num==2 && index==0){
			System.out.printf("PCは%s%nあなたの勝ちです",rps[index]);
		}else{
			System.out.printf("PCは%s%nあなたの負けです",rps[index]);
			//numに3を足せばnum-indexの答えに%3をし、余りが２なら勝ち、１なら負けとできる
		}
	}
}

