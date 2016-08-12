package Inheritance;

public class Overload {

	public static void main(String[] args) {

		B subobj= new B(1,2,3);
		//A subob=new A(1,2);

		subobj.show("this is k: "); // this call show in B
		subobj.show();  // this call obj in A
		
	}

}
