import java.util.Arrays;
//import java.util.* でいままで入力してたjava.util.○○が○○だけで済む
public class ArrLesson3{
	public static void main(String[] args){
		//宣言と同時なら{}での代入ok
		int[] dataA={3,5,10};
		//こういった書き方もある
		String[] strs={"hoge","fuga","bar"};
		double[] nums={1,1,2,2,3,3};
		boolean[] bools={false,false,true,true};
		int[] dataB=new int[] {4,6,10};
		//配列の要素を全部回すパターン1
		for(int i=0;i < dataA.length;i++){
			System.out.println(dataA[i]);
		}
		//配列の要素を全部回すパターン2(※拡張for文)
		//未読の要素が消えるまで一個一個右から左に入れて出力
		for(int n : dataB){
			System.out.println(n);
		}
		for(int i=0;i<strs;length;i++){
			System.out.println(strs[i]);
		}
		for(String s : strs){
			System.out.println(s);
		}
		//配列の内容を出力([3,5,10]と出力される)
		System.out.println(Arrays.toString(dataA));
	}
}
