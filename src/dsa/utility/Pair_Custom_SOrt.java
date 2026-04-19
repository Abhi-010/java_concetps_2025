package dsa.utility;

import java.util.*;

public class Pair_Custom_SOrt {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(-1, 20, 4, -1);
        List<Integer> list2 = Arrays.asList(3, 2, 2, 10);

        // 1. Create a list of Pairs
        List<Pair> pairs = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            pairs.add(new Pair(list1.get(i), list2.get(i)));
        }

        Comparator<Pair> pairComparator = new Comparator<Pair>() {
            @Override
            public int compare(Pair p1, Pair p2) {
                if(p1.getL2() > p2.getL2() ){
                    return 1;
                }
                else if(p1.getL2() < p2.getL2()){
                    return -1;
                }
                else if(p1.getL2() == p2.getL2()){
                    if(p1.getL1() > p2.getL1()){
                        return 1;
                    }
                    else if(p1.getL1() < p2.getL1()){
                        return -1;
                    }
                }
                return 0;
            }
        } ;

        // 2. Sort the pairs based on List 2's value (Ascending)
        // If you want to sort by list1, just change p.l1
       // pairs.sort(Comparator.comparingInt(p -> p.l2));
       // pairs.sort(pairComparator);

        pairs.sort((p1,p2) ->
                {
                    int cmp = Integer.compare(p1.l2, p2.l2);
                    if(cmp != 0) return cmp;
                    return Integer.compare(p1.l1,p2.l1) ;
                }
                );

        // 3. Put the values back into the lists
        for (int i = 0; i < pairs.size(); i++) {
            list1.set(i, pairs.get(i).l1);
            list2.set(i, pairs.get(i).l2);
        }

        System.out.println("list 1 : " + list1); // [4, 20, -1, -1]
        System.out.println("list 2 : " + list2); // [1, 2, 3, 10]
    }

    // Simple helper class
    static class Pair {
        int l1, l2;
        Pair(int l1, int l2) {
            this.l1 = l1;
            this.l2 = l2;
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