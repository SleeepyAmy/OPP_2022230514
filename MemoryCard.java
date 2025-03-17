// MemoryCard class
public class MemoryCard {
    private String manufacturer;
    private int capacity;
    private CardClass cardClass;

    public MemoryCard(String manufacturer, int capacity, CardClass cardClass) {
        this.manufacturer = manufacturer;
        this.capacity = capacity;
        this.cardClass = cardClass;
    }

    public String getManufacturer() { return manufacturer; }
    public int getCapacity() { return capacity; }
    public CardClass getCardClass() { return cardClass; }

    public double getQuality() {
        switch (cardClass) {
            case CLASS_10: return (double) capacity / 3;
            case CLASS_6: return (double) capacity / 5;
            case CLASS_4: return (double) capacity / 13;
            default: return 0;
        }
    }
}



