package FactoryPattern;

public class Bike implements Vehicle{
	private int wheel;
	public Bike(int wheel) {
		this.wheel=wheel;
	}
	public int getWheel() {
		return this.wheel;
	}
}