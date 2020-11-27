public class Pencil{
	String color;
	int length=5;
	public Pencil(String color){
		this.color=color;
	}
	public void write(){
					if(this.length==0){
						System.out.println("もう書けません");
					}else{
						this.length-=1;
						System.out.println(this.color+"で書いた！");
					}
	}
	public void info(){
					System.out.println("色"+this.color);
					for(int i=0;i<this.length;i++){
						System.out.print("+");
					}
					System.out.println(">");
	}
	public void exit(){
		System.out.println("アプリケーションを終了します");
	}
}
