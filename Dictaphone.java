import java.util.Comparator;

// Dictaphone class extends Product and implements Comparable
public class Dictaphone extends Product implements Comparable<Dictaphone> {
    private String manufacturerName;
    private String model;
    private int yearOfManufacture;
    private double batteryCapacity;
    private MemoryCard memoryCard;

    public Dictaphone(String productID, double price, String brand, 
                      String manufacturerName, String model, int yearOfManufacture, 
                      double batteryCapacity, MemoryCard memoryCard) {
        super(productID, price, brand);
        this.manufacturerName = manufacturerName;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.batteryCapacity = batteryCapacity;
        this.memoryCard = memoryCard;
    }

    public int getYearOfManufacture() { return yearOfManufacture; }

    @Override
    public double getSuitability() {
        if (batteryCapacity <= 0 || yearOfManufacture >= 2025) return 0;

        double batteryFactor = 1 - (1.0 / batteryCapacity);
        double memoryFactor = memoryCard.getQuality() * memoryCard.getCapacity();
        double denominator = 100 * Math.sqrt(2025 - yearOfManufacture);

        return batteryFactor * (memoryFactor / denominator);
    }

    @Override
    public int compareTo(Dictaphone other) {
        return Double.compare(this.getSuitability(), other.getSuitability());
    }

    @Override
    public String toString() {
        return "Dictaphone Details:\n" +
               "Product ID: " + getProductID() + "\n" +
               "Brand: " + getBrand() + "\n" +
               "Price: $" + getPrice() + "\n" +
               "Manufacturer: " + manufacturerName + "\n" +
               "Model: " + model + "\n" +
               "Year of Manufacture: " + yearOfManufacture + "\n" +
               "Battery Capacity: " + batteryCapacity + "mAh\n" +
               "Memory Card Info:\n" +
               "  - Manufacturer: " + memoryCard.getManufacturer() + "\n" +
               "  - Capacity: " + memoryCard.getCapacity() + "GB\n" +
               "  - Class: " + memoryCard.getCardClass();
    }
}

