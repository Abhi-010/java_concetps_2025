package streams.set2;

import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class CalculateAvgAndReturnDouble {
    public static void main(String[] args) {
        List<Double> list = List.of(12.0,14.1,9.87) ;

        double sum = list.stream().mapToDouble(Double::doubleValue).sum();

        System.out.println(sum);

        List<Integer> intList = List.of(1,2,3,4);

        OptionalDouble sum1 = intList.stream().mapToInt(Integer::intValue).average();

        sum1.ifPresent(System.out::println);
    }
}
