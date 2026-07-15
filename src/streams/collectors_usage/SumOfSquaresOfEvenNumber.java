package streams.collectors_usage;

import java.util.List;

public class SumOfSquaresOfEvenNumber {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);

        int sum = list.stream()
                .filter(n-> n % 2 == 0)
                .map(n->n*n)
                .mapToInt(n->(int)n)
                .sum() ;

        System.out.println("Sum1:" + sum);


        int sum2 = list.stream()
                .filter(n->n%2==0)
                .mapToInt(n-> n*n)
                .sum();
        System.out.println("Sum2:" + sum2);

    }
}
