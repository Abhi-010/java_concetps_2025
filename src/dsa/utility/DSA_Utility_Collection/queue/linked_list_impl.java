package dsa.utility.DSA_Utility_Collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class linked_list_impl {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3) ;
        queue.offer(null) ;

        while(!queue.isEmpty()){
            System.out.println(queue.peek());
            System.out.println(queue.poll());
        }

        System.out.println(queue.poll());
        System.out.println(queue.remove());

        //System.out.println(queue.remove());
    }
}
