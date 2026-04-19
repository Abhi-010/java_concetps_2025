package dsa.utility.queue;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class MinHeap {
    public static void main(String[] args) {
        Pair p1 = new Pair(3,4);
        Pair p2 = new Pair(10,1);
        Pair p3 = new Pair(8,2);
        Pair p4 = new Pair(4,-1);
        Pair p5 = new Pair(99,4);

        List<Pair> pairList = Arrays.asList(p1,p2,p3,p4,p5) ;

        PriorityQueue<Pair> pairPriorityQueue = new PriorityQueue<>((pair1,pair2)-> pair1.getSecond()- pair2.getSecond()) ;

//        pairPriorityQueue.addAll(pairList);
        for(Pair p : pairList){
            pairPriorityQueue.add(p);
        }

        while(!pairPriorityQueue.isEmpty()){
            Pair p = pairPriorityQueue.poll();
            System.out.println(p.getFirst() + "-" + p.getSecond());
        }

    }
}
