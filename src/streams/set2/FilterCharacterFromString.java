package streams.set2;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FilterCharacterFromString {
    public static void main(String[] args) {
        //List<String> list = List.of("Hello", "World", "From Java !", "How");
        List<String> list1 = List.of("World", "From Java !", "zero");

       Optional<String> output = list1.stream()
                .filter(str -> str.contains("z"))
                .findAny() ;


        System.out.println(output.orElse(null));


    }
}
