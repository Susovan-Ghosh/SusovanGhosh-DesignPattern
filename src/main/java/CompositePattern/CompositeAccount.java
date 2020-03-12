package CompositePattern;

import java.util.List;
import java.util.LinkedList;

public class CompositeAccount {
	
	private float totalAccountBalance;
	private List<Account> accountLists=new LinkedList<Account>();
	
	public CompositeAccount() {
		this.totalAccountBalance=0.0f;
	}

	public void addAccount(Account a) {
		this.accountLists.add(a);
	}
	
	public float getTotalBalance() {
		for(Account accounts:accountLists)
			this.totalAccountBalance+=accounts.getBalance();
		return this.totalAccountBalance;
	}
	
}