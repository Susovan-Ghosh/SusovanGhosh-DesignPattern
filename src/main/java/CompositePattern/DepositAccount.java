package CompositePattern;

public class DepositAccount implements Account{
	
	private float accountBalance;
	private String accountNumber;
	
	public DepositAccount(String accountNumber, float accountBalance) {
		this.accountBalance = accountBalance;
		this.accountNumber = accountNumber;
	}

	public float getBalance() {
		return this.accountBalance;
	}
		
}