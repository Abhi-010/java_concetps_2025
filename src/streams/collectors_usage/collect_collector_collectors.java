package streams.collectors_usage;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class collect_collector_collectors {
    private static final List<Integer> list = Arrays.asList(3,41,2,3,4,5,1,1);

    public static void main(String[] args) {
        Set<Integer> collect = list.stream().collect(Collectors.toSet());
       // collect.forEach(System.out::println);

        List<User> userList = Arrays.asList(new User(1L,"Abhi","KOL"),new User(2L,"Marc","KOL")) ;

        Map<Long, String> collect1 = userList.stream().collect(Collectors.toMap(User::getId, User::getName));
       // collect1.forEach((key,value)->System.out.println(key + ":" + value));


        // groupingBy ??

        List<String>  listOfWords = Arrays.asList("Stay", "Success","somewhere","work","big","smiling","apple","zebra","polo");

        Map<Integer, List<String>> collect2 = listOfWords.stream().collect(Collectors.groupingBy(String::length));
       // collect2.forEach((key,value)->System.out.println(key + ":" + value));

        Map<Character, List<String>> collect3 = listOfWords.stream().collect(Collectors.groupingBy(s -> s.charAt(0)));
       // collect3.forEach((key,value)->System.out.println(key + ":" + value));


       // System.out.println("lenths....");
        Map<Character, List<Integer>> lengths =
                listOfWords.stream()
                        .collect(Collectors.groupingBy(
                                word -> word.charAt(0),
                                Collectors.mapping(String::length, Collectors.toList())
                        ));

        //lengths.forEach( (key,value)-> System.out.println(key + ":" + value ));


        // group by even and odd
        // even : [], odd : []

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        Map<Boolean,List<Integer>> booleanListMap =
                numbers.stream().collect(
                        Collectors.groupingBy(i->i%2==0 , Collectors.toList())
                );

       // booleanListMap.forEach((key,value)-> System.out.println(key + ":" + value));

        Map<Boolean, List<Integer>> result1 =
                numbers.stream()
                        .collect(Collectors.groupingBy(n -> n % 2 == 0));

        //result1.forEach((key,value)-> System.out.println(key + ":" + value));


       Map<Character,Long> map1 =  listOfWords.stream()
                .collect(Collectors.groupingBy(word -> word.charAt(0)
                         ,
                        Collectors.counting()
                        )

                );

       // map1.forEach((key,value)-> System.out.println(key + ":" + value));

        collectors_Method();




    }

    public static void collectors_Method(){

        // *** toList/toSet ****
        List<Integer> list = Arrays.asList(3,41,2,3,4,5,1,1);

        Set<Integer> set = list.stream().collect(Collectors.toSet());

        set.forEach(System.out::println);


        //**** toMap ******

        Stream<String[]> stream = Stream.of(
                new String[]{"std-001", "Sam Wilson"},
                new String[]{"std-002", "Kate Moore"},
                new String[]{"std-003", "Jim Martin"}
        );

        Map<String,String> map = stream.collect(Collectors.toMap(x->x[0], x->x[1]));
        map.entrySet().forEach(System.out::println);


        // ** Counting Elements in Stream :

        List<String> items = Arrays.asList("apple", "banana", "apple", "cherry");

        long count = items.stream().count();
        //System.out.println("count is "+ count);

        long count1 = items.stream().collect(Collectors.counting());
        //System.out.println("count1 is "+ count1);


        // ** SummingInt
        list = Arrays.asList(3,41,2,3,4,5,1,1);

        long sum = list.stream().collect(Collectors.summingInt(i->i.intValue())) ;

        list.stream().mapToInt(i -> i.intValue()).sum();

        list.stream().mapToInt(i -> i.intValue()).average() ;


        //System.out.println("sum : " + sum);


        // ** summingDouble **
        List<Double> doubleList = Arrays.asList(4.4,8.9,0.8);
        double valve = doubleList.stream().collect(Collectors.summingDouble(d-> d));

        double value1 = doubleList.stream().mapToDouble(i-> i).sum() ;
       // System.out.println("Value : " + valve);
        //System.out.println("Value1 : " + value1);


        list = Arrays.asList(3,41,2,3,4,5,1,1);
        Optional<Integer> max1 = list.stream().max((i1, i2)-> Integer.compare(i1,i2)) ;
        Optional<Integer> max2 = list.stream().max(Integer::compare) ;

        Optional<Integer> min2 = list.stream().min(Integer::compare) ;


        // ** Collectors.mapping

        User u1 = new User(101l,"Abhi", "Mum");
        User u2 = new User(102l,"Ram", "Mum");
        User u3 = new User(103l,"Shyam", "Ban");
        User u4 = new User(104l,"Marc", "Ban");
        User u5 = new User(105l,"Yo", "Kol");
        User u6 = new User(105l,"Yo", "Kol");

        List<User> userList = Arrays.asList(u1,u2,u3,u4,u5,u6);

        Map<String, Set<String>> collect = userList.stream().
                collect(Collectors.groupingBy(User::getRegion, Collectors.mapping(User::getName, Collectors.toSet())));


        //collect.entrySet().forEach(System.out::println);


        // Collectors.flatMapping

        List<Department> depts = Department.getDepartment() ;

        Map<String,List<String>> map1 = depts.stream()
                .collect(
                        Collectors.groupingBy(
                                Department::getName,Collectors.flatMapping(d->d.getProjects().stream(),Collectors.toList() )
                        )
                );

        map1.entrySet().forEach(System.out::println);
    }
}


















