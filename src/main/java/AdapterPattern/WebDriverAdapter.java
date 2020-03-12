package AdapterPattern;

public class WebDriverAdapter implements WebDriver{

	IEDriver ieDriver;
	
	public WebDriverAdapter(IEDriver ieDriver) {
		this.ieDriver=ieDriver;
	}
	
	public void selectDriver() {
		this.ieDriver.getDriver();
	}

}