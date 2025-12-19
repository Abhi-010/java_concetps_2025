package lambdas;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

public class MethodReferenceTest {
    public static void main(String[] args) {
        List<String> numbers = new ArrayList<>(List.of("1","2","3"));
        numbers.stream()
                        .map(Integer::parseInt)
                        .forEach(System.out::println);

        //  Question 2: Instance Method of a Particular Object
        List<String> names = List.of("John", "Doe", "Smith");
        PrintStream ps = System.out;


        // Question 3 You have a list of names, and you want to sort them in natural (alphabetical) order using String::compareToIgnoreCase.
        List<String> names1 = new ArrayList<>(List.of("banana", "Apple", "mango"));
        Collections.sort(names1,
                String::compareTo);
       Collections.sort(names1,String::compareToIgnoreCase);
        names1.forEach(System.out::println);

            // Use sort() with method reference to sort ignoring case

        //Question 4: Constructor Reference
        //Use a constructor reference to create a new ArrayList using a Supplier.

        Supplier<List<String>> listSupplier = ArrayList::new;

// The listSupplier.get() should return a new empty ArrayList


//        Final Question 5: Combined Usage
//        You have a list of strings.
//        You want to:
//
//        Convert each string to uppercase using String::toUpperCase
//
//        Collect them into a list and print the list

        List<String> words = List.of("java", "lambda", "stream");

        words.stream().map(String::toUpperCase).toList().forEach(System.out::println);

//     Write a stream chain using method references to achieve this

        /*
        | Concept                             | Example You Wrote                             |
| ----------------------------------- | --------------------------------------------- |
| Static Method Reference             | `Integer::parseInt`                           |
| Instance Method of Object           | `ps::println`                                 |
| Instance Method of Arbitrary Object | `String::compareToIgnoreCase`                 |
| Constructor Reference               | `ArrayList::new`                              |
| Chained Method Reference            | `String::toUpperCase` + `System.out::println` |

        */


    }
}
