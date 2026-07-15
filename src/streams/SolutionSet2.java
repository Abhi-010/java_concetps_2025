package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SolutionSet2 {
    private static final List<String>  listOfWords = Arrays.asList("Stay", "Success","somewhere","work","big","smiling");
    private static final List<Integer>  listOfInt = Arrays.asList(1,23,3,3,2,1,5,6);

    public static void main(String[] args) {
        /*
        11. Find the Average
        Given a List<Double>, calculate the average of all the numbers. Return it as an OptionalDouble.
        Focus: mapToDouble(), average().
         */
        List<Double> doubleList = Arrays.asList(3.5,6.9,11.5,12.5) ;
        OptionalDouble average = doubleList.stream()
                                           .mapToDouble(d -> d).average();
        average.ifPresent(System.out::println);

        /*
        12. Concatenate Strings with a Filter
        Given a List<String>, filter out strings with length less than 3, and concatenate the remaining strings into a single comma-separated string.
        Focus: filter(), Collectors.joining(",").
         */

        String concatString = listOfWords.stream()
                                         .filter(s-> s.length() > 3)
                                          .collect(Collectors.joining(",")) ;
        System.out.println(concatString);
        /*
        13. Find Any vs. Find First
        Given a List<String>, find any element that contains the letter "z". Return the result as an Optional<String>.
        Focus: filter(), findAny().
         */

        Optional<String> ans = listOfWords.stream()
                                          .filter(s-> s.contains("S"))
                                          .findAny() ;

        long s1 = listOfWords.stream().filter(s -> s.contains("S")).count();
        System.out.println("s1 " + s1);
        ans.ifPresent(System.out::println);

        long count = listOfInt.stream().mapToInt(Integer::intValue).distinct().count() ;
        System.out.println(count);

/*
14. Count Elements Matching a Criteria
Given a List<Employee>, count how many employees have a salary greater than 50,000.
 */


        Employee1 e1 = new Employee1("Ganesh", 45,1004);
        Employee1 e2 = new Employee1("Sanjana", 25,2000);
        Employee1 e3 = new Employee1("Vara", 21,3005);

        List<Employee1> employee1List = Arrays.asList(e1,e2,e3);


        long countz = employee1List.stream().filter(e->e.getSalary()>=2000).count();
        System.out.println("countz :  " + countz);

        long countOfEmployee =  employee1List.stream()
                .map(employee1 -> employee1.getSalary()).mapToInt(Integer::intValue).filter(i->i>1000).count() ;

        System.out.println(countOfEmployee);


        /*
        15. Get the Distinct Characters from a List of Words
Given a List<String> (e.g., ["Java", "Streams"]), find all the unique characters used across all words.
Focus: map(s -> s.split("")), flatMap(Arrays::stream), distinct().
         */

        List<String> words = Arrays.asList("HELL", "HELLO");
        words.stream().map(word->word.split("")).flatMap(Arrays::stream).distinct().count() ;


        List<String[]> uniqueChars = words.stream()
                .map(word -> word.split(""))
                .toList() ;

        for(int i = 0 ; i < uniqueChars.size() ; i++){
            String[] temp = uniqueChars.get(i);
            for(int j = 0 ; j < temp.length ; j++){
                System.out.print(temp[j] + " ");
            }
            System.out.println();
        }


//        List<String> uniqueChars = words.stream()
//                .map(word -> word.split(""))    // Step 1: Stream<String[]>
//                .flatMap(Arrays::stream)        // Step 2: Stream<String> (Flattened!)
//                .distinct()                     // Step 3: Keep only H, E, L, O
//                .toList();

// Result: [H, E, L, O]

        /*
        Note :
        Interviewer want to see if you understand that flatMap is the tool for removing nesting.
        Whenever you see a "List within a List" or an "Array within a List" and you need to process the internal elements, flatMap is your answer.
         */





        /*
        21. prefix sum
 Given a List<Integer>, return prefix sum of that list :
         */

        List<Integer> list = Arrays.asList(1,2,3,4,5) ;

        ArrayList<Object> collect = list.stream().collect(
                ArrayList::new,   // supplier
                (acc, x) -> {
                    int last = acc.isEmpty() ? 0 : (int) acc.get(acc.size() - 1);
                    acc.add(last + x);
                },
                List::addAll
        );


        /*
        22. First non repeating character in a string
Given a String, find the first non-repeating character in it and return it as an Optional<Character>. If there is no non-repeating character, return an empty Optional.
Focus: filter(), findFirst(), Collectors.groupingBy().
         */

        String s = "ava is a programming languagevspolue";
        LinkedHashMap<Character, Long> charCountMap =
        s.chars().mapToObj(c-> (char)c).collect(
                Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new, // Maintain insertion order
                        Collectors.counting()
                )
        ) ;

        s.chars().mapToObj(c -> (char)c).filter(c -> charCountMap.get(c) == 1).findFirst().ifPresent(System.out::println);

    }
}
