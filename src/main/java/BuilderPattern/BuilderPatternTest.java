package BuilderPattern;

public class BuilderPatternTest {

	public static void main(String[] args) {
		
		Phone phone=new PhoneBuilder().setCompany("Poco").setRam(6).getPhone();
		System.out.println(phone.toString());
		
	}

}