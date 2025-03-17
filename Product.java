// Abstract class Product
public abstract class Product {
    private final String productID;
    private double price;
    private String brand;

    public Product(String productID, double price, String brand) {
        this.productID = productID;
        this.price = price;
        this.brand = brand;
    }

    public String getProductID() { return productID; }
    public double getPrice() { return price; }
    public String getBrand() { return brand; }

    public abstract double getSuitability();
}


