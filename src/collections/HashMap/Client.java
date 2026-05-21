package collections.HashMap;

import java.util.HashMap;

public class Client {
    public static void main(String[] args) {

        Student s1 = new Student(1,"John",101);
        Student s2 = new Student(2,"John",102);
        Student s3 = new Student(3,"Doe",103);

        HashMap<Student,Integer> map = new HashMap<>();

        map.put(s1,s1.getRoll_no());
        map.put(s2,s2.getRoll_no());
        map.put(s3,s3.getRoll_no());

        s2.setName("Abhishek");

        map.entrySet().stream().forEach(entry -> {
            Student s = entry.getKey();
            Integer roll_no = entry.getValue();
            System.out.println("Student Name: " + s.getName() + ", Roll No: " + roll_no);
        });

        System.out.println(map.get(s2));


    }
}
