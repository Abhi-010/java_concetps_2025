package streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Persistent {
    private static final List<String> listOfWords = Arrays.asList("Stay", "Success","somewhere","work","big","smiling");

    //private static final String s = "Abhishek" ;
    public static void main(String[] args) {
        /*
        Ques 1 : Given a List<String>, filter out strings that start with the letter "S" (case-sensitive) and
        convert the remaining strings to uppercase. Return the result as a List.
         */
        System.out.println("Q1 : -------------------");
        List<String> ans = listOfWords.stream().filter(s->s.toUpperCase().charAt(0) == 'S').toList() ;
        ans.forEach(System.out::println);
        System.out.println("Q2 : -------------------");

        /*
        Question 2 : Extract the vowels from the string
         */

        String s = "abhishekiiouou";
        System.out.println("Vowels");
        List<Character> vow =    s.chars()
                                .mapToObj(c -> (char) c)
                                .filter(c -> "aeiou".indexOf(c) != -1)
                                .distinct().
                                collect(Collectors.toList());

        vow.forEach(System.out::println);
        System.out.println("Vowels");

        String vowels = "aeiou" ;

        IntStream intStream = s.chars() ;

        long count = intStream.count();
        System.out.println(count);
        System.out.println("Q3 : -------------------------");

        List<Integer> integerList = Arrays.asList(4,5,10,101,21,89);

        List<Integer> integerList1 =
                integerList.stream().sorted((i1,i2)->Integer.compare(i1,i2)).toList();

        System.out.println("Soring Using reverseOrder");
        integerList1.stream().sorted().toList().forEach(System.out::println);
        System.out.println("Soring Using reverseOrder");

        System.out.println("IntegerList 1");
        integerList1.forEach(System.out::println);
        System.out.println("IntegerList 1");


        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int i1 = (int) o1;
                int i2 = (int) o2;

                if(i1 > i2){
                    return 1;
                }
                else if( i1 < i2){
                    return -1;
                }
                return 0 ;
            }
        };

        Optional<Integer> max = integerList.stream().max(comparator);
        System.out.println(max.get());

        integerList = Arrays.asList(4,5,1,5,5);

        System.out.println("sorted list :");
        integerList.stream().sorted(Comparator.reverseOrder()).toList().forEach(System.out::println);
        System.out.println("sorted list :");


        /*
        Q4 : Using a modifiable collection with Collectors.toCollection()
        allows you to perform additional operations on the collected data after the stream processing is complete.
         */
        ArrayList<Integer> collect = integerList.stream().collect(Collectors.toCollection(ArrayList::new));
        // ArrayList<Integer> newCollect = new ArrayList<>(integerList) ;
        collect.add(9000);
        collect.forEach(System.out::println);

        integerList = Arrays.asList(4,5,10,101,21,89);
        OptionalInt max1 = integerList.stream().filter(i->i > 1).mapToInt(i -> i).max();
        System.out.println("max1.getAsInt() : " + max1.getAsInt());

        String s1 = "helloworldaaie";
        String[] a1 = s1.split("");

        HashSet<String> set = new HashSet<>();
        set.add("a");
        set.add("e");
        set.add("i") ;
        set.add("o");
        set.add("u");

        List<String>  ans1 = Arrays.stream(a1).filter(set::contains).distinct().toList();
        ans1.forEach(System.out::println);

        List<List<Integer>> listList = Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(4,5,6));

        List<Integer> flapList = listList.stream().flatMap(Collection::stream).toList() ;

        flapList.forEach(System.out::println);


        System.out.println("Q11 : -------------------------");
        //11. you have list<Employee>. find duplicates in the list for the employee which has same name.

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Abhisek", 34, 100));
        employeeList.add(new Employee("Ganesh", 31, 1000));
        employeeList.add(new Employee("Ganesh", 33, 1000));
        employeeList.add(new Employee("Vara", 21, 100));
        employeeList.add(new Employee("Vara", 22, 100));

        Map<String,Long> employeeG =
                employeeList.stream().collect(Collectors.groupingBy(Employee::getName,Collectors.counting()));

        employeeG.entrySet().forEach(System.out::println);


          /*
        10. Extracting Map Keys to a List
    Given a Map<Integer, String> map, extract all the values (Strings) that correspond to an even key, and collect them into a List.
    Focus: entrySet().stream(), filter(), map().
         */
        System.out.println("Answer 10  : ");
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"string1");
        map.put(2,"string2");
        map.put(3,"string3");

        Map<Boolean,List<String>> map2 = map.entrySet().stream()
                .collect(
                        Collectors.partitioningBy(
                                entry->entry.getKey()%2==0,
                                Collectors.mapping(
                                        Map.Entry::getValue,Collectors.toList()
                                )
                        )
                );
        map2.entrySet().forEach(System.out::println);

         /*
        9. Check for a Condition (Short-circuiting)
Given a List<Integer>, write a stream that returns true if all elements in the list are greater than 10.
Focus: allMatch().
         */
        System.out.println("Answer 9  : ");
        List<Integer> duplicates = Arrays.asList(3,4,5,9,2);

        Boolean b = duplicates.stream().allMatch(e->e<10);
        System.out.println(b);

/*
        8. Grouping by Property
        Given a List<Student>, group the students by their "Grade" (e.g., A, B, C). The result should be a Map<String, List<Student>>.
        Focus: Collectors.groupingBy().
                */
                System.out.println("Answer 8  : ");

        Student s4 = new Student("Abhi","A");
        Student s2 = new Student("Bob", "B");
        Student s3 = new Student("Chris", "A");

        List<Student> studentList = Arrays.asList(s4,s2,s3);

        Map<String,List<Student>> gradeStudent =
        studentList.stream()
                .collect(
                        Collectors.groupingBy(
                                Student::getGrade
                        )
                );

        gradeStudent.entrySet().stream().forEach(System.out::println) ;

        /*
        7. String Joining
        Given a List<String> of names, create a single String that joins them all together, separated by a comma and a space,
        and enclosed in square brackets (e.g., "[John, Jane, Doe]").
        Focus: Collectors.joining(delimiter, prefix, suffix).
                 */
        System.out.println("Answer 7  : ");
        List<String> names = Arrays.asList("John", "Jane", "Doe");

        String str = names.stream().collect(Collectors.joining( "," , "[ ", " ]"));
        System.out.println(str);


               /*
6. Removing Duplicates and Sorting
Given an array of integers int[] nums = {5, 2, 8, 2, 5, 1}, return a sorted list of unique numbers.
         */
        System.out.println("Answer  6 : ");
        int[] nums = {5, 2, 8, 2, 5, 1};

       List<Integer> listnum = Arrays.stream(nums).mapToObj(obj->(Integer)obj).toList();
       List<Integer> sorted = listnum.stream().sorted().distinct().toList();
        sorted.stream().forEach(System.out::println);

//        Map<Integer, Integer> collect1 = Arrays.stream(nums).boxed().collect(Collectors.toMap(i -> nums[i],  // Key: The element at index i
//                i -> i));


        System.out.println("new question : ");

//        collect1.entrySet().forEach(System.out::println);

        System.out.println("new question : ");

               /*
5. Counting Occurrences (Frequency Map)
Given a String (e.g., "apple banana apple cherry"), split it by spaces and use streams to create a Map<String, Long>
where the key is the word and the value is its frequency.
Focus: Collectors.groupingBy(), Collectors.counting().
         */

        System.out.println("Answer 5 : ");

        String str1 = "apple banana apple cherry";

        String[] str1Array = str1.split(" ");

        List<String> stringList = Arrays.stream(str1Array).toList() ;

        Map<String,Long> freqMap =
        stringList.stream().collect(
                Collectors.groupingBy(
                        s5->s5.toString(),Collectors.counting()
                )
        );

        freqMap.entrySet().forEach(System.out::println);

            /*
        Given a List<Employee>, find the Employee object with the highest salary. If the list is empty, return an empty Optional.
         */
        System.out.println("Answer 4 : ");
        Employee e1 = new Employee("Ganesh", 45,100);
        Employee e2 = new Employee("Sanjana", 25,200);
        Employee e3 = new Employee("Vara", 21,300);

        List<Employee> employeeList1 = Arrays.asList(e1,e2,e3);

        Optional<Employee> employeeOptional =
                employeeList1.stream().max(
                        (e8,e7) -> Integer.compare(e8.getSalary(),e7.getSalary())
                );

        if(employeeOptional.isPresent()){
            System.out.println(employeeOptional.get().getName());
        }
        employeeOptional.ifPresent(e-> System.out.println(e.getName()));

        System.out.println("Answer 3 : ");
        List<List<Integer>> listList1 = Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(4,5,6));

        List<Integer> list19 = listList1.stream().flatMap(temp->temp.stream()).toList() ;
        list19.forEach(System.out::println);

        str = "hello world how are you ";
        HashSet<Character> set1 = new HashSet<>();
        set1.add('a');
        set1.add('e');
        set1.add('i') ;
        set1.add('o');
        set1.add('u');

        List<Character> charList = str.chars().mapToObj(ch->(char)ch).filter(e->set1.contains(e)).toList() ;

        System.out.println("hello..");
        System.out.println(charList.size());
        charList.forEach(System.out::println);

        /*
        13. Find Any vs. Find First
        Given a List<String>, find any element that contains the letter "z". Return the result as an Optional<String>.
        Focus: filter(), findAny().
         */

        List<String> words = listOfWords.stream().filter(s41->s41.contains("s")).toList() ;
        words.forEach(System.out::println);

        List<Integer> list = Arrays.asList(101,2,4,4,6,10);
        OptionalInt max12 = list.stream().mapToInt(Integer::intValue).max() ;

        Optional<Integer> max32 = list.stream().max(Comparator.reverseOrder());
        max32.ifPresent(System.out::println);

        System.out.println(max12.getAsInt());

        List<String> names1 = List.of("Ram", "Shyam", "Mohan");

        Map<String,Integer> map21 = names1.stream().collect(Collectors.toMap(name->name,name->name.length()));
        map21.entrySet().forEach(System.out::println);

        Map<Integer,List<String>> maptoString = names1.stream().collect(Collectors.groupingBy(String::length));

        maptoString.entrySet().forEach(System.out::println) ;


       list = Arrays.asList(1,2,3,4,3,2,5);

        HashSet<Integer> set2 = new HashSet<>();

        list.stream()
                .filter(n -> !set2.add(n))
                .forEach(System.out::println);

        String str2 = "stress";

       LinkedHashMap<Character,Long> linkedHashMap =  str2.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(
                        c -> c,
                        LinkedHashMap::new,
                        Collectors.counting()
                )) ;

       linkedHashMap.entrySet().forEach(System.out::println);

        System.out.println("Linked Hash Map..");

        Character ch =
                str2.chars()
                        .mapToObj(c -> (char)c)
                        .collect(Collectors.groupingBy(
                                c -> c,
                                LinkedHashMap::new,
                                Collectors.counting()
                        ))
                        .entrySet()
                        .stream()
                        .filter(e -> e.getValue() == 1)
                        .findFirst()
                        .get()
                        .getKey();

        System.out.println("Practice 29March");
        int[] A = {4,6,8,10,11} ;
        Arrays.stream(A).boxed().filter(i->i%2==0).forEach(System.out::println);

        Arrays.stream(A).boxed().map(i->i*2).forEach(System.out::println);

        int sum = Arrays.stream(A).sum();
        System.out.println("sum : " + sum) ;

         sum = Arrays.stream(A).reduce(0,(a,b1)->a+b1);

        System.out.println(sum);

    }
}
