package streams.collectors_usage;

import streams.HelperClass;
import streams.collectors_usage.entity.Employee;

import java.util.List;

public class Top3HighestPaidEmployeeInDepartment {
    public static void main(String[] args) {

        List<Employee> employees = HelperClass.getEmployeesWithDepartments();

        List<Employee> top3HighestPaidEmployees = employees.stream()
                .filter(e -> e.getDepartment() != null && e.getDepartment().getName().equals("IT"))
                .sorted((e1, e2) -> {
//                            if(e1.getSalary().equals(e2.getSalary())) {
//                                return e1.getName().compareTo(e2.getName());
//                            }
                            return e2.getSalary().compareTo(e1.getSalary());
                        }

                )
                .limit(3)
                .toList();

        System.out.println("Top 3 highest paid employees in IT department:");
        top3HighestPaidEmployees.forEach(e -> System.out.println(e.getName() + " - " + e.getSalary()));
    }
}
