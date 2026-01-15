package streams.collectors_usage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class collect_collector_collectors {
    private static final List<Integer> list = Arrays.asList(3,41,2,3,4,5,1,1);

    public static void main(String[] args) {
        Set<Integer> collect = list.stream().collect(Collectors.toSet());
        collect.forEach(System.out::println);

    }
}
