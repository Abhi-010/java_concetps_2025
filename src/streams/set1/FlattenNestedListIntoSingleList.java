package streams.set1;

import java.util.List;

public class FlattenNestedListIntoSingleList {
    public static void main(String[] args) {
        List<List<Integer>> listOfList = List.of(List.of(1,2,3),List.of(4,5,6),List.of(7,8,9)) ;


        List<Integer> singleList = listOfList.stream()
                .flatMap(list -> list.stream())
                .toList() ;

//        singleList = listOfList.stream()
//                .flatMap(Collection::stream).toList() ;

        singleList.forEach(System.out::println);
    }
}
