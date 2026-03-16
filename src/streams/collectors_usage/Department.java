package streams.collectors_usage;

import java.util.Arrays;
import java.util.List;

public class Department {
    String name;
    List<String> projects;

    Department(String name, List<String> projects) {
        this.name = name;
        this.projects = projects;
    }

    public String getName() { return name; }
    public List<String> getProjects() { return projects; }

    public static List<Department> getDepartment(){
        List<Department> depts = Arrays.asList(
                new Department("IT", Arrays.asList("Cloud", "Security")),
                new Department("HR", Arrays.asList("Recruiting")),
                new Department("IT", Arrays.asList("AI", "Cloud"))
        );

                return depts ;
    }
}
