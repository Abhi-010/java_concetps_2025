package streams.collectors_usage;


import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class mapClass {
    private static final List<String> listOfWords = Arrays.asList("Stay", "Success","somewhere","work","big","smiling");
    private static final List<Integer>  listOfInt = Arrays.asList(1,23,3,3,2,1,5,6);
    public static void main(String[] args) {

       java.util.stream.IntStream intStream = listOfInt.stream().mapToInt(i-> i.intValue()).distinct().sorted() ;
       intStream.forEach(System.out::println);

    }
}
