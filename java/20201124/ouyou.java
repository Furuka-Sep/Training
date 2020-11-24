import java.util.*;
public class ouyou{
	public static void main(String[] args){
		System.out.print("何人>");
		int num=new Scanner(System.in).nextInt();
		System.out.print("何回振る>");
		int count=new Scanner(System.in).nextInt();
		for(int i=0;i<num;i++){
			
		}
	}
	static int[] createDiceArr(int count){
		int[] diceArr=new int[count];
		for(int i=0;i<diceArr.length;i++){
			diceArr[i]=new Random().nextInt(6)+1;
		}
		return diceArr;
	}
	static char[] createAlphArr(char first,int num){
		char alphArr=new char[num];
		for(int i=0;i<alphArr.length;i++){
			alphArr[i]=(char)(first+i);
		}
		return alphArr;
	}
	static boolean isSame(int[] nums){
		for(int i=1;i<nums.length;i++){
			if(first != nums[i]){
				return false;
			}
		}
		return true;
	}
	static int maxNum(int[] nums){
		int max=nums[0];
		for(int i=1;i<nums.length;i++){
			if(nums[i]>max){
				max=nums[i];
			}
		}
		return max;
	}
}
