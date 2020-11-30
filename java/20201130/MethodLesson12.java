import java.util.*;
public class MethodLesson12{
	static void arrReverse(int[] arr){
		for(int i=0;i<arr.length/2;i++){
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i]=temp;
			arr[arr.length-1-i]=temp;
		}
	}
	public static void main(String[] args){
		int[] arr=new int[]{1,2,3,4,5};
		arrReverse(arr);
		System.out.println(Arrays.toString(arr));
	}
}
/*1.MethodLesson11.javaを作成する。
2.引数で受け取った配列を逆順にするメソッド
static void arrReverse(int[] arr){
処理
｝
を作成する。*/
