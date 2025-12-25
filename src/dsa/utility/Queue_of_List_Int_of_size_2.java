package dsa.utility;

import java.util.*;

public class Queue_of_List_Int_of_size_2 {
    public static void main(String[] args) {
        PriorityQueue<List<Integer>> minHeap = new PriorityQueue<>(Comparator.comparing(l->l.get(1)));

        minHeap.add(Arrays.asList(2,1));
        minHeap.add(Arrays.asList(10,0));
        minHeap.add(Arrays.asList(21,11));
        minHeap.add(Arrays.asList(11,5));
        minHeap.add(Arrays.asList(12,-7));
        minHeap.add(Arrays.asList(101,0));

        while (!minHeap.isEmpty()){
            List<Integer> t = minHeap.poll();
            System.out.println(t.getFirst() + ":" + t.getLast());
        }


    }
}
