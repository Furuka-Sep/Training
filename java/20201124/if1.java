import java.util.*;
public class if1{
	public static void main(String[] args){
		System.out.print("何回振る？>");
		int num=new Scanner(System.in).nextInt();
		int[] a=dice(num);
		int[]	b=dice(num);
		int[] sum=new int[2];
		for(int i=0;i<sum.length;i++){
			for(int j=0;j<a.length;j++){
				sum
			}
		}
		System.out.println("Aさん:"+Arrays.toString(a)+"合計:"+sumA);
		System.out.println("Bさん:"+Arrays.toString(b)+"合計:"+sumB);
		if(sumA==sumB){
			System.out.println("引き分け");
		}else if(sumA>sumB){
			System.out.println("Aさんの勝ち");
		}else{
			System.out.println("Bさんの勝ち");
		}
	}
	static int[] dice(int num){
		int[] nums=new int[num];
		for(int i=0;i<num;i++){
			int score=new Random().nextInt(6)+1;
			nums[i]=score;
		}
		return nums;
	}
}
