package pkgQuestion10;

public class SavingsAccount implements Account {
	private String accountNumber;
	private double balance;
	private double interestRate;
	
	

	public SavingsAccount(String string, double d, double e) {
		accountNumber = string;
		balance = d;
		interestRate = e;
	}

	public void SavingAccount(String accountNumber, double initialBalance, double interestRate) {
		this.accountNumber = accountNumber;
		this.balance = initialBalance;
		this.interestRate = interestRate;
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited: " + amount + " in Savings Account " + accountNumber);
		
	}

	@Override
	public void withdraw(double amount) {
		if(balance >= amount) {
			balance -= amount;
			System.out.println("Withdrawn: " + amount + "from Savings Account " + accountNumber);
		}else {
			System.out.println("Insufficient balance in Savings Account " + accountNumber);
		}
		
	}

	@Override
	public void calculateInterest() {
		double interest = balance * interestRate / 100;
		balance += interest;
		System.out.println("Interest added: " + interest + " to Savings Account " + accountNumber);
		
	}

	@Override
	public void viewBalances() {
		System.out.println("Savings Account " + accountNumber + " Balance: " + balance);
	}
	
}
