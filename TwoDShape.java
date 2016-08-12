package Inheritance;

public class TwoDShape {

	private	double width, height;
	private String name;
	
	TwoDShape(){					//default constructor
		 this.width = this.height=0.0;
		 this.name="none";
	}
	
	TwoDShape(double x, String name){        //constructor with equal width and height
		width = height=x;
		this.name =name;
		
	}
	
	TwoDShape (double width, double height, String name){	//a constructor of twodshape so we can call super clas
		this.width=width;
		this.height=height;
		this.name=name;
	}
	
	TwoDShape(TwoDShape object){		//construct object from an object
		this.width=object.width;
		this.height=object.height;
		this.name=object.name;
	}
	
	String getName(){
		return name;
	}
		
	double getWidth(){
		return width;
	}
	
	void setWidth(double width){
		this.width=width;
	}
	
	double getHeight(){
		return height;
	}
	
	void setHeight(double height){
		this.height=height;
		
	}
		void showDim(){
			System.out.println("width and height are "+width+"and "+height);
		}
		
	   	double area(){
			System.out.println("area() must be overridden");
			return 0.0;
		
	   	}
		
}
