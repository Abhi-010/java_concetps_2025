package streams_parallel;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        // DANGEROUS: Modifying a shared, non-thread-safe state
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        List<Integer> result = new ArrayList<>(); // ArrayList is not thread-safe!

        list.parallelStream()
                .map(x -> x * 2)
                .forEach(x -> result.add(x)); // Multiple threads calling .add() concurrently

    }
}
