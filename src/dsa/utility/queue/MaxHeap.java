package dsa.utility.queue;
import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeap {
    public static void main(String[] args) {
        int[] A = {5,4,7,3,19,10,10};
        int n = A.length ;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0 ; i < n ;i++){
            maxHeap.add(A[i]);
        }
        while(!maxHeap.isEmpty()){
            System.out.println(maxHeap.poll());
        }
    }
}
