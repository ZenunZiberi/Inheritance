package Inheritance;

public class Truck extends Vehicle {

		private int cargocap;
		
		Truck(int p, int f, int m, int c) {
			super(p,f,m);
			this.cargocap=c;
			}
		
		int getCargocap(){
			return cargocap;
		}
		
		void putCargocap(int c){
			this.cargocap=c;
		}
}
