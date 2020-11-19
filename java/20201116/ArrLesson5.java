import java.util.*;
public class ArrLesson5{
	public static void main(String[] args){
		System.out.println("---掛け算表---");
		System.out.print("n(1~9)?>");
		int num=new Scanner(System.in).nextInt();
		int[][] qq=new int[num][9];
		for(int i=0;i<qq.length;i++){
			for(int j=0;j<9;j++){
				qq[i][j]=(i+1)*(j+1);
			}
		}
		for(int i=0;i<qq.length;i++){
			for(int j=0;j<9;j++){
				char c=(j < 8) ? '|' :' '; 
				System.out.printf("%3d%s",qq[i][j],c);
			}
			System.out.println();
		}
	}
}
