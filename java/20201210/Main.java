import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Wallet c=new Wallet(1000);
		VendingMachine d=new VendingMachine(3);
		d.showMoney();
		while(true){
			System.out.print("1. 硬貨投入 / 2. 商品購入 / 3. 硬貨取出 / 4.商品投入 / 5.所持金表示 / 6.終了>");
			int select=sc.nextInt();
			switch(select){
			case 1:
				System.out.print("投入する金額を入力してください>");
				int money=sc.nextInt();
				d.insertCoins(c.takeOutMoney(money));
				break;
			case 2:
				d.purchace();
				break;
			case 3:
				System.out.println("硬貨を取り出しました");
				c.insertMoney(d.getMoney());
				d.cancel();
				break;
			case 4:
				System.out.print("投入する個数を入力してください");
				int n=sc.nextInt();
				d.insertGoods(n);
				break;
			case 5:
				c.display();
				break;
			default:
				return;
			}
		}
	}
}

class Wallet{
	private int money;
	public Wallet(int money){
		if(money<0){
			this.money=0;
		}
		this.money=money;
	}
	public void insertMoney(int money){
		this.money+=money;
		System.out.println("財布に"+money+"円入れました");
	}
	public int takeOutMoney(int money){
		int temp=0;
		if(this.money<money){
			temp=(money-this.money);
		}
		System.out.println("財布から"+(money-temp)+"円取り出しました");
		this.money-=(money-temp);
		return money-temp;
	}
	public void display(){
		System.out.println("現在の財布の中身:"+this.money+"円");
	}
}

class VendingMachine{
	private int money;
	private int num;
	public VendingMachine(int n){
		this.num=n;
		this.money=0;
	}
	public void insertCoins(int money){
		this.money+=(money);
	}
	public void cancel(){
		this.money-=this.money;
	}
	public void purchace(){
		if(this.money<100){
			System.out.println("投入金額が不足しています");
		}else if(this.num<=0){
			System.out.println("商品売切れ");
		}else{
			this.money-=100;
			this.num-=1;
			System.out.println("商品を購入しました");
		}
	}
	public void insertGoods(int n){
		this.num+=n;
		System.out.println("商品を"+n+"個補充しました");
	}
	public void showMoney(){
		System.out.println("現在の入金額:"+this.money+"円");
	}
	public int getMoney(){
		return this.money;
	}
}
