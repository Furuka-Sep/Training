import java.util.*;
public class BingoApp{
	public static void main(String[] args){
		int n=5;
		int[][] card=makeCard(n);
		int[] ans=random99();
		showCard(card);
	}
	static int[] random99(){
		int[] nums=new int[99];
		for(int i=0;i<nums.length;i++){
			nums[i]=i+1;
		}
		for(int i=nums.length-1;i>0;i--){
			int index=new Random().nextInt(i+1);
      int tmp = nums[index];
			nums[index] = nums[i];
			nums[i]=tmp;
		}
		return nums;
	}
	static int[][] makeCard(int width){
		int[][] card=new int[width][width];
		int[] nums=random99();
		for(int i=0;i<width;i++){
			for(int j=0;j<width;j++){
				card[i][j]=nums[i*width+j];
			}
		}
		card[2][2]=0;
		return card;
	}
	static void showCard(int[][] card){
		for(int i=0;i<card.length;i++){
			for(int j=0;j<card[i].length;j++){
				String str;
				if(card[i][j]==0){
					str="@@";
				}else{
					str=String.valueOf(card[i][j]);
				}
				System.out.printf("%3s",str);
			}
			System.out.println();
		}
	}
	static boolean isSame(int[] line){
		boolean isSame=true;
		int first=line[0];
		for(int i=1;i<line.length;i++){
			if(first != line[i]){
				isSame=false;
				break;
			}
		}
		return isSame;
	}
}
