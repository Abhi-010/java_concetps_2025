package streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SplitStringFreqMap {
    public static void main(String[] args) {
        String str = "apple banana apple cherry";
        String[] strArrary = str.split(" ");


        Map<String, Long> collect = Arrays.stream(strArrary)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // If you need ordering :

        LinkedHashMap<String, Long> collect1 = Arrays.stream(strArrary)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));


        // if you need sorting :

        TreeMap<String, Long> collect3 = Arrays.stream(strArrary)
                .collect(Collectors.groupingBy(Function.identity(),TreeMap::new,  Collectors.counting()));

    }
}
