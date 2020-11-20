import java.util.*;
public class MethodLesson4{
	public static void main(String[] args){
		int n=sumOf(3,5);
		System.out.println(n);
		System.out.print("言葉>");
		String ward=new Scanner(System.in).next();
		ward=ward2(ward);
		System.out.println(ward);
		System.out.print("整数>");
		int a1=new Scanner(System.in).nextInt();
		System.out.print("整数>");
		int a2=new Scanner(System.in).nextInt();
		int nn=num(a1,a2);
		System.out.println("大きいほうは"+nn);

		System.out.println(decorateStr("Hello",2));
		System.out.println(decorateStr("Hello",1));
	}
	//戻り値のあるメソッド
	static int sumOf(int a,int b){
		return a+b;
	}
	static String ward2(String s){
		return "***" + s + "***";
	}
	static int num(int a1,int a2){
		return a1>a2 ? a1 : a2;
	}
	static String decorateStr(String str,int num){
		if(num % 2 == 0){
			return "***" + str + "***";
		}else{
			return "---" + str + "---";
		}
	}
	static void methodA(int a){
		if(a < 0){
			return
		}
		System.out.println(a);
	}
}
