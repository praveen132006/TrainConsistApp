import java.util.Arrays;

public class TrainConsistMgmnt {

    static boolean binarySearch(String[] bogieIds, String key) {

        Arrays.sort(bogieIds);

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;
            int result = key.compareTo(bogieIds[mid]);

            if (result == 0) {
                return true;
            } else if (result > 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println(" UC19 - Binary Search for Bogie ID ");
        System.out.println("==================================================\n");

        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        String key = "BG309";

        Arrays.sort(bogieIds);
        System.out.println("Sorted Bogie IDs:");
        for (String id : bogieIds) {
            System.out.print(id + " ");
        }

        boolean found = binarySearch(bogieIds, key);

        if (found) {
            System.out.println("\n\nBogie ID " + key + " found.");
        } else {
            System.out.println("\n\nBogie ID " + key + " not found.");
        }

        System.out.println("\nProgram continues...");
    }
}