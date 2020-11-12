import java.util.*;
public class Quest{
	public static void main(String[] args){
		System.out.println("私の好きなことは");
		String[] hob={"1","2","3","4","5"};
		int ran=new Random().nextInt(5)+1;
		for(int i=0;i<hob.length-1;i++){
			int index=new Random().nextInt(nums.length-i);
			int temp=hob[index];
			hob[index]=hob[hob.length-1-i];
			hob[hob.length-1-i]=temp;
		}
		for(int i=0;i<ran;i++){
			
	}
}
