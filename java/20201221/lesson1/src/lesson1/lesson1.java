package lesson1;

public class lesson1 {

	public static void main(String[] args) {
		System.out.println("hello world");
		String str="Hello";
		if(str.equalsIgnoreCase("hello")) {
			System.out.println("ok");
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		System.out.println("１秒たちました");
	}

}
