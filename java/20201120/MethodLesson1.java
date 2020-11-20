public class MethodLesson1{
	static void eat(){
		System.out.println("モグモグ");
		System.out.println("ゴクゴク");
	}
	public static void main(String[] args){
		/*
		hello("Tanaka");
		hello("Sato");
		*/
		System.out.print("あなたの名前を入れてください>");
		String name=new java.util.Scanner(System.in).nextLine();
		hello(name);
			/*
		eat();
		bye();
		*/
	}
	static void hello(String name){
		System.out.println(name+",Hello");
	}
	static void bye(){
		System.out.println("Bye");
	}
}
