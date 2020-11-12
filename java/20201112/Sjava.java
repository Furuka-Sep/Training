import java.util.*;
public class Sjava{
	public static void main(String[] args){
		System.out.print("何人>");
		int num=new Scanner(System.in).nextInt();
		int[] hmp=new int[num];
		for(int i=0;i<hmp.length;i++){
		System.out.printf("%d人目の点数>",i+1);
		int score=new Scanner(System.in).nextInt();
		//上と下のつなげられる
		hmp[i]=score;
		}
		System.out.print(Arrays.toString(hmp));
	}
}
