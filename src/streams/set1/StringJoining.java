package streams.set1;

import java.util.List;
import java.util.stream.Collectors;

public class StringJoining {
    public static void main(String[] args) {
        List<String> names = List.of("Abhishek", "Amit", "Rahul", "Rohit");

        String output = names.stream()
                .collect(Collectors.joining(",", "[ " ,"]"));

        System.out.println(output);
    }
}
