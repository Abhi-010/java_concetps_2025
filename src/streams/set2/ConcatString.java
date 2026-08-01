package streams.set2;

import java.util.List;
import java.util.stream.Collectors;

public class ConcatString {
    public static void main(String[] args) {
        List<String> list = List.of("Hello", "World", "From Java !");

        String output = list.stream()
                .filter(str -> str.length() == 5)
                .collect(Collectors.joining(",","[","]"));

        System.out.println(output);

    }
}
