package streams.set2;

import java.util.List;

public class NoneMatchExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 10, 15, -20);

        // Verify that none of the numbers are negative (< 0)
        boolean allPositive = numbers.stream()
                .noneMatch(n -> n < 0);

        System.out.println("Are there no negative numbers? " + allPositive);
    }
}
