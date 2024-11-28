import shopping.Product;
import shopping.Cart;

public class ShoppingTest {
    public static void main(String[] args) {
        // Create a cart with a capacity of 5 products
        Cart cart = new Cart(5);

        // Create products
        Product product1 = new Product("Laptop", 50000, 1);
        Product product2 = new Product("Smartphone", 20000, 2);
        Product product3 = new Product("Headphones", 3000, 3);

        // Add products to the cart
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);

        System.out.println();

        // Display cart items
        cart.displayCart();

        System.out.println();

        // Calculate and display the total price
        double totalPrice = cart.calculateTotal();
        System.out.println("Total Price: " + totalPrice);
    }
}
