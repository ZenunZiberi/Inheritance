package Inheritance;

public class Rectangle extends TwoDShape {
	
	Rectangle(){
		super();
	}
	
	Rectangle(double width, double height){
		super(width,height,"rectangle");    //call supercllas constructor
		
	}
	
	Rectangle(double x){
		super(x,"rectangle");
	}
	
	Rectangle(Rectangle obj){
		super(obj);     //pass object to twodshape constructor
	}
	
	boolean iSquare(){
		if(getWidth()==getHeight()) return true;
		else return false;
	}
	
	double area(){
		return getWidth()*getHeight();
	}
	
	
	

}
