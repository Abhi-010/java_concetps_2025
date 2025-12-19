package collections.collections_naman;


import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(4);
        set.add(10);

        Iterator<Integer> i = set.iterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }

        Queue<Integer> q = new ArrayDeque<>();

        Deque<Integer> deque = new ArrayDeque<>();

        Stack<Integer> st = new Stack<>();

//        List<Integer> st = new Stack<>();
//        st.add(1);
//        st.add(2);
//        System.out.println(st.get(0));
//
//        comparator.Student abhi = new comparator.Student("abhi",30);
//        comparator.Student naman = new comparator.Student("naman",28);



        //System.out.println(abhi.equals(naman)); //false

//        comparator.Student abhi_copy = new comparator.Student("abhi",30);
//
//        comparator.Student abhi_copy1 = abhi;
        /*
        System.out.println("abhi hashcode : " + abhi.hashCode());
        System.out.println("naman hashcode : " + naman.hashCode());
        System.out.println("abhi_copy hashcode : " + abhi_copy.hashCode());
        System.out.println("abhi_copy1 hashcode : " + abhi_copy1.hashCode());


         */
//
//       List<Integer> l1 = List.of(1,2,3,4,5);
//       Stream<Integer> integerStream = l1.stream();
//
//       integerStream.forEach((ele)-> System.out.println(ele));
//
//        integerStream.forEach(
//               (ele)-> System.out.print(ele + " ")
//       );
//       System.out.println();
//
//       Stream<Integer> s1 = l1.stream().map(
//               (ele)->ele*2
//       );
//
//       Stream<Integer> s2 = l1.stream().map(
//               (ele)-> ele*3
//       );
//
//
//
//       s1.forEach((ele)-> System.out.print(ele + " "));
//       System.out.println();
//       //s2.forEach((ele)-> System.out.print(ele + " "));
//
//        Stream<Integer> s3 = s2.filter((ele)-> ele>10);
//
//        System.out.println("after filter");
//        s3.forEach((ele)-> System.out.print(ele + " "));




        //System.out.println(abhi.equals(abhi_copy)); // false
       // System.out.println(abhi==abhi_copy); //false

     //   System.out.println(abhi.equals(abhi_copy1)); //true


      //  System.out.println(trimPowerOf2(27));
    }

    public static int trimPowerOf2(int initialCapacity) {
        int capacity = 1;
        while (capacity < initialCapacity) {
            capacity <<= 1;//2,4,8,16
        }
        return capacity;
    }
}
//        List<Integer> l1 = new ArrayList<>();
//
//        for(int i = 0 ; i < 10 ; i++){
//            l1.add(i+1);
//        }
//        int index = Collections.binarySearch(l1,1);
//        System.out.println();


//        Set<PaymentStatus> l = EnumSet.allOf(PaymentStatus.class);
//
//        for(PaymentStatus paymentStatus : l){
//            System.out.println(l);
//        }

//        Queue<Integer> q = new LinkedList<>();
//        q.add(null);
//        System.out.println(q.poll());

//        Deque<Integer> deque = new LinkedList<>();
//        deque.add(1);
//        deque.addFirst(45);
//        deque.addLast(111);

//     while(deque.size()>0){
//        //System.out.println(deque.pop());
//     }

//     Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
//     queue.add(1);
//     queue.add(-2);
//     queue.add(5);
//     while(queue.size()>0){
//         System.out.println(queue.poll());
//     }
//
//
//    }
//}
