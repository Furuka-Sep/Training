public class Main{
	public static void main(String[] args){
		Hero h=new Hero();
		h.name="ミナト";
		h.hp=100;
		System.out.println(h.toString());
		Hero h1=new Hero();
		h1.name="ミナト";
		if(h.equals(h1)){
		}
		System.out.println(h);
	}
}
