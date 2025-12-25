package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
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
        OptionalDouble average = doubleList.stream().mapToDouble(d -> d).average();
        average.ifPresent(System.out::println);

        /*
        12. Concatenate Strings with a Filter
Given a List<String>, filter out strings with length less than 3, and concatenate the remaining strings into a single comma-separated string.
Focus: filter(), Collectors.joining(",").
         */

        String concatString = listOfWords.stream().filter(s-> s.length() > 3).collect(Collectors.joining(",")) ;
        System.out.println(concatString);
/*
13. Find Any vs. Find First
Given a List<String>, find any element that contains the letter "z". Return the result as an Optional<String>.
Focus: filter(), findAny().
 */

        Optional<String> ans = listOfWords.stream().filter(s-> s.contains("S")).findAny() ;
        long s1 = listOfWords.stream().filter(s -> s.contains("S")).count();
        System.out.println("s1 " + s1);
        ans.ifPresent(System.out::println);

        long count = listOfInt.stream().mapToInt(Integer::intValue).distinct().count() ;
        System.out.println(count);




    }
}
