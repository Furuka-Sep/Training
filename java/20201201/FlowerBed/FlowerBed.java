import java.util.*;
public class FlowerBed{
	final int MAXWATER=3;
	String color;
	int seedNum;
	int bloom;
	int water;
	public FlowerBed(String color,int seedNum){
		this.color=color;
		this.seedNum=seedNum;
	}
	public void drawWater(){
		if(this.water==MAXWATER){
			System.out.println("水は満杯です");
		}else{
			System.out.println("水を"+(MAXWATER-this.water)+"杯汲みました。");
			this.water=MAXWATER;
		}
	}
	public void waterFlower(){
		if(this.seedNum==0){
			System.out.println("すべての花が咲いています！");
		}else if(this.water==0){
			System.out.println("水が空っぽです");
		}else{
			this.seedNum-=1;
			this.water-=1;
			this.bloom+=1;
			System.out.println("水を撒きました");
		}
	}
	public void showStatus(){
		System.out.println("花の色は"+this.color);
		System.out.print("#");
		for(int i=0;i<this.seedNum+this.bloom;i++){
			if(i<this.bloom){
				System.out.print("*");
			}else{
				System.out.print(".");
			}
		}
		System.out.println("#");
	}
}
