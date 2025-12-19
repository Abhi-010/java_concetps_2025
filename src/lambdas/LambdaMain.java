package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaMain {
    public static void main(String[] args) {
        // 1. Write a lambda expression to print "Lambda is running" using the Runnable interface.
        print(()->System.out.println("Lambda is running"));

        // 2. Write a lambda expression to sort a list of integers in descending order using Comparator<Integer>.

        List<Integer> list = new ArrayList<>(List.of(1, 10, 5, 9, 20, 99, 56, 34));
        list.sort(((o1, o2) -> o1 - o2));
        for(Integer i : list){
            System.out.print(i + " ");
        }

        // 3. Write a lambda expression that checks whether a string is empty using Predicate<String>.

        System.out.println(checkString("Apple", s -> s.isEmpty()) );

        // 4. Write a Function<String, String> that converts a given string to uppercase.
        String ans = doUpperCase((s) -> s.toUpperCase(),"apple") ;
        System.out.println(ans);

        // 5.Write a lambda using Consumer<Integer> that prints the square of a number.

        printSquare((i)-> System.out.println(i*i), 5);

        // 6. Write a lambda using BiFunction<Integer, Integer, Integer> to add two integers.
        System.out.println(addTwoNumber((a,b)-> a+b,4,5));;

        //Use Lambda to Filter Even Numbers from a List
        //7. Given a list of integers, write a lambda with stream().filter(...) to print only even numbers.

        ArrayList<Integer> list1 = new ArrayList<>(List.of(3,4,1,10,56,12,13,9)) ;
        list1.stream().filter((i)->i%2==0).forEach(System.out::println);

        //Q8. Using removeIf() with Lambda
        //You have a list of names. Write a lambda expression to remove all names that start with "A".

        ArrayList<String> listOfNames = new ArrayList<>(List.of("Abhi","Bob","Cac","Ample")) ;
        listOfNames.removeIf(s-> s.charAt(0) == 'A');
        listOfNames.forEach(System.out::println);

        //Q9. Custom Functional Interface
        //Define a functional interface called StringLengthFinder with a method int findLength(String s), and write a lambda expression for it.

        StringLengthFinder stringLengthFinder = s -> s.length();
        System.out.println(stringLengthFinder.findLength("Lambda"));

    }
    public static int addTwoNumber(BiFunction<Integer,Integer,Integer> biFunction, int a , int b){
        return biFunction.apply(a,b);
    }

    public static void printSquare(Consumer<Integer> consumer, int i){
        consumer.accept(i);
    }
    public static String doUpperCase(Function<String,String> function,String s){
        return function.apply(s);
    }
    public static boolean checkString(String s, Predicate<String> predicate){
        return predicate.test(s);
    }
    public static void print(Runnable runnable){
        runnable.run();
    }
}

@FunctionalInterface
interface StringLengthFinder{
    int findLength(String s);
}