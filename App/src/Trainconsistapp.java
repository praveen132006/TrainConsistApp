import java.util.LinkedHashSet;
import java.util.Set;

public class Trainconsistapp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC5 - Preserve Insertion Order of Bogies\n");

        // Create LinkedHashSet
        Set<String> formation = new LinkedHashSet<>();

        // Add bogies
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        // Add duplicate intentionally
        formation.add("Sleeper"); // Duplicate (ignored)

        // Display final formation
        System.out.println("Final Train Formation:");
        System.out.println(formation);

        System.out.println("\nProgram continues...");
    }
}