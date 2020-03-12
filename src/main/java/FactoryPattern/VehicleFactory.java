package FactoryPattern;

public class VehicleFactory {
	public static Vehicle getInstance(String type,int wheel) {
		if(type.equalsIgnoreCase("Car"))
			return new Car(wheel);
		else if(type.equalsIgnoreCase("Bike"))
			return new Bike(wheel);
		else
			return null;
	}
}