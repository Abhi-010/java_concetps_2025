package streams;

import streams.collectors_usage.entity.Employee;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.IntStream;

public class EmployeeWithMaxSalary {
    public static void main(String[] args) {
       List<Employee> employeeList = HelperClass.getEmployeesWithDepartments() ;

       streams.collectors_usage.entity.Employee maxEmp =
               employeeList.stream().min( (emp1, emp2) -> Integer.compare(emp2.getSalary(), emp1.getSalary())).orElse(null) ;

        Employee maxEmp1 = employeeList.stream()
                .max(Comparator.comparingInt(Employee::getSalary))
                .orElse(null);

        OptionalInt max = employeeList.stream()
                .mapToInt(Employee::getSalary).max() ;

        System.out.println(maxEmp.getSalary());

       employeeList.forEach(System.out::println);

        int[] nums = {5, 2, 8, 2, 5, 1};
        nums = Arrays.stream(nums).sorted().toArray();
       for(int i = 0 ; i < nums.length ;i++){
           System.out.println(nums[i] + " ");
       }

    }
}
