public class ElectricBicycle extends Bicycle{
	static final int MAX=10;
	int battery=10;
	public ElectricBicycle(int wheelSize){
		super(wheelSize);
	}
	@Override
	public void ride(){
		if(this.battery==0){
			System.out.println("風を切って走ります");
			System.out.println("バッテリーが切れるととても重いです");
		}else{
			System.out.println("風を切って走ります");
			System.out.println("坂道だってラクラクです");
			this.battery-=5;
		}
	}
	public void batteryCharge(){
		this.battery=MAX;
		System.out.println("バッテリーを充電しました");
		this.battery=MAX;
	}
}
