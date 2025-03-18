// so, the Dictaphone class represents a voice recorder (Dictaphone)
// It extends the Product class (inherits product details)
// It also implements Comparable, so we can compare Dictaphones based on suitability
public class Dictaphone extends Product implements Comparable<Dictaphone> {
    
    // Private attributes of a Dictaphone
    private String manufacturerName;  // Name of the company that made the Dictaphone
    private String model;             // The Dictaphone model name
    private int yearOfManufacture;    // Year when the Dictaphone was made
    private double batteryCapacity;   // Battery capacity in mAh
    private MemoryCard memoryCard;    // A memory card inside the Dictaphone

    // Constructor: This is called when creating a new Dictaphone object
    public Dictaphone(String productID, double price, String brand, 
                      String manufacturerName, String model, int yearOfManufacture, 
                      double batteryCapacity, MemoryCard memoryCard) {
        super(productID, price, brand); // Calls the constructor of the Product class
        this.manufacturerName = manufacturerName;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.batteryCapacity = batteryCapacity;
        this.memoryCard = memoryCard;
    }

    // Getter method to get the year the Dictaphone was made
    public int getYearOfManufacture() { 
        return yearOfManufacture; 
    }

    // This method calculates the suitability of a Dictaphone based on battery and memory
    @Override
    public double getSuitability() {
        // If battery is zero or the year is too new (>= 2025), return 0 (not suitable)
        if (batteryCapacity <= 0 || yearOfManufacture >= 2025) return 0;

        // Part 1: Battery factor (1 - 1 / Battery Capacity)
        double batteryFactor = 1 - (1.0 / batteryCapacity);
        
        // Part 2: Memory factor (Quality of Memory Card * Memory Capacity)
        double memoryFactor = memoryCard.getQuality() * memoryCard.getCapacity();
        
        // Part 3: Denominator (100 * sqrt(2025 - Year of Manufacture))
        double denominator = 100 * Math.sqrt(2025 - yearOfManufacture);

        // Final Suitability Score Calculation
        return batteryFactor * (memoryFactor / denominator); 
    }

    // This method allows Dictaphones to be compared based on their suitability
    @Override
    public int compareTo(Dictaphone other) {
        return Double.compare(this.getSuitability(), other.getSuitability()); // Compare by suitability score
    }

    // This method returns a string describing the Dictaphone object (used when printing)
    @Override
    public String toString() {
        return """
               Dictaphone Details:
               Product ID: """ + getProductID() + "\n" +
               "Brand: " + getBrand() + "\n" +
               "Price: $" + getPrice() + "\n" +
               "Manufacturer: " + manufacturerName + "\n" +
               "Model: " + model + "\n" +
               "Year of Manufacture: " + yearOfManufacture + "\n" +
               "Battery Capacity: " + batteryCapacity + "mAh\n" +
               "Memory Card Info:\n" +
               "  - Manufacturer: " + memoryCard.getManufacturer() + "\n" +
               "  - Capacity: " + memoryCard.getCapacity() + "GB\n" +
               "  - Class: " + memoryCard.getCardClass(); // ❌ Suitability score is removed
    }
}


