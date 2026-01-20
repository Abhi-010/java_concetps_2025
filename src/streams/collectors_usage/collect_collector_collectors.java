package streams.collectors_usage;

import java.util.*;
import java.util.stream.Collectors;

public class collect_collector_collectors {
    private static final List<Integer> list = Arrays.asList(3,41,2,3,4,5,1,1);

    public static void main(String[] args) {
        Set<Integer> collect = list.stream().collect(Collectors.toSet());
        collect.forEach(System.out::println);

        List<User> userList = Arrays.asList(new User(1L,"Abhi"),new User(2L,"Marc")) ;

        Map<Long, String> collect1 = userList.stream().collect(Collectors.toMap(User::getId, User::getName));
        collect1.forEach((key,value)->System.out.println(key + ":" + value));


        // groupingBy ??

        List<String>  listOfWords = Arrays.asList("Stay", "Success","somewhere","work","big","smiling","apple","zebra","polo");

        Map<Integer, List<String>> collect2 = listOfWords.stream().collect(Collectors.groupingBy(String::length));
        collect2.forEach((key,value)->System.out.println(key + ":" + value));

        Map<Character, List<String>> collect3 = listOfWords.stream().collect(Collectors.groupingBy(s -> s.charAt(0)));
        collect3.forEach((key,value)->System.out.println(key + ":" + value));


        System.out.println("lenths....");
        Map<Character, List<Integer>> lengths =
                listOfWords.stream()
                        .collect(Collectors.groupingBy(
                                word -> word.charAt(0),
                                Collectors.mapping(String::length, Collectors.toList())
                        ));

        lengths.forEach( (key,value)-> System.out.println(key + ":" + value ));


        // group by even and odd
        // even : [], odd : []

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        Map<Boolean,List<Integer>> booleanListMap =
                numbers.stream().collect(
                        Collectors.groupingBy(i->i%2==0 , Collectors.toList())
                );

        booleanListMap.forEach((key,value)-> System.out.println(key + ":" + value));

        Map<Boolean, List<Integer>> result1 =
                numbers.stream()
                        .collect(Collectors.groupingBy(n -> n % 2 == 0));

        result1.forEach((key,value)-> System.out.println(key + ":" + value));


       Map<Character,Long> map1 =  listOfWords.stream()
                .collect(Collectors.groupingBy(word -> word.charAt(0)
                         ,
                        Collectors.counting()
                        )

                );

        map1.forEach((key,value)-> System.out.println(key + ":" + value));





    }
}
