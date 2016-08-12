package Inheritance;

public class Vehicle {

	private int passengers, fuelcap, mpg;


	Vehicle(int p,int f, int m)	{
		this.passengers=p;
		this.fuelcap=f;
		this.mpg=m;
	}
	
	int range() {
		return fuelcap * mpg;
	}

	double fuelneeded(int miles) {
		return miles/mpg;
	}
	
	int getPassengers(){
		return passengers;
	}
	
	void setPassengers(int p){
		this.passengers=p;
	}
	
	int getFuelcap(){
		return fuelcap;
	}
	
	void setFuelcap(int f){
		this.fuelcap=f;
	}
	
	int getMpg(){
		 return mpg;
	 }
	
	void setMpg(int m){
		this.mpg=m;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

