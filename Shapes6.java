package Inheritance;

public class Shapes6 {

	public static void main(String[] args) {

		ColorTriangle t1 = new ColorTriangle("blue", "outlined", 4.0, 4.0);
		ColorTriangle t2 = new ColorTriangle("red", "filled", 2.0, 2.0);
		
		System.out.println("info for t1: ");
		t1.showStyle();
		t1.showColor();
		t1.showDim();
		System.out.println("area is: "+t1.area());
		
		System.out.println();
		
		System.out.println("info for t2: ");
		t2.showColor();
		t2.showDim();
		t2.showStyle();
		System.out.println("area is: "+t2.area());
		
	}

}
