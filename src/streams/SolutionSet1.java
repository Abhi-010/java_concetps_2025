package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SolutionSet1 {
    private static final List<String>  listOfWords = Arrays.asList("Stay", "Success","somewhere","work","big","smiling");
    public static void main(String[] args) {
        /*
        Given a List<String>, filter out strings that start with the letter "A" (case-sensitive) and
        convert the remaining strings to uppercase. Return the result as a List.
         */
        System.out.println("Answer 1 : ");
        List<String> stringList = listOfWords.stream().filter(s -> s.startsWith("S")).toList();
        stringList.forEach(System.out::println);

        /*
        Given a List<Integer>, find the sum of the squares of all even numbers in the list.
        Focus: filter(), mapToInt(), sum().
         */
        System.out.println("Answer 2 : ");
        List<Integer> list = Arrays.asList(1,2,3,4,5,61);

        //int sum =
                list.stream().filter(i -> i % 2 == 0).mapToInt(i -> i * i).filter(i->i >= 4).forEach(System.out::println);
//        int sumOfList = list.stream().filter(i->i%2 == 0).sum();
//        System.out.println("sum : " + sum);


        /*
        You have a List<List<Integer>>.
        Write a stream to flatten this into a single List<Integer> containing all the numbers from the nested lists.
         */
        System.out.println("Answer 3 : ");
        List<List<Integer>> listList = Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(4,5,6));

        List<Integer> list1 = listList.stream()
                                       .flatMap(temp-> temp.stream()).toList() ;

        list1.forEach(System.out::println);

        /*
        Given a List<Employee>, find the Employee object with the highest salary. If the list is empty, return an empty Optional.
         */
        System.out.println("Answer 4 : ");
        Employee e1 = new Employee("Ganesh", 45,100);
        Employee e2 = new Employee("Sanjana", 25,200);
        Employee e3 = new Employee("Vara", 21,300);

        List<Employee> employeeList = Arrays.asList(e1,e2,e3);

//        Comparator<Employee> comparator = (emp1,emp2) -> {
//            if(emp1.getSalary() > emp2.getSalary()){
//                return 1;
//            }
//            else if(emp1.getSalary() < emp2.getSalary()){
//                return -1;
//            }
//            return 0;
//        };

        Optional<Employee> maxEmployee = employeeList.stream().max(Comparator.comparingInt(Employee::getSalary));
        maxEmployee.ifPresent(employee -> System.out.println(employee.getName()));


        /*
5. Counting Occurrences (Frequency Map)
Given a String (e.g., "apple banana apple cherry"), split it by spaces and use streams to create a Map<String, Long>
where the key is the word and the value is its frequency.
Focus: Collectors.groupingBy(), Collectors.counting().
         */

        System.out.println("Answer 4 : ");

        String str = "apple, banana, apple, cherry";
        String[] strArrary = str.split(" ");
        Map<String, Long> collect = Arrays.stream(strArrary).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        collect.forEach((key,value)-> System.out.println(key + " : "+ value));


    }
}
