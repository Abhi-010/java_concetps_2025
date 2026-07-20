package streams;

import streams.entity.Department;
import streams.entity.Employee;

import java.util.List;

public class HelperClass {

    public static List<Employee> getEmployees() {
        return List.of(
                new Employee("Alice", 70000, null),
                new Employee("Bob", 80000, null),
                new Employee("Charlie", 90000, null),
                new Employee("David", 60000, null),
                new Employee("Alice", 75000, null)
        );
    }

    public static List<Employee> getEmployeesWithDepartments() {
        return List.of(
                new Employee("Alice", 70000, new Department("IT", List.of("Cloud", "Security"))),
                new Employee("Bob", 90000, new Department("IT", List.of("Recruiting"))),
                new Employee("Charlie", 90000, new Department("IT", List.of("AI", "Cloud"))),
                new Employee("David", 60000, new Department("Finance", List.of("Budgeting"))),
                new Employee("Eve", 75000, new Department("IT", List.of("Cloud")))
        );
    }
}
