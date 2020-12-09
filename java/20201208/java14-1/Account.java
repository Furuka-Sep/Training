public class Account{
	String accountNumber;
	int balance;
	@Override
	public String toString(){
		//return"¥¥"+this.balance+"(口座番号:"+this.accountNumber")";
		return String.format("%d円(口座番号:%s)",this.balance,this.accountNumber);
	}
	public boolean equals(Object o){
		if(this ==o){
			return true;
		}
		if(o instanceof Account){
			Account a=(Account)o;
			String an1=this.accountNumber.trim();//トリミング
			String an2=a.accountNumber.trim();
			if(an1.equals(an2)){
				return true;
			}
		}
		return false;
	}
}
