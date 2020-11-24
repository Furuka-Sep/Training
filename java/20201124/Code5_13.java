public class Code5_13{
	//int型配列を受け取り
	//配列内の要素すべてに1を加えるメソッド
	//mainもincArrayに渡した情報も同じ番地の物なので、incArrayで内容を変えてしまうとmainの配列も変わります。
	public static void incArray(int[] array){
		for(int i=0;i<array.length;i++){
			array[i]++;
		}
	}
	public static void intNum(int n){
		n++;
		System.out.println(n);
	}
	public static void main(String[] args){
		int[] array ={1,2,3};
		incArray(array);
		for(int i : array){
			System.out.println(i);
		}
		int n=10;
		intNum(n);
		System.out.println(n);
	}
}
