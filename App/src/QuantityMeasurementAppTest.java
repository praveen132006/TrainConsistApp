import java.util.*;
import java.util.stream.Collectors;

public class QuantityMeasurementAppTest {

    static class Bogie {
        String type;
        int capacity;

        Bogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println(" UC13 - Performance Comparison (Loops vs Streams)");
        System.out.println("==============================================\n");

        List<Bogie> bogies = new ArrayList<>();

        for (int i = 1; i <= 100000; i++) {
            bogies.add(new Bogie("Cargo", i % 100));
        }

        long startLoop = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        long startStream = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        System.out.println("Loop Filtered Bogies   : " + loopResult.size());
        System.out.println("Loop Execution Time   : " + loopTime + " ns");

        System.out.println();

        System.out.println("Stream Filtered Bogies: " + streamResult.size());
        System.out.println("Stream Execution Time : " + streamTime + " ns");

        System.out.println();

        if (loopTime < streamTime) {
            System.out.println("Loop is faster.");
        } else {
            System.out.println("Stream is faster.");
        }
    }
}