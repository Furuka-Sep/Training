import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		List<Cat> cats=new ArrayList<>();
		System.out.println("***Cat Collection***");
		while(true){
			System.out.print("1.Collect/2.Play/3.End|>");
			int select=sc.nextInt();
			switch(select){
			case 1:
				Cat cat=new Cat();
				cat.collect();
				System.out.print("Please name this cat>");
				String name=sc.next();
				cat.setName(name);
				cat.join();
				cats.add(cat);
				break;
			case 2:
				if(cats.isEmpty()){
					System.out.println("You do not have anyone to play with.");
					break;
				}
				for(int i=0;i<cats.size();i++){
					System.out.printf(i+"・・・%s[%d](%d)%n",cats(i).getName(),cats(i).getType(),cats(i).getIntimacy());
				}
				break;
			default:
				return;
			}
		}
	}
}
