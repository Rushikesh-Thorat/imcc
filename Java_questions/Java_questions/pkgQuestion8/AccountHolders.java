package pkgQuestion8;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountHolders {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Account> accounts = new ArrayList<>();

        // Accept data for 10 account holders
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter details for account holder " + i + ":");
            System.out.print("Account Number: ");
            int acc_no = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Account Type: ");
            String acc_type = scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Balance: ");
            double balance = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            // Create Account object and add to the list
            accounts.add(new Account(acc_no, acc_type, name, balance));
        }

        // Print names of customers with balance greater than 10,000
        System.out.println("\nCustomers with balance greater than 10,000:");
        for (Account account : accounts) {
            if (account.getBalance() > 10000) {
                System.out.println(account.getName());
            }
        }

        scanner.close();
    }
}
