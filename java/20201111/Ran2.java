import java.util.*;
public class Ran2{
	public static void main(String[] args){
		int[] nums=new int[10];
		String[] evod=new String[10];
		for(int i=0;i<nums.length;i++){
			int ran=new Random().nextInt(10);
			nums[i]=ran;
			evod[i]=nums[i]%2==0 ? "偶数":"奇数";
		System.out.print(nums[i]+",");
		}
		System.out.println();
		System.out.println(Arrays.toString(evod));
	}
}
