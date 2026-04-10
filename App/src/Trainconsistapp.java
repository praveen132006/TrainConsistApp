import java.util.*;

public class Trainconsistapp {

    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC7 - Sort Bogies by Capacity\n");

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));

        System.out.println("Before Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        bogies.sort((a, b) -> a.capacity - b.capacity);

        System.out.println("\nAfter Sorting (By Capacity):");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }
    }
}