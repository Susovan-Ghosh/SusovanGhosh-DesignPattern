package BuilderPattern;

public class PhoneBuilder {
	
	private String company;
	private int ram;
	private double screenSize;
	private int battery;
	
	public PhoneBuilder setCompany(String company) {
		this.company = company;
		return this;
	}
	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public PhoneBuilder setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	
	public Phone getPhone() {
		return new Phone(company, ram, screenSize, battery);
	}
}