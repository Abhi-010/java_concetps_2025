package streams.set1;

import java.util.List;

public class AllIntegersGreaterThan10 {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(14,15,11,21,100);

        boolean flag = integerList.stream()
                .allMatch(num -> num < 10);
        System.out.println("Flag : " + flag);
    }
}
