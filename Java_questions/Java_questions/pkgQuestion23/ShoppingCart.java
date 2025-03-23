package pkgQuestion23;
import java.util.Vector;
public class ShoppingCart {
	private Vector<Product> cart;

    public ShoppingCart() {
        cart = new Vector<>();
    }

    public void addProduct(Product product) {
        cart.add(product);
        System.out.println(product.getName() + " added to cart.");
    }

    public void checkout() {
        if (cart.isEmpty()) {
            System.out.println("Can we help you in finding what you were looking for?");
            return;
        }

        double total = 0;
        System.out.println("\nBilling Details:");
        for (Product product : cart) {
            System.out.println(product.getName() + ": $" + product.getPrice());
            total += product.getPrice();
        }

        System.out.println("Total Amount: $" + total);
    }
}
