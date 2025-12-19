package collections;

import collections.List.Pair;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        List<Integer> [] arr = new List[1];


        Queue<Pair> pq = new PriorityQueue<>(
                (o1, o2) -> {
                    if(o1.getSecond() < o2.getSecond()){
                        return 1;
                    }
                    else if(o1.getSecond() > o2.getSecond()){
                        return -1;
                    }
                    return 0 ;
                }
        );

        pq.add((new Pair(2,3)));
        pq.add(new Pair(5,5));
        pq.add(new Pair(9,-1));

        while(!pq.isEmpty()){
            Pair p = pq.poll() ;
            System.out.print("first : " + p.getFirst() + " ");
            System.out.println("second : " + p.getSecond());
        }
        /*
        HashMap<String,Integer> map = new HashMap<>();
        map.put("apple",5) ;
        map.put("banana",2) ;
        map.put("watermelon",1);
        map.put("orange",1);

        String[][] ans = sortMap(map);
        for(int i = 0 ; i < ans.length ; i++){
            System.out.print(ans[i][0] + " " + ans[i][1]);
            System.out.println();
        }

         */
    }
    public static String[][] sortMap(HashMap<String,Integer> map){

        TreeMap<String, Integer> treeMap = new TreeMap<>(map);


        int n = treeMap.size() ;
        System.out.println("n : " + n);



        String[][] ans = new String[n][2];
        int i = 0 ;

        for(Map.Entry<String,Integer> entry : treeMap.entrySet()){
            ans[i][0] = entry.getKey();
            ans[i][1] = entry.getValue() + "" ;
            i++ ;
        }
        return ans ;
    }
}
