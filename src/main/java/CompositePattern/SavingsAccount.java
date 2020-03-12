package CompositePattern;

public class SavingsAccount implements Account{
	
	private float accountBalance;
	private String accountNumber;
	
	public SavingsAccount(String accountNumber, float accountBalance) {
		this.accountBalance = accountBalance;
		this.accountNumber = accountNumber;
	}

	public float getBalance() {
		return this.accountBalance;
	}
		
}