package BuilderPattern;

public class Phone {
	
	private String company;
	private int ram;
	private double screenSize;
	private int battery;
	
	public Phone(String company, int ram, double screenSize, int battery) {
		super();
		this.company = company;
		this.ram = ram;
		this.screenSize = screenSize;
		this.battery = battery;
	}

	@Override
	public String toString() {
		return "Phone [company=" + company + ", ram=" + ram + ", screenSize=" + screenSize + ", battery=" + battery
				+ "]";
	}
	
}