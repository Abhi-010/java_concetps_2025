package streams.set2;

import java.util.List;
import java.util.stream.Collectors;

public class SkipElementsInList {
    public static void main(String[] args) {
        List<Integer> list = List.of(4,5,1,2,10,2,50,9,91) ;

        List<Integer> newList = list.stream()
                .skip(2).limit(3).toList();

        newList.forEach(System.out::println);
    }
}
