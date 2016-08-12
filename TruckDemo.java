package Inheritance;

public class TruckDemo {

	public static void main(String[] args) {

		Truck semi = new Truck(2,200,7,44000);
		Truck pickup = new Truck(3,28,15,2000);
		double gallons;
		int dist=252;
		
		gallons =semi.fuelneeded(dist);
		
		System.out.println("semi can carry: "+semi.getCargocap()+"pounds");
		System.out.println("to go "+dist+"miles semi need "+gallons+" gallons of fuel \n");
		
		gallons =pickup.fuelneeded(dist);
		
		System.out.println("pickup can carry : "+pickup.getCargocap()+"pounds");
		System.out.println("to go "+dist+"miles pickup  need "+gallons+"gallons of fuel \n");
		
	}

}
