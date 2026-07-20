package streams.set1;

import streams.entity.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicatesWithSameNameInEmployee {
    public static void main(String[] args) {
        List<Employee> impList = new ArrayList<>();

        Employee emp1 = new Employee("Abhi",100,null);
        Employee emp2 = new Employee("Tom",100,null);
        Employee emp3 = new Employee("Ron",100,null);
        Employee emp4 = new Employee("Abhi",100,null);

        impList.add(emp1);
        impList.add(emp2);
        impList.add(emp3);
        impList.add(emp4);

        Map<String,List<Employee>> map = impList.stream()
                .collect(Collectors.groupingBy(Employee::getName));

        map.forEach((key,value) -> System.out.println(key + ":" + value));

        List<Employee> list = impList.stream()
                .distinct().toList();

        list.stream().forEach(System.out::println);


        impList.stream().collect(Collectors.toSet());

    }
}
