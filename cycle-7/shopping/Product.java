package shopping;

// Class representing a Product
public class Product {
    private String name;
    private double price;
    private int quantity;

    // Constructor
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Display product details
    public void displayProduct() {
        System.out.println("Product Name: " + name + ", Price: " + price + ", Quantity: " + quantity);
    }
}
