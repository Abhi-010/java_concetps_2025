package streams.entity;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String grade;

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public static List<Student> getStudentList(){
        Student s1 = new Student("Abhishe", "A");
        Student s2 = new Student("Rohit", "C");
        Student s3 = new Student("Rahul", "B");
        Student s4 = new Student("Tom", "A");

        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        return list ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
