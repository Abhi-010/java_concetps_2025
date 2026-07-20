package streams.set1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectValuesWithEvenKeys {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Hello");
        map.put(2,"World");
        map.put(3,"Java");
        map.put(4,"JavaScript");

        List<String> stringList = map.entrySet().stream()
                .filter((key) -> key.getKey() != null && key.getKey() % 2 == 0)
                .map(Map.Entry::getValue)
                .toList();

        stringList.forEach(System.out::println);
    }
}
