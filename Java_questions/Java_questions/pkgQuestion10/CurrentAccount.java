package pkgQuestion10;

public class CurrentAccount implements Account {

	private String accountNumber;
	private double balance;
	private double overdraftLimit;
	
	public CurrentAccount(String accountNumber, double initialBalance, double overdraftLimit) {
		this.accountNumber = accountNumber;
		this.balance = initialBalance;
		this.overdraftLimit = overdraftLimit;
		
	}
	@Override
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited: " + amount + " in Current Account " + accountNumber);
		
	}

	@Override
	public void withdraw(double amount) {
		if (balance + overdraftLimit >= amount) {
			balance -= amount;
			System.out.println("Withdrawn: " + amount + " from Current Account " + accountNumber);
		} else {
			System.out.println("Overdraft limit exceeded in Current Account " + accountNumber);
		}
	}

	@Override
	public void calculateInterest() {
		System.out.println("Current Account " + accountNumber + " does not earn interest.");
		
	}

	@Override
	public void viewBalances() {
		System.out.println("Current Account " + accountNumber + " Balance: " + balance);
		
	}

}
