package Inheritance;

public class Circle extends TwoDShape {
		
	Circle(double width, double height, String name){
		super(width,height,name);
	}

		double area(){
			return (getWidth() /2) * (getHeight()/2)*3.1416;
		}
		
}
