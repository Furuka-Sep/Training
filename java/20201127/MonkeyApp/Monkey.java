public class Monkey{
	/*フィールド変数*/
		String name;
		int age;
		//年齢
	/*コンストラクタ*/
		//名前と年齢を受け取るコンストラクタ
		public Monkey(String name,int age){
			this.name=name;
			this.age=age;
		}
	/*メソッド*/
	//挨拶をするメソッド
	public void greet(){
		System.out.println("こんにちは"+this.name+"("+this.age+"才)です。よろしく！");
	}
	//竹馬をするメソッド
	public void takeuma(){
		System.out.println(this.name+"は竹馬に乗れなかった！！");
	}
	//逆立ちをするメソッド
	public void sakadachi(){
		System.out.println(this.name+"はなんとか逆立ちをした！");
	}
}
