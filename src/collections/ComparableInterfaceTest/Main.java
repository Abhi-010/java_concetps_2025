package collections.ComparableInterfaceTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        Student s3 = new Student(24,"Carry", 3);
        Student s1 = new Student(27,"Abhi", 1);
        Student s4 = new Student(30,"Dev", 4);
        Student s2 = new Student(24,"Bob", 2);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        List<Student> list2 = new ArrayList<>(list) ;

        Collections.sort(list);
        for(Student s : list){
            System.out.println(s);
        }


        list2.sort((p1, p2) ->
        {
            if (p1.getName().charAt(0) < p2.getName().charAt(0)) {
                return -1;
            } else if (p1.getName().charAt(0) > p2.getName().charAt(0)) {
                return 1;
            }
            return 0;
        });
        System.out.println("--------------------");
        for(Student s : list2){
            System.out.println(s);
        }
    }
}
