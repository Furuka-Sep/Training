import java.util.*;
public class MethodLesson4{
public static void main(String[] args){
		System.out.print("言葉>");
		String ward1=new Scanner(System.in).next();
		System.out.print("言葉>");
		String ward2=new Scanner(System.in).next();
		vsward(ward1,ward2);
	}
	static void vsward(String w1,String w2){
		if(w1.length() == w2.length()){
			System.out.println("引き分け");
		}else if(w1.length() > w2.length()){
			System.out.println(w1+"の勝ち");
		}else{
			System.out.println(w2+"の勝ち");
		}
	}
}
