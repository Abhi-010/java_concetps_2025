package streams.practiceset1;

import java.util.*;
import java.util.stream.Collectors;

public class StreamAPIPrac {
    public static void main(String[] args) {
        /**
         * Collect is a terminal operation
         */


        List<String> fruits = Arrays.asList("Apple", "Mango", "Orange", "Apple");

        fruits.stream().filter(name->name.length() > 5).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("-------");

        fruits.stream().collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("----------------");

        List<String> names = List.of("Alice", "Bob", "Charlie", "Anna");

        Map<Character, List<String>> collect = names.stream().collect(Collectors.groupingBy(name -> name.charAt(0)));

        System.out.println(collect);

        System.out.println("--------------------");

        List<Java8_coding.Student> studentList = List.of(new Java8_coding.Student("Abhi", 31), new Student("Aana", 40), new Student("Bob",55));

        Map<Character, List<Student>> collect1 =
                studentList.stream().
                        collect(Collectors.groupingBy(student -> student.getName().charAt(0)));

        System.out.println(collect1);

        System.out.println("--------------------");

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        Map<Boolean, List<Integer>> partitioned = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println(partitioned);

        System.out.println("-------");

        List<String> someList = List.of("apple", "cat","dog");
        Map<Boolean, List<String>> collect2 =
                someList.stream().collect(Collectors.partitioningBy(item -> item.length() > 3));

        System.out.println(collect2);


        Map<Integer, List<Character>> groupedInitials = List.of("Tom", "Tim", "Ana", "Amy","Abhi").stream()
                .collect(Collectors.groupingBy(
                        String::length,
                        Collectors.mapping(name -> name.charAt(0), Collectors.toList())
                ));

        System.out.println(groupedInitials);


        System.out.println("-----------------------------------------");

        List<Integer> numbers1 = List.of(1, 2, 3, 4, 5, 6);

        List<Integer> collect3 = numbers1.stream().filter( i -> i % 2 == 0).collect(Collectors.toList()) ;

        System.out.println("collect 3 " + collect3);

        List<String> names1 = List.of("alice", "bob", "charlie");
        names1.stream().map(name-> name.toUpperCase()).forEach(System.out::println);

        List<Integer> numbers2 = List.of(3, 1, 4, 2);
        numbers2.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);


        List<String> names3 = List.of("Anna", "Alex", "Bob", "Alice");

        Map<Integer, List<String>> collect4 = names3.stream().collect(Collectors.groupingBy(str -> str.length()));

        System.out.println(collect4);

        List<Developer> devs = List.of(
                new Developer("A", List.of("Java", "Spring")),
                new Developer("B", List.of("Java", "React")),
                new Developer("C", List.of("Python"))
        );

        // ques is :

        Set<String> collect5 = devs.stream()
                .flatMap(dev -> dev.getSkills().stream())
                .collect(Collectors.toSet());
        System.out.println(collect5);


        List<Integer> nums = List.of(10, 20, 30, 40);

        Integer i = nums.stream()
                .filter(i1 -> i1 >= 20)
                        .reduce((a, b) -> a + b).get();
        System.out.println(i);

        List<String> words = List.of("cat", "elephant", "dog", "giraffe");

        Optional<String> reduce = words.stream()
                .reduce((word1, word2) -> word1.length() >= word2.length() ? word1 : word2);

        System.out.println(reduce.get());

        List<String> words1 = List.of("Java", "Stream", "API");

        System.out.println(words1.stream()
                        .map(word9-> word9.length())
                .reduce(0,(a,b) -> a+b)

        );

    }
}
