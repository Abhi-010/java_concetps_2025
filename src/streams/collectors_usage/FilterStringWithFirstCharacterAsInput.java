package streams.collectors_usage;

import java.util.List;

/*
    Given a List<String>,
    filter out strings that start with the letter "A" (case-sensitive) and
    convert the remaining strings to uppercase. Return the result as a List.
 */
public class FilterStringWithFirstCharacterAsInput {
//    public static void main(String[] args) {
//        List<String> inputList = List.of("Apple", "Banana", "Avocado", "Cherry", "Apricot", "Date");
//
//        List<String> resultList = inputList.stream()
//                .filter(s -> s.startsWith("A")) // Filter out strings that start with "A"
//                .map(String::toUpperCase) // Convert remaining strings to uppercase
//                .toList(); // Collect the result as a List
//
//        System.out.println(resultList); //
//    }

    public static void main(String[] args) {
        List<String> input = List.of("Apple", "Banana", "Avocado", "Cherry", "Apricot", "Date");

        List<String> filterString = input.stream()
                //.map(String::toLowerCase)
                .filter(str -> str.startsWith("A"))
                .toList();

        filterString.forEach(System.out::println);
    }
}
