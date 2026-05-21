package dsa.utility;

import java.util.*;

public class Pair_Custom_SOrt {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(-1, 20, 4, -1);
        List<Integer> list2 = Arrays.asList(30, 2, 2, 10);

        // 1. Create a list of Pairs
        List<Pair> pairs = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            pairs.add(new Pair(list1.get(i), list2.get(i)));
        }

        System.out.println("Before sorting:");
        for (Pair pair : pairs) {
            System.out.println("Pair: (" + pair.getL1() + ", " + pair.getL2() + ")");
        }
       // Sort by l1 using lambda
       pairs.sort((p1,p2)-> {
           if(p1.getL1() != p2.getL1()){
               return Integer.compare(p1.getL1(), p2.getL1()); // Sort by l1
           } else {
               return Integer.compare(p1.getL2(), p2.getL2()); // If l1 is equal, sort by l2
           }
       });
        // Sort by l1 using Comparator and method reference
        pairs.sort(Comparator.comparingInt(Pair::getL1));

        System.out.println("After sorting:");
        for (Pair pair : pairs) {
            System.out.println("Pair: (" + pair.getL1() + ", " + pair.getL2() + ")");
        }

        int a = 99;
        char c = (char) a;
        System.out.println(c);

        char c1 = 'A';
        int a1 = (int) c1;
        System.out.println(a1);

        PriorityQueue<Pair> minHeap = new PriorityQueue<>((p1, p2) -> {
            if (p1.getL1() != p2.getL1()) {
                return Integer.compare(p1.getL1(), p2.getL1()); // Sort by l1
            } else {
                return Integer.compare(p1.getL2(), p2.getL2()); // If l1 is equal, sort by l2
            }
        });

        minHeap.add(Pair.of());
        minHeap.add(Pair.of());
        minHeap.add(Pair.of());
        minHeap.add(Pair.of());

            while (!minHeap.isEmpty()) {
                Pair pair = minHeap.poll();
                System.out.println("Polled Pair: (" + pair.getL1() + ", " + pair.getL2() + ")");
            }
        PriorityQueue<Pair> minHeap2 = new PriorityQueue<>((p1, p2) -> {
            if (p1.getL2() != p2.getL2()) {
                return Integer.compare(p1.getL2(), p2.getL2()); // Sort by l2
            } else {
                return Integer.compare(p1.getL1(), p2.getL1()); // If l2 is equal, sort by l1
            }
        });

            minHeap2.add(Pair.of());
            minHeap2.add(Pair.of());
            minHeap2.add(Pair.of());
            minHeap2.add(Pair.of());

            while(!minHeap2.isEmpty()){
                Pair pair = minHeap2.poll();
                System.out.println("Polled Pair minHeap2: (" + pair.getL1() + ", " + pair.getL2() + ")");
            }
    }

    // Simple helper class
    static class Pair {
        int l1, l2;
        Pair(int l1, int l2) {
            this.l1 = l1;
            this.l2 = l2;
        }

        static Pair of(){
            Random rand = new Random();
            return new Pair(rand.nextInt(100), rand.nextInt(100));
        }

        public int getL1() {
            return l1;
        }

        public void setL1(int l1) {
            this.l1 = l1;
        }

        public int getL2() {
            return l2;
        }

        public void setL2(int l2) {
            this.l2 = l2;
        }
    }
}