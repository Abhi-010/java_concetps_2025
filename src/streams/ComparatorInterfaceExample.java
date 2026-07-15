package streams;

import streams.collectors_usage.entity.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static streams.HelperClass.getEmployees;

public class ComparatorInterfaceExample {
    public static void main(String[] args) {

        // 1.  reversed() , naturalOrder(), reverseOrder()


        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        // Sort in natural order then reverse it
//        names.sort(Comparator.naturalOrder());
//        names.sort(Comparator.reverseOrder());

        names.sort(Comparator.naturalOrder());

        names.forEach(System.out::println);
        // Result: [Charlie, Bob, Alice]


        // 2. thenComparing()
        /*
        This is arguably the most useful method.
        It allows you to define secondary, tertiary, and further sorting criteria if the primary comparison results in a tie (i.e., returns 0).
         */

        // Assuming a class 'Employee' with getName() and getSalary()
        List<Employee> employees = getEmployees();

        List<Employee> tempEmp = new ArrayList<>(employees) ;

        tempEmp.sort(
                Comparator.comparing(Employee::getName)
                        .thenComparing(Employee::getSalary)
        );

        tempEmp.forEach(System.out::println);
    }
}
