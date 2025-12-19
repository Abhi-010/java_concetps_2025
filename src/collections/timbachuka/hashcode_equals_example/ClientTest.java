package collections.timbachuka.hashcode_equals_example;

import java.util.HashSet;

public class ClientTest {
    public static void main(String[] args) {

        Employee employee = new Employee("rajeev", 24);
        Employee employee1 = new Employee("rajeev", 25);
        Employee employee2 = new Employee("rajeev", 24);


        HashSet<Employee> employees = new HashSet<Employee>();
        employees.add(employee);
        employees.add(employee2);

        System.out.println(employees.contains(employee2));
        System.out.println("size of set : " + employees.size());

        System.out.println("employee.hashCode():  " + employee.hashCode()
                + "  employee2.hashCode():" + employee2.hashCode()
                + "  employee1.hashCode():" + employee1.hashCode());
    }
}