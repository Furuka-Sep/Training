public class Ex5_4{
	public static void main(String[] args){
		double TriArea=calcTriangleArea(10.0,5.0);
		System.out.println("三角形の面積"+TriArea+"平方cm");
		double CirArea=calcCircleArea(5.0);
		System.out.println("円の面積"+CirArea+"平方cm");
	}
	static double calcTriangleArea(double bottom,double height){
		double area=bottom*height/2;
		return area;
	}
	static double calcCircleArea(double radius){
		double area=radius*radius*3.14;
		return area;
	}
}
