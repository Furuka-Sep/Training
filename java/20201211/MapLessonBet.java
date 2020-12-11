import java.util.*;
public class MapLessonBet{
	public static void main(String[] args){
		Random rnd=new Random();
		Map<Integer,Integer> map=new TreeMap<>();
		int num=0;
		int count=0;
		while(count==500){
			int value=0;
			while(true){
				num+=1;
				map.put(num,0);//これは仮
				Set<Integer> comp=new TreeSet<>();
				int check=0;
				int ran=rnd.nextInt(6)+1;
				comp.add(ran);
				for(int i=1;i<=6;i++){
					if(comp.contains(i)){
						check+=1;
					}
				}
				if(check==6){
					map.put(comp.size(),map.get(comp.size())+1);
					count+=1;
				}
				break;
			}
		}
		int sum=0;
		System.out.println("***************************結果*****************************");
		for(int i=1;i<=num;i++){
			if(sum<map.get(i)){
				sum=map.get(i);
			}
			System.out.print(i+"("+i*300+"):");
			int value2=map.get(i);
			for(int j=0;j<value2;j++){//これも仮
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("モード(最頻値):"+sum+"回("+(sum*300)+"円)");
	}
}
