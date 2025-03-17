import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        printStudentDetails();
        Dictaphone[] dictaphones = demonstrateDictaphones();
        displayOldDictaphones(dictaphones);
        displayMostSuitableDictaphone(dictaphones);
    }

    private static void printStudentDetails() {
        String name = "Weam Mahjoub"; 
        String indexNumber = "2022230514"; 
        String date = LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        System.out.println(name + ", " + indexNumber + ", " + date + ".");
    }

    private static Dictaphone[] demonstrateDictaphones() {
        Dictaphone[] dictaphones = {
            new Dictaphone("DIC-201", 349.99, "Tascam", "Tascam Inc.", "DR-40X", 2012, 2200, new MemoryCard("Lexar", 256, CardClass.CLASS_10)),
            new Dictaphone("DIC-202", 189.99, "Olympus", "Olympus Corp.", "VN-541PC", 2014, 1600, new MemoryCard("Samsung", 128, CardClass.CLASS_6)),
            new Dictaphone("DIC-203", 129.99, "Sony", "Sony Corp.", "ICD-BX140", 2016, 1200, new MemoryCard("Sony", 64, CardClass.CLASS_4)),
            new Dictaphone("DIC-204", 279.99, "Zoom", "Zoom Ltd.", "H5 Handy", 2010, 2500, new MemoryCard("Transcend", 512, CardClass.CLASS_10)),
            new Dictaphone("DIC-205", 149.99, "Philips", "Philips Inc.", "DVT2110", 2018, 1400, new MemoryCard("Kingston", 32, CardClass.CLASS_6))
        };
        return dictaphones;
    }

    private static void displayOldDictaphones(Dictaphone[] dictaphones) {
        System.out.println("\nDictaphones manufactured before 2015:");
        for (Dictaphone d : dictaphones) {
            if (d.getYearOfManufacture() < 2015) System.out.println("\n" + d);
        }
    }

    private static void displayMostSuitableDictaphone(Dictaphone[] dictaphones) {
        Arrays.sort(dictaphones);
        System.out.println("\nMost Suitable Dictaphone:\n" + dictaphones[dictaphones.length - 1]);
    }
}

