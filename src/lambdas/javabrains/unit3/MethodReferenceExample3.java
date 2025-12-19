package lambdas.javabrains.unit3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MethodReferenceExample3 {
    public static void main(String[] args) {

        // 1.
        Function<Integer,String> convert = String::valueOf;
        System.out.println(convert.apply(100));

        // 2.  Reference to an Instance Method of a Particular Object

        MethodReferenceExample3 obj = new MethodReferenceExample3() ;

        List<String> listOfNames = new ArrayList<>(List.of("Abhi","Ramesh"));
        listOfNames.forEach(obj::printMessage);

        Function<String,Integer> parser = Integer::parseInt;
        System.out.println("quiz1 " + parser.apply("6"));


    }

    public void printMessage(String name){
        System.out.println("hello " + name);
    }
}
