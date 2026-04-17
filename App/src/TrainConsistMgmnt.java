public class TrainConsistMgmnt {

    static boolean searchBogie(String[] bogieIds, String searchId) {

        if (bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available for search.");
        }

        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println(" UC20 - Fail-Fast Validation Before Search ");
        System.out.println("==================================================\n");

        String[] bogieIds = {};

        String searchId = "BG101";

        try {
            boolean found = searchBogie(bogieIds, searchId);

            if (found) {
                System.out.println("Bogie ID " + searchId + " found.");
            } else {
                System.out.println("Bogie ID " + searchId + " not found.");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nUC20 execution completed...");
    }
}