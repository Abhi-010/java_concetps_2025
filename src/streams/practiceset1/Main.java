package streams.practiceset1;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // 1. Java program to count the occurrence of each character in a string.


        String input = "ilovejavatechi" ;
        String[] results = input.split("");

        List<String> list = Arrays.asList(results) ;
        Map<String,Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())) ;
        System.out.println(map);


        // 2. Java Program to find all duplicates element from a given string

        list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().
                filter(x->x.getValue() > 1).map(Map.Entry::getKey).toList().forEach(System.out::print);



        Map<String,Integer> map1 = new HashMap<>();
        map1.put("a",1) ;
        map1.put("v",2);
        map1.put("e",0) ;
        map1.put("q",4) ;

        System.out.println();
        System.out.println("map iterate..");
        map1.entrySet().stream().filter(m-> (m.getValue() > 0)).forEach(System.out::print);


        // 3. Find the non-repeat element from a given string

        String inputString = "iirr";
        List<String> l1 = Arrays.asList(inputString.split("")) ;
        Map<String,Long> map2 = l1.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println();
        System.out.println("map2 " + map2);

        Optional<String> firstNon = l1.stream().filter(x->map2.get(x) > 1).findFirst() ;
        if(!firstNon.isEmpty()){
            System.out.println("first non " + firstNon.get());
        }
        else{
            System.out.println("sdhfoshdfod");
        }


        /** 4. find the largest number in an Array **/

        int[] A = {};

        List<Integer> l  = Arrays.stream(A).boxed().sorted(Comparator.reverseOrder()).toList();
        Optional<Integer> optionalI = l.stream().findFirst();
        if(optionalI.isEmpty()){
            System.out.println("No Such Element found");
            return ;
        }
        System.out.println("Largest Integer : " + optionalI.get() );





    }

}
