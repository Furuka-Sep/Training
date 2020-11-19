import java.util.*;
public class RanArr{
	public static void main(String[] args){
		int[] num=new int[5];
		for(int i=0;i<num.length;i++){
			int index=new Random().nextInt(100)+1;
			num[i]=index;
			System.out.println("num["+i+"]:"+index);
		}
	}
}

