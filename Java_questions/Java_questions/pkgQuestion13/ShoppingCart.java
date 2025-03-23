package pkgQuestion13;

public class ShoppingCart {
	private static final int MAX_UNITS_PER_PRODUCT = 5;
	
	public void addProductToCart(String product, int quantity) throws MaximumProductsLimitExceededException{
		if(quantity > MAX_UNITS_PER_PRODUCT) {
			throw new MaximumProductsLimitExceededException("Cannot add more than " + MAX_UNITS_PER_PRODUCT + " units of " + product + " to the cart.");
		}
		System.out.println(quantity + " units of " + product + " added to the cart.");
	}
	
	
}
