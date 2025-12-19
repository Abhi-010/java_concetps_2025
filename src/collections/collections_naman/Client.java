package collections.collections_naman;

import java.util.*;

public class Client {
    public static void main(String[] args) {

        Student p1 = new Student("Abhi",20) ;
        Student p2 = new Student("Marc",24) ;
        Student p3 = new Student("John",18) ;

        Student[] arr = {p1,p2,p3} ;

        Arrays.sort(arr,new Client2.nameComparator());
        System.out.println("Array of comparator.Student sort");
        for(Student s : arr){
            System.out.println(s.toString());
        }


        int[] a = {4,31,5,10,1} ;
        Arrays.sort(a);
        for (int i: a) {
            System.out.println("e : " + i);
        }

        Student s1 = new Student() ;
        Student s2 = s1 ;

        HashSet<Student> set = new HashSet<>() ;

        set.add(s1) ;
        set.add(s2) ;
        System.out.println("size : " + set.size());

        Hashtable<Student,Integer> table = new Hashtable<>();
        table.put(s1,1) ;
        table.put(s2,2) ;

        System.out.println("table : " + table.get(s2) );


        //Deque<Integer> deque = new ArrayDeque<>();

        Queue<Integer> deque = new LinkedList<>();
        deque.add(1) ;
        deque.add(2) ;
        deque.add(3) ;

        while(deque.size() > 0){
            System.out.println("element " + deque.poll());
        }
    }
}
