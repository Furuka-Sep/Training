import java.util.*;
public class hirose1{
	public static void main(String[] args){
		System.out.print("何回振る？>");
		int num=new Scanner(System.in).nextInt();
		int[] a=dice(num);
		int[]	b=dice(num);
		int sumA=0;
		int sumB=0;
		for(int i=0;i<num;i++){
			sumA+=a[i];
			sumB+=b[i];
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
