import java.util.*;
public class Main{
	public static void main(String[] args){
		System.out.print("配列の要素を入力してください>");
		int num=new Scanner(System.in).nextInt();
		int[] arr=arrRandomRange(-10,10,num);
		int[] arrclone=arrClone(arr);
		Sysetm.out.println("配列を生成しました。");
		System.out.println(Arrays.toString(arr));
		System.out.print("1...元の配列を表示,2...配列を昇順ソート,3...配列を降順ソート,4...終了>");
		while(true){
			int choice=new Scanner(System.in).nextInt();
			if(choice==1){
				System.out.println(Arrays.toString(arr));
			}else if(choice==2){
				arrclone=arrSort(arrclone);
				System.out.println(Arrays.toString(arrclone));
			}else if(choise==3){
				boolean t=true;
				arrclone=arrSort(arrclone,t);
				System.out.println(Arrays.toString(arrclone));
			}else if(choise==4){
				System.out.println("アプリケーションを終了します");
				break;
			}
		}
	}
	//clone
	public static int[] arrClone(int[] arr){
		int[] clo= new int[arr];
		for(int i=0;i<clo.length;i++){
			clo[i]=i;
		}
		return clo;
	}
	//昇順
	public static void arrSort(int[] arr){
		//Array.sort(arr);
		for(int i=0;i<arr.length;i++){
			for(int j=arr.length;j>i;j--){
				if(arr[j]<arr[j-1]){
					int t=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=t;
				}
			}
		}
		return arr;
	}
	//降順
	public static void arrSort(int[] arr,boolean isDesc){
		for(int i=0;i<arr.length;i++){
			for(int j=arr.length;j>i;j--){
				if(arr[j]>arr[j-1]){
					int t=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=t;
				}
			}
		}
		return arr;
	}
	//シャッフル
	public static int[] arrRandomRange(int min,int max,int count){
		int[] arr=new int[count];
		for(int i=0;i<count;i++){
			int ran=new Random().nextInt(max*2+1)min;
			arr[i]+=ran;
		}
		return arr;
	}
}
