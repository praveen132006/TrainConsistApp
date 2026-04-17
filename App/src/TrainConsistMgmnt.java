import java.util.Scanner;
import java.util.regex.Pattern;

public class TrainConsistMgmnt {

    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    static class GoodsBogie {
        String shape;
        String cargo;

        GoodsBogie(String shape) {
            this.shape = shape;
        }

        void assignCargo(String cargo) {
            try {
                if (cargo.equalsIgnoreCase("Petroleum") &&
                        !shape.equalsIgnoreCase("Cylindrical")) {

                    throw new CargoSafetyException(
                            "Petroleum can only be transported in Cylindrical bogie"
                    );
                }

                this.cargo = cargo;
                System.out.println("Cargo Assigned Successfully: " + cargo);

            } catch (CargoSafetyException e) {
                System.out.println("Error: " + e.getMessage());

            } finally {
                System.out.println("Validation completed.");
            }
        }

        void display() {
            System.out.println("Bogie Shape : " + shape);
            System.out.println("Cargo       : " + cargo);
        }
    }

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println(" UC15 - Handle Unsafe Cargo Assignment ");
        System.out.println("==============================================");

        GoodsBogie g1 = new GoodsBogie("Cylindrical");
        g1.assignCargo("Petroleum");
        g1.display();

        System.out.println();

        GoodsBogie g2 = new GoodsBogie("Rectangular");
        g2.assignCargo("Petroleum");
        g2.display();

        System.out.println("\nProgram continues safely...");
    }
}