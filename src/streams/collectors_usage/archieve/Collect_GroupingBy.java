package streams.collectors_usage.archieve;

import streams.EmployeeClass;
import streams.entity.User;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Collect_GroupingBy {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);

        Map<String, Long> groupByEvenOddNumbers =
                numbers.stream()
                        .collect( Collectors.groupingBy( (n -> n % 2 == 0 ? "Even" : "Odd"), Collectors.counting()));

        groupByEvenOddNumbers.forEach((n, count) -> System.out.println(n + " : " + count));

        Map<String, List<Integer>> collect = numbers.stream().collect(Collectors.groupingBy(n -> n % 2 == 0 ? "Even" : "Odd"));

        collect.entrySet().forEach(System.out::println);


        String s = "I love programming in Java";

        String[] strArray = s.split("");

        Map<String,Long> map21 = Arrays.stream(strArray).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        map21.entrySet().forEach(System.out::println);

        User u1 = new User(101l,"Abhi", "Mum");
        User u2 = new User(102l,"Abhi", "Mum");
        User u3 = new User(103l,"Abhi", "Ban");
        User u4 = new User(104l,"Abhi", "Ban");
        User u5 = new User(105l,"Abhi", "Kol");

        List<User> userList = Arrays.asList(u1,u2,u3,u4,u5);

        Map<String, List<User>> collect1 = userList.stream().collect(Collectors.groupingBy(user -> user.getRegion()));

        collect1.entrySet().forEach(System.out::println);


        Map<String,Long> countUserPerRegion = userList.stream().collect( Collectors.groupingBy(User::getRegion,Collectors.counting())) ;

        countUserPerRegion.entrySet().forEach(System.out::println);

        System.out.println("** Collectors.mapping **");

        Map<String, List<String>> collect2 =
                userList.stream().collect(Collectors.groupingBy(User::getRegion, Collectors.mapping(User::getName, Collectors.toList())));

        collect2.entrySet().forEach(System.out::println);


        List<String> names = Arrays.asList("Ram","Shyam","John","Adam","Rita","Ram","Shyam") ;
        Map<Integer,Long> map1 = names.stream().collect(Collectors.groupingBy(String::length,Collectors.counting())) ;
        map1.entrySet().forEach(System.out::println);


        //Given List<Employee>, Find out number of top 3 highly paid “Engineering” ?

        List<EmployeeClass> employees = List.of(
                new EmployeeClass("Alice", "Engineering", 120000),
                new EmployeeClass("Bob", "Sales", 90000),
                new EmployeeClass("Charlie", "Engineering", 150000),
                new EmployeeClass("David", "Engineering", 110000),
                new EmployeeClass("Eve", "Engineering", 160000)
        );

            List<EmployeeClass> top3HighlyPaidEngineers = employees.stream()
                    .filter(e -> e.getDepartment().equals("Engineering"))
                    .sorted((e1, e2) -> Integer.compare(e2.getSalary(), e1.getSalary()))
                    .limit(3)
                    .toList();

    }
}
