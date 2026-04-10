import java.util.LinkedList;
import java.util.List;

public class Trainconsistapp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC4 - Maintain Ordered Bogie Consist\n");

        // Create LinkedList
        List<String> trainConsist = new LinkedList<>();

        // Add bogies
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist);

        // Insert Pantry Car at position 2 (index starts from 0)
        trainConsist.add(2, "Pantry Car");

        System.out.println("\nAfter inserting Pantry Car at position 2:");
        System.out.println(trainConsist);

        // Remove first and last bogie
        ((LinkedList<String>) trainConsist).removeFirst();
        ((LinkedList<String>) trainConsist).removeLast();

        System.out.println("\nAfter removing first and last bogie:");
        System.out.println(trainConsist);

        System.out.println("\nFinal Train Consist:");
        System.out.println(trainConsist);

        System.out.println("\nProgram continues...");
    }
}