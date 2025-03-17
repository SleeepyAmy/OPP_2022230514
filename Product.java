// This is an abstract class that represents a general product in the store
public abstract class Product {

    // Private attributes (only accessible inside this class)
    private final String productID; // A unique identifier for each product (cannot be changed after creation)
    private double price; // The price of the product
    private String brand; // The brand name of the product

    // Constructor: This is called when creating a new product
    public Product(String productID, double price, String brand) {
        this.productID = productID; // Assigns a unique product ID
        this.price = price; // Assigns a price to the product
        this.brand = brand; // Assigns the brand name to the product
    }

    // Getter method to get the product ID
    public String getProductID() { return productID; }

    // Getter method to get the price of the product
    public double getPrice() { return price; }

    // Getter method to get the brand of the product
    public String getBrand() { return brand; }

    // Abstract method that must be implemented by any class that extends Product
    public abstract double getSuitability();
}


