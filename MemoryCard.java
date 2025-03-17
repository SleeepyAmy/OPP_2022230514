// This class represents a memory card used inside the Dictaphone
public class MemoryCard {
    
    // Private attributes of a memory card
    private String manufacturer; // The brand/company that made the memory card
    private int capacity; // Memory card size in GB
    private CardClass cardClass; // The speed class of the memory card (Class 4, 6, or 10)

    // Constructor: This is called when creating a new memory card object
    public MemoryCard(String manufacturer, int capacity, CardClass cardClass) {
        this.manufacturer = manufacturer; // Store manufacturer name
        this.capacity = capacity; // Store capacity in GB
        this.cardClass = cardClass; // Store card class (speed category)
    }

    // Getter method to get the memory card manufacturer
    public String getManufacturer() { return manufacturer; }

    // Getter method to get the memory card capacity (size in GB)
    public int getCapacity() { return capacity; }

    // Getter method to get the memory card class (speed class)
    public CardClass getCardClass() { return cardClass; }

    // This method calculates the quality of the memory card based on its class and capacity
    public double getQuality() {
        switch (cardClass) {
            case CLASS_10: return (double) capacity / 3; // Class 10 has a higher quality rating
            case CLASS_6: return (double) capacity / 5; // Class 6 is medium quality
            case CLASS_4: return (double) capacity / 13; // Class 4 has the lowest quality
            default: return 0; // If the class is invalid, return 0
        }
    }
}




