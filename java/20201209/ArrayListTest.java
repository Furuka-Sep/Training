import java.util.*;
public class ArrayListTest{
	public static void main(String[] args){
		ArrayList<Integer> points=new ArrayList<Integer>();
		points.add(10);
		points.add(80);
		points.add(75);
		points.add(90);
		points.add(0,25);
		int removed=points.set(3,50);//25,10,80,50,90 //消される前に75をremovedに入れておいている
		System.out.println(points.get(1));//10
		System.out.println(removed);//75
		/*for(int i:points){
			System.out.println(i);
		}*/
		for(int i=0;i<points.size();i++){
			System.out.println(points.get(i));
		}
		if(points.size()>2){
		}
		if(points.size()>0){
		}
		if(points.isEmpty()){//配列の要素が空か
		}
		if(points.contains(90)){//その値が含まれているか
		}
		System.out.println(points.indexOf(80));//2
		System.out.println(points.indexOf(1000));//intを返すので普通存在しない-1が返ってくる
		//removed=points.remove(2); その値の要素を削除
		//points.clear();　すべての要素削除
		Integer i1=Integer.valueOf(16);
		int i2=i1.intValue();
	}
}
