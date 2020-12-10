import java.util.*;
public class SetQ{
	public static void main(String[] args){
		Set<String> colors=new HashSet<String>();
		colors.add("赤");
		colors.add("青");
		colors.add("黄");
		colors.add("青");
		colors.add("緑");
		colors.add("緑");
		colors.add("黒");
		colors.add("白");
		colors.add("青");
		colors.add("桃");
		colors.add("黄");
		colors.add("緑");
		colors.add("白");
		System.out.println("色は"+colors.size()+"種類");
		int count=0;
		for(String s:colors){
			if(s=="黒"){
				count+=1;
			}
		}
		if(count>0){
			System.out.println("黒は含まれています。");
		}else{
			System.out.println("黒は含まれていません");
		}
	}
}
