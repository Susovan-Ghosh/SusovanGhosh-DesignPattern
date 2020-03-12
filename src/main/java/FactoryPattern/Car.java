package FactoryPattern;

public class Car implements Vehicle{
	private int wheel;
	public Car(int wheel) {
		this.wheel=wheel;
	}
	public int getWheel() {
		return this.wheel;
	}
}