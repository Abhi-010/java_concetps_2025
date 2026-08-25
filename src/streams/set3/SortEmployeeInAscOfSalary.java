package streams.set3;

import streams.HelperClass;
import streams.entity.Employee;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortEmployeeInAscOfSalary {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>(HelperClass.getEmployeesWithDepartments()) ;
        System.out.println("List of Employee..");

        list.forEach(System.out::println);

        Optional<Employee> opt = list.stream().max(Comparator.comparingInt(Employee::getSalary)).stream().findFirst() ;


         list.stream().filter(emp -> emp.getDepartment().equals("HR")).mapToInt(Employee::getSalary)
                .distinct()
                .sorted()
                 .boxed()
                 .collect(Collectors.toList()) ;

//        Collections.sort(list,(emp1,emp2)->{
//            return Integer.compare(emp2.getSalary(), emp1.getSalary());
//        }) ;

        Collections.sort(list, Comparator.comparingInt(Employee::getSalary).reversed()) ;
       // Collections.sort(list, Comparator.reverseOrder())) ;

     //  list.sort(Comparator.comparingInt(Employee::getSalary));

        System.out.println("List of Employee in sorting..");

        list.forEach(System.out::println);



    }
}
