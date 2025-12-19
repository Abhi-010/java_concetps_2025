package multithreading.AdderSubstractorUsingLambdas;

import java.util.List;

public class Main_1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);

        list.stream()
                .filter((ele)->ele % 2 == 0)
                .forEach(ele-> System.out.println(ele)) ;
    }
}
