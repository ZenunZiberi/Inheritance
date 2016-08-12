package Inheritance;

public class B extends A {

		int k;
		
		B(int a , int b, int c){
			super(a,b);
			this.k=c;
		}
		
		void show(String msg){
			System.out.println(msg+k);
		}
		
		void show(){
			super.show();
			System.out.println("k are : "+k);
		}
		
}
