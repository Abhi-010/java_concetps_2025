package collections.collections_naman;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Client2 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>() ;

        list.add(new Student("Abhi",20)) ;
        list.add(new Student("Bob",25)) ;
        list.add(new Student("Marc",26)) ;
        list.add(new Student("Emmy",19)) ;

        Collections.sort(list,new nameComparator());

        for(Student s  : list){
            System.out.println(s);
        }
    }

    static class nameComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            if(o1.getName().compareTo(o2.getName()) > 0){
                return -1 ;
            }
            else if(o1.getName().compareTo(o2.getName()) < 0){
                return 1 ;
            }
            return 0 ;
        }
    }
}
