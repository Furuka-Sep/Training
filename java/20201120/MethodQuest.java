import java.util.*;
public class MethodQuest{
	public static void main(String[] args){
		//1
		System.out.print("月>");
		int m=new Scanner(System.in).nextInt();
		if(m >= 1 && m <= 12){
			int days=month(m);
			System.out.println(m+"月の日数は"+days+"日です");
		}else{
			System.out.println("その値は無効です");
		}
		//2
		System.out.print("繰り返す文字>");
		String str=new Scanner(System.in).next();
		System.out.print("何回>");
		int num=new Scanner(System.in).nextInt();
		str=loop(str,num);
		System.out.println(str);
		//3
		System.out.print("体重は>");
		double wei=new Scanner(System.in).nextDouble();
		System.out.print("身長は>");
		double hei=new Scanner(System.in).nextDouble();
		double bmi=0;
		bmi=calcBMI(wei,hei);
		System.out.printf("体重%.1f:身長%.1fのBMIは%.1fです%n",wei,hei,bmi);
		//4
		System.out.println("***TriangleCalculator***");
			
		while(true){
		System.out.print("どうする？1...三角形の面積を求む0...やめる");
		int num=new Scanner(System.in).nextInt();
		if(num == 0){
			System.out.println("アプリケーションを終了します。");
			break;
		}else if(num == 1){
		System.out.print("底辺を入力>");
		double bot=new Scanner(System.in).nextDouble();
		System.out.print("高さを入力>");
		double trhei=new Scanner(System.in).nextDouble();
		double ans=0;
		ans=Tri(bot,trhei);
		System.out.printf("底辺:%.2f,高さ:%.2fの面積は%.2fです",bot,trhei,ans);
		}else{
			System.out.println("error");
			break;
		}
	}
	public static int month(int month){
		if(month == 2){
			month=28;
		}else if(month == 4 || month == 6 || month == 9 || month == 11){
			month=30;
		}else{
			month=31;
		}
		return month;
	}
	public static String loop(String str,int num){
			String x="";
		for(int i=0;i<num;i++){
			x += str; 
		}
		return x;
	}
	static double calcBMI(double weightKg,double heightCm){
		double bmi=0;
		heightCm=heightCm/100;
		bmi = weightKg / (heightCm * heightCm);
		return bmi;
	}
}
//これ問題とちゅう
