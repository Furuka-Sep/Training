public class Ex5_3{
	public static void main(String[] args){
		String title="お誘い";
		String address="lie@aaa.com";
		String text="嘘しかつかん";
		email(address,text);
	}
	static void email(String address,String text){
		System.out.println(address+"に、以下のメールを送信しました。");
		System.out.println("件名:無題");
		System.out.println("本文:"+text);
	}
	static void email(String title,String address,String text){
		System.out.println(address+"に、以下のメールを送信しました");
		System.out.println("件名:"+title);
		System.out.println("本文:"+text);
	}
}
