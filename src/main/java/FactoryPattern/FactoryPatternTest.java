package FactoryPattern;

public class FactoryPatternTest {

	public static void main(String[] args) {
		
		Vehicle car=VehicleFactory.getInstance("Car", 4);
		System.out.println("Car :"+car.getWheel());
		
		Vehicle bike=VehicleFactory.getInstance("Bike", 2);
		System.out.println("Bike :"+bike.getWheel());
		
	}
	
}