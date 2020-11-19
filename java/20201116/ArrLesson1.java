import java.util.*;
public class ArrLesson1{
	public static void main(String[] args){
		int[][] scores=new int[3][4];
		for(int i=0;i<scores.length;i++){
			for(int j=0;j<scores[0].length;j++){
				int ran=new Random().nextInt(100)+1;
				scores[i][j]=ran;
				System.out.printf("%4d",scores[i][j]);
			}
			System.out.println();
		}
	}
}
