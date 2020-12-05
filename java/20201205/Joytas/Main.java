import java.util.*;
public class Main{
	public static void main(String[] args){
			Bicycle b1=new Bicycle(27);
			ElectricBicycle b2=new ElectricBicycle(24);
		while(true){
			Scanner s=new Scanner(System.in);
			System.out.println("自転車を選んでください");
			System.out.println("0...自転車/ホイールサイズ:27");
			System.out.println("1...電動自転車/ホイールサイズ:24 バッテリー:"+b2.battery);
			System.out.println("2...終了");
			System.out.print("番号の入力>");
			int type=s.nextInt();
			switch(type){
			case 0:
				nb:while(true){
				System.out.print("|1.走る|2.降りる|>");
				int select=s.nextInt();
					switch(select){
					case 1:
						b1.ride();
						break;
					case 2:
						b1.rideoff();
						break nb;
					default:
						break nb;
					}
				}
				break;
			case 1:
				eb:while(true){
				System.out.print("|1.走る|2.降りる|3.充電|>");
				int select=s.nextInt();
					switch(select){
					case 1:
						b2.ride();
						break;
					case 2:
						b2.rideoff();
						break eb;
					case 3:
						b2.batteryCharge();
						break;
					default:
						break eb;
					}
				}
				break;
			default:
				System.out.println("アプリケーションを終了します");
				return;
			}
		}
	}
}
