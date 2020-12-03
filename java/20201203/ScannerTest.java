import java.util.*;
public class ScannerTest{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("好きな数字は>");
		int num=sc.nextInt();/*ここで空読み */sc.nextLine();
		System.out.print("名前>");
		String name=sc.nextLine();//nextLineは改行コード(Enter)も読み込んでしまう
		System.out.println(name+"さんの好きな数字は"+num+"ですね！");
	}
}
