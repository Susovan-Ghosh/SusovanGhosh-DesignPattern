package AdapterPattern;

public class AdapterPatternTest {

	public static void main(String[] args) {
		
		WebDriver webDriver=new WebDriverAdapter(new IEDriver());
		webDriver.selectDriver();

	}

}