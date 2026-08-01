package streams.set2;

import com.sun.net.httpserver.Headers;
import streams.HelperClass;
import streams.entity.Employee;

import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class CountEmployeesBasedOnSalary {
    public static void main(String[] args) {
        List<Employee> employeesList = HelperClass.getEmployees() ;

        // count number of employess having greater than salary 'X'

        Long count = employeesList.stream()
                .filter(employee -> employee.getSalary() >= 8000).count() ;

        System.out.println(count);
    }
}
