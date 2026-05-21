package streams.collectors_usage;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Collect_GroupingBy {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        Map<String, List<Integer>> collect = numbers.stream().collect(Collectors.groupingBy(n -> n % 2 == 0 ? "Even" : "Odd"));
        collect.entrySet().forEach(System.out::println);

        User u1 = new User(101l,"Abhi", "Mum");
        User u2 = new User(102l,"Abhi", "Mum");
        User u3 = new User(103l,"Abhi", "Ban");
        User u4 = new User(104l,"Abhi", "Ban");
        User u5 = new User(105l,"Abhi", "Kol");

        List<User> userList = Arrays.asList(u1,u2,u3,u4,u5);

        Map<String, List<User>> collect1 = userList.stream().collect(Collectors.groupingBy(User::getRegion));

        collect1.entrySet().forEach(System.out::println);


        Map<String,Long> countUserPerRegion = userList.stream().collect( Collectors.groupingBy(User::getRegion,Collectors.counting())) ;

        countUserPerRegion.entrySet().forEach(System.out::println);

        System.out.println("** Collectors.mapping **");

        Map<String, List<String>> collect2 =
                userList.stream().collect(Collectors.groupingBy(User::getRegion, Collectors.mapping(User::getName, Collectors.toList())));

        collect2.entrySet().forEach(System.out::println);


        List<String> names = Arrays.asList("Ram","Shyam","John","Adam","Rita","Ram","Shyam") ;

        Map<Character, List<String>> collect3 = names.stream().collect(Collectors.groupingBy(s->s.charAt(0))) ;

        collect3.entrySet().forEach(System.out::println);


        Map<Integer,List<String>> map1 = names.stream().collect(Collectors.groupingBy(String::length,Collectors.toList())) ;
        map1.entrySet().forEach(System.out::println);

    }
}
