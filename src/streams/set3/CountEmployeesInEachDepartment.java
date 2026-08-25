package streams.set3;

import streams.HelperClass;
import streams.entity.Department;
import streams.entity.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountEmployeesInEachDepartment {
    public static void main(String[] args) {
        List<Employee> list = HelperClass.getEmployeesWithDepartments();

        Map<String, Long> collect =
                list.stream()
                        .collect(
                                Collectors.groupingBy(emp -> emp.getDepartment().getName(), Collectors.counting())
                        );

        collect.forEach((key, value) -> System.out.println(key + ": " + value));

    }
}
