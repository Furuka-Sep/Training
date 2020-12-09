import java.util.*;
public class Box{
	private String color;
	private String shape;
	private int num;
	private static int totalNumber;
	public Box(String color,String shape,int num){
		this.color=color;
		this.shape=shape;
		this.num=num;
		totalNumber+=num;
	}
	public void insertBalls(int num){
		this.num+=num;
		totalNumber+=num;
		System.out.println(num+"個のボールを入れました。");
	}
	public void removeBalls(int num){
		if(this.num<num){	
		System.out.println(this.num+"個のボールを取り出しました。");
		totalNumber-=this.num;
		this.num=0;
		}else{
		this.num-=num;
		totalNumber-=num;
		System.out.println(num+"個のボールを取り出しました。");
		}
	}
	public void displayInfo(int num){
		System.out.println(num+"---色:"+this.color+", 形:"+this.shape+",個数:"+this.num);
	}
	static void displayTotalNumber(){
		System.out.println("ボールの合計は"+totalNumber+"個です。");
	}
}
