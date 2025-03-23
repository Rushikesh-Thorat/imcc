package pkgQuestion10;

import java.util.ArrayList;
import java.util.List;

public class Bank{
	private List<Account> accounts;
	
	public Bank() {
		accounts = new ArrayList<>();
	}
	
	public void addAccount(Account account) {
		accounts.add(account);
		System.out.println("Account added successfully.");
	}
	
	public void showAllAccounts() {
		for (Account account : accounts) {
			account.viewBalances();
		}
	}
public static void main(String[] args) {
	Bank bank = new Bank();
	
	SavingsAccount savings = new SavingsAccount("SA123", 1000.0, 5.0);
	CurrentAccount current = new CurrentAccount("CA123", 2000.0, 500.0);
	
	bank.addAccount(savings);
	bank.addAccount(current);
	
	savings.deposit(500);
	savings.withdraw(300);
	current.calculateInterest();
	current.viewBalances();
	
	System.out.println("\nAll Accounts in Bank:");
	bank.showAllAccounts();
}
	
}
