public class Lottery{
	public static void main(String[] args){
		int sum=0;
		int n=0;
		for(int i=0;i<3;i++){
			System.out.println(i+1+"回目");
			int ran=new java.util.Random().nextInt(100)+1;
			if(ran == 1){
				sum+=10000000;
				System.out.printf("%d%n10000000",ran);
			}else if(ran == 2 || ran == 3){
				sum+=1000000;
				System.out.printf("%d%n1000000",ran);
			}else if(ran >= 4 && ran <= 6){
				sum+=100000;
				System.out.printf("%d%n100000",ran);
			}else if(ran >= 7 && ran <= 10){
				sum+=10000;
				System.out.printf("%d%n10000",ran);
			}else if(ran >= 11 && ran <= 20){
				sum+=1000;
				System.out.printf("%d%n1000",ran);
			}else if(ran >= 21 && ran <= 40){
				sum+=100;
				System.out.printf("%d%n100");
			}else{
				System.out.println("はずれ");
			}
		}
		System.out.printf("獲得賞金は計%,%d円です。",sum);
	}
}
