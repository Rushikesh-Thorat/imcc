package pkgQuestion13;

public class ExceptionDemo {
	public static void main(String args[]) {
		ShoppingCart cart = new ShoppingCart();
		try {
			cart.addProductToCart("Laptop", 3); //Valid
			cart.addProductToCart("Phone", 6); // will throw exception
		}catch(MaximumProductsLimitExceededException e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}
}
