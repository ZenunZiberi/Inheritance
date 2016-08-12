package Inheritance;

public class ColorTriangle extends Triangle {

	private String color;

	ColorTriangle(String color, String style, double width, double height) {
		super(width, height, style);
		this.color = color;
	}

	String getColor() {
		return color;
	}

	void showColor() {

		System.out.println("color is: " + color);
	}

}
