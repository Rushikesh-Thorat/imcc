package pkgQuestion8;

public class Account {
	int acc_no;
	String acc_type;
	String name;
	double balance;

	// Constructor to initialize account details
	public Account(int acc_no, String acc_type, String name, double balance) {
		this.acc_no = acc_no;
		this.acc_type = acc_type;
		this.name = name;
		this.balance = balance;
	}

	// Getter for balance
	public double getBalance() {
		return balance;
	}

	// Getter for name
	public String getName() {
		return name;
	}
}
