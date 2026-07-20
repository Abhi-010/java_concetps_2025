package streams.set1;

import streams.entity.Student;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentGradeGroupBy {
    public static void main(String[] args) {
       List<Student> students = streams.entity.Student.getStudentList();

        Map<String, List<Student>> collect = students.stream()
                .collect(Collectors.groupingBy(Student::getGrade));

        collect.forEach((key,value) -> System.out.println(key + ":" + value));

        Map<String, Long> collect1 = students.stream()
                .collect(Collectors.groupingBy(Student::getGrade,Collectors.counting()));
        collect1.forEach((key,value) -> System.out.println(key + ":" + value));

    }
}
