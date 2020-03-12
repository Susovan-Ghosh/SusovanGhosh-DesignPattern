package CompositePattern;

public class CompositePatternTest {

	public static void main(String[] args) {
		
		CompositeAccount account=new CompositeAccount();
		account.addAccount(new DepositAccount("DA01",1500));
		account.addAccount(new DepositAccount("DA02",1000));
		account.addAccount(new DepositAccount("SA01",3500));
		
		System.out.println("CompositeAccount [totalAccountBalance=" + account.getTotalBalance() + "]");

	}

}
