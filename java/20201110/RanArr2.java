import java.util.*;
public class RanArr2{
	public static void main(String[] args){
		int[] nums1=new int[5];
		int[] nums2=new int[5];
		System.out.println("***nums1***");
		for(int i=0 ;i<nums1.length;i++){
			int index=new Random().nextInt(100)+1;
			nums1[i]=index;
			System.out.println(index);
		}
		System.out.println("***nums2***");
		for(int n=0;n<5;n++){
			nums2[n]=nums1[n]*3;
			System.out.println(nums2[n]);
		}
	}
}
