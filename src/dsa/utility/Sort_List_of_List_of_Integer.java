package dsa.utility;

import java.util.*;

public class Sort_List_of_List_of_Integer {
    public static void main(String[] args) {

        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(-1,20,4,-1), Arrays.asList(3,2,1,10)
        );

        List<Integer> list1 = Arrays.asList(-1,20,4,-1) ;
        List<Integer> list2 = Arrays.asList(3,2,1,10) ;

        // sort this as this :
        // list 1 : 4,20, -1,-1
        // list 2 : 1, 2,  3, 10

        // 1  23 4  -1
        // -3  2  1 10

        list.sort(Comparator.comparing(List::getFirst)) ;

        list.forEach(System.out::println);


    }
}
