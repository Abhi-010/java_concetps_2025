package lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdasMain_Solution_Set1 {
    public static void main(String[] args) {
        // 1. Write a lambda expression to print "Lambda is running" using the Runnable interface.
        Thread thread = new Thread(()-> System.out.println("Lambda is Running"));
        thread.start();

        // 2. Write a lambda expression to sort a list of integers in descending order using Comparator<Integer>.

        List<Integer> list = new ArrayList<>(List.of(4,1,2,98,4,5,6,10));

        Collections.sort(list,(e1,e2) -> Integer.compare(e2,e1));

        list.forEach(element-> System.out.print(element + " "));
        System.out.println();

        // 3. Write a lambda expression that checks whether a string is empty using Predicate<String>.
        Predicate<String> predicate = s -> s.isEmpty();
        System.out.println(predicate.test("hello"));

        System.out.println(convertFunction("hello",s-> s.toUpperCase()));

        // 4. Write a Function<String, String> that converts a given string to uppercase.

        // 5.Write a lambda using Consumer<Integer> that prints the square of a number.
        // 6. Write a lambda using BiFunction<Integer, Integer, Integer> to add two integers.


        //Use Lambda to Filter Even Numbers from a List
        //7. Given a list of integers, write a lambda with stream().filter(...) to print only even numbers.


        //Q8. Using removeIf() with Lambda
        //You have a list of names. Write a lambda expression to remove all names that start with "A".

        //Q9. Custom Functional Interface
        //Define a functional interface called StringLengthFinder with a method int findLength(String s), and write a lambda expression for it.

        /*
        Q10. Compose Functions
        Write two lambda expressions using Function<Integer, Integer>:

        One that multiplies a number by 2.

        Another that adds 10.
        Then compose them such that input 5 gives (5 * 2) + 10 = 20.
         */

        // Question 11 : Java program to find second largest number in list using Streams :

        List<Integer> list1 = new ArrayList<>(List.of(1,4,5,6,7,9));

        Optional<Integer> f = list1.stream().distinct().sorted(Collections.reverseOrder()).skip(1).findFirst() ;
        if(f.isPresent()){
            System.out.println(f.get());
        }

        Optional<Integer> max = list1.stream().reduce(Integer::max) ;
        System.out.println(max.get());

    }

    static String convertFunction(String s, Function<String,String> function){
        return function.apply(s);
    }
}
