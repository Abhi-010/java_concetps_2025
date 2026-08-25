package streams.set1;

import streams.HelperClass;
import streams.entity.Employee;
import streams.entity.User;

import javax.crypto.spec.PSource;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestSet1 {
    public static void main(String[] args) {
        List<Employee> employeeList = HelperClass.getEmployeesWithDepartments() ;
        employeeList.forEach(System.out::println);

        // max salary of employee present in IT deparment.

        // get me employee
        System.out.println("Min Salary");
        Optional<Employee> employeeOptional = employeeList.stream()
                .filter(emp-> emp.getDepartment().getName().equals("IT"))
                .sorted((emp1,emp2) -> Integer.compare(emp1.getSalary(),emp2.getSalary()))
                        .findFirst() ;

        Optional<Employee> employeeOptional1 = employeeList.stream()
                .filter(emp -> emp.getDepartment().getName().equals("IT"))
                .min((emp1, emp2) -> Integer.compare(emp1.getSalary(), emp2.getSalary()));

        employeeOptional.ifPresent(System.out::println) ;

        System.out.println("-------------");
        List<User> userList = User.getListOfUser() ;
        userList.forEach(System.out::println);

        // Map<Integer,User>

        Map<User,List<User>> map = userList.stream().collect(Collectors.groupingBy(Function.identity()) ) ;

        map.forEach((key,value) -> System.out.println(key + ": " + value));


        System.out.println("----------------");
        List<String> listS = List.of("Java", "AI", "AWS","DSA", "Java", "DSA") ;

        Map<String, Long> collect = listS.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        collect.forEach((key,value) -> System.out.println(key + ": " + value));


        System.out.println(" --------------");
        Map<Integer, List<String>> collect2 = listS.stream().collect(Collectors.groupingBy(str->str.length())) ;

        collect2.forEach((key,value) -> System.out.println(key + ": " + value));


    }
}
