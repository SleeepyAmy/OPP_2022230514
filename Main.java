import java.time.LocalDate; // Import to get today's date
import java.time.format.DateTimeFormatter; // Import to format the date
import java.util.Arrays; // Import for sorting the Dictaphones

// This is the main class that runs the program
public class Main {
    public static void main(String[] args) {
        printStudentDetails(); // Printing my details (name, index, date)
        Dictaphone[] dictaphones = demonstrateDictaphones(); // Create an array of Dictaphones
        displayOldDictaphones(dictaphones); // Show Dictaphones made before 2015
        displayMostSuitableDictaphone(dictaphones); // Find and print the best Dictaphone
    }

    // This method prints my details (name, index number, and current date)
    private static void printStudentDetails() {
        String name = "Weam Mahjoub"; // my name
        String indexNumber = "2022230514"; // my index number
        // Getting today's date in "dd.MM.yyyy" format
        String date = LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        System.out.println(name + ", " + indexNumber + ", " + date + "."); // Print the details
    }

    // This method creates an array of Dictaphones and returns it
    private static Dictaphone[] demonstrateDictaphones() {
        Dictaphone[] dictaphones = { // Creating five Dictaphones with different details
            new Dictaphone("DIC-201", 349.99, "Tascam", "Tascam Inc.", "DR-40X", 2012, 2200, new MemoryCard("Lexar", 256, CardClass.CLASS_10)),
            new Dictaphone("DIC-202", 189.99, "Olympus", "Olympus Corp.", "VN-541PC", 2014, 1600, new MemoryCard("Samsung", 128, CardClass.CLASS_6)),
            new Dictaphone("DIC-203", 129.99, "Sony", "Sony Corp.", "ICD-BX140", 2016, 1200, new MemoryCard("Sony", 64, CardClass.CLASS_4)),
            new Dictaphone("DIC-204", 279.99, "Zoom", "Zoom Ltd.", "H5 Handy", 2010, 2500, new MemoryCard("Transcend", 512, CardClass.CLASS_10)),
            new Dictaphone("DIC-205", 149.99, "Philips", "Philips Inc.", "DVT2110", 2018, 1400, new MemoryCard("Kingston", 32, CardClass.CLASS_6))
        };
        return dictaphones; // Return the array of Dictaphones
    }

    // This method displays Dictaphones that were manufactured before 2015
    private static void displayOldDictaphones(Dictaphone[] dictaphones) {
        System.out.println("\nDictaphones manufactured before 2015:");
        for (Dictaphone d : dictaphones) { // Loop through each Dictaphone
            if (d.getYearOfManufacture() < 2015) // Check if the year is before 2015
                System.out.println("\n" + d); // Print the Dictaphone details
        }
    }

    // This method finds and displays the most suitable Dictaphone
    private static void displayMostSuitableDictaphone(Dictaphone[] dictaphones) {
        Arrays.sort(dictaphones); // Sort the Dictaphones by their suitability (lowest to highest)
        System.out.println("\nMost Suitable Dictaphone:\n" + dictaphones[dictaphones.length - 1]); // Print the last Dictaphone (highest suitability)
    }
}


