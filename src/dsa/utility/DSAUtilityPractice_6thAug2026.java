package dsa.utility;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DSAUtilityPractice_6thAug2026 {
    public static void main(String[] args) {
        // Immutable List :
        List<Integer> list = new ArrayList<>(List.of(4, 1, 2, 3, 10, 11, -1));

        // how to make it mutuable is :

        List<Integer> list1 = new ArrayList<>(List.of(4,1,2,3,10,11,-1));
        list1.add(9);
        list1.stream().forEach(System.out::println);

        Collections.sort(list1);

        System.out.println("After sorting in Ascending order");
        list1.stream().forEach(System.out::println);
        Collections.sort(list1,Collections.reverseOrder()) ;

    }
}
