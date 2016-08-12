package Inheritance;

public class Triangle extends TwoDShape {
	String style;

	Triangle() { // default constructor
		super();
		this.style = "none";
	}

	Triangle(double width, double height, String style) {
		// setWidth(width); no need anymore 'bcuz we used super keyword
		// setHeight(height);
		super(width, height, "triangle"); // using super to execute twodshape constructor
		this.style = style;
	}

	Triangle(double x) {
		super(x, "triangle");
		this.style = "filled"; 
	}

	Triangle(Triangle obj){
		super(obj);
		this.style=obj.style;
	}
	
	double area() {
		return getWidth() * getHeight() /2;
	}

	void showStyle() {
		System.out.println("triangle is: " + style);
	}

}
