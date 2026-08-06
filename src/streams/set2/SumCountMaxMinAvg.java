package streams.set2;

import java.util.List;
import java.util.OptionalInt;

public class SumCountMaxMinAvg {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5) ;

        long sum = list.stream().mapToInt(i->i).sum() ;
        System.out.println("sum : " + sum );

        OptionalInt max = list.stream().mapToInt(i->i).max() ;
        System.out.println("max " + max.getAsInt());

        OptionalInt min = list.stream().mapToInt(i->i).min() ;
        System.out.println("min " + min.getAsInt());


        long count =  list.stream().mapToInt(i->i).count() ;
        System.out.println("count " + count);

    }
}
