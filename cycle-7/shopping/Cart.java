package shopping;

// Class representing a Cart
public class Cart {
    private Product[] products; // Array to hold products
    private int productCount;   // Tracks the number of products added to the cart

    // Constructor
    public Cart(int maxProducts) {
        products = new Product[maxProducts]; // Initialize array with maximum capacity
        productCount = 0;
    }

    // Method to add a product to the cart
    public void addProduct(Product product) {
        if (productCount < products.length) {
            products[productCount] = product;
            productCount++;
            System.out.println(product.getName() + " added to the cart.");
        } else {
            System.out.println("Cart is full! Cannot add more products.");
        }
    }

    // Method to calculate the total price of products in the cart
    public double calculateTotal() {
        double total = 0;
        for (int i = 0; i < productCount; i++) {
            total += products[i].getPrice() * products[i].getQuantity();
        }
        return total;
    }

    // Method to display items in the cart
    public void displayCart() {
        if (productCount == 0) {
            System.out.println("Cart is empty!");
            return;
        }
        System.out.println("Items in the cart:");
        for (int i = 0; i < productCount; i++) {
            products[i].displayProduct();
        }
    }
}
