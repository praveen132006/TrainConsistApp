public class TrainConsistManagementt {

    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    static class PassengerBogie {
        String type;
        int capacity;

        PassengerBogie(String type, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }

            this.type = type;
            this.capacity = capacity;
        }

        void display() {
            System.out.println("Bogie Type : " + type);
            System.out.println("Capacity   : " + capacity);
        }
    }

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println(" UC14 - Handle Invalid Bogie Capacity ");
        System.out.println("==============================================");

        try {
            PassengerBogie b1 = new PassengerBogie("Passenger", 72);
            System.out.println("\nValid Bogie Created Successfully");
            b1.display();
        } catch (InvalidCapacityException e) {
            System.out.println(e.getMessage());
        }

        try {
            PassengerBogie b2 = new PassengerBogie("Passenger", 0);
            b2.display();
        } catch (InvalidCapacityException e) {
            System.out.println("\nError: " + e.getMessage());
        }

        System.out.println("\nProgram continues safely...");
    }
}
