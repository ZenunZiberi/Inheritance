package Inheritance;

public class Shapes7 {

	public static void main(String[] args) {

		Triangle t1 = new Triangle(8.0, 12.0,"outlined");
		Triangle t2 = new Triangle(t1);
		
		System.out.println("info for t1: ");
		t1.showStyle();
	//	t1.showColor();
		t1.showDim();
		System.out.println("area is: "+t1.area());
		
		System.out.println();
		
		System.out.println("info for t2: ");
	//	t2.showColor();
		t2.showDim();
		t2.showStyle();
		System.out.println("area is: "+t2.area());
		

	}

}
