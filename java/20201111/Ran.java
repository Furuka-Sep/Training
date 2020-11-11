import java.util.*;
public class Ran{
	public static void main(String[] args){
		int[] nums=new int[100];
		for(int i=0;i<100;i++){
			int ran=new Random().nextInt(100);
			nums[i]=ran;
			System.out.print(nums[i]+",");
		}
		int i=0;
		for(;i<nums.length;i++){
			if(nums[i]==77){
				System.out.printf("%n最初の77のindexは"+i+"です");
				break;
			}
		}
		if(i==nums.length){
				System.out.printf("%n77はありませんでした");
		}
	}
}
