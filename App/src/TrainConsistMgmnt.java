public class TrainConsistMgmnt {

    // Linear Search Method
    static boolean linearSearch(String[] bogieIds, String searchId) {

        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println(" UC18 - Search Bogie ID Using Linear Search ");
        System.out.println("==================================================\n");

        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        String searchId = "BG309";

        System.out.println("Available Bogie IDs:");
        for (String id : bogieIds) {
            System.out.print(id + " ");
        }

        boolean found = linearSearch(bogieIds, searchId);

        if (found) {
            System.out.println("\n\nBogie ID " + searchId + " found.");
        } else {
            System.out.println("\n\nBogie ID " + searchId + " not found.");
        }

        System.out.println("\nProgram continues...");
    }
}