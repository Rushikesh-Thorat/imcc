package pkgQuestion23;
import java.util.Scanner;
public class EcomDemo {
	public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Product");
            System.out.println("2. Checkout");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter product price: ");
                    double price = scanner.nextDouble();
                    cart.addProduct(new Product(name, price));
                    break;
                case 2:
                    cart.checkout();
                    break;
                case 3:
                    System.out.println("Thank you for visiting!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option! Try again.");
            }
        }
    }
}
