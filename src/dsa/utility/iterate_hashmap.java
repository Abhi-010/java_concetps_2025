package dsa.utility;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class iterate_hashmap {
    public static void main(String[] args) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('A', 1);
        map.put('B', 2);
        map.put('C', 3);
        map.put('D', 4);
        map.put('E', 5);
        map.put('F', 6);

        // just iterate on hashmap :
        map.entrySet().forEach(System.out::println);

        // iterate and modify each value to double.

        //map.entrySet().stream().map((k,v)-> ) ;

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            map.put(entry.getKey(), entry.getValue()*2) ;
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue() );
        }
    }
}

class frequency_hashmap{
    public static void main(String[] args) {
        int[] A = {1,2,3,3,2,1,5,5,2,1,3,5,6,10,11,12,11,12};
        // frequency map int , count of numbers
        System.out.println("Simple Frequency Map Using for loop : ");
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i = 0 ; i < A.length ; i++){
            if(!hashMap.containsKey(A[i])){
                hashMap.put(A[i],1);
            }
            else{
                hashMap.put(A[i], hashMap.get(A[i])+1) ;
            }
        }
        hashMap.entrySet().forEach(System.out::println);
        System.out.println("Simple Frequency Map Using for Simplified for loop : ");
        hashMap = new HashMap<>();
        for (int j : A) {
            if (!hashMap.containsKey(j)) {
                hashMap.put(j, 1);
            } else {
                hashMap.put(j, hashMap.get(j) + 1);
            }
        }
        hashMap.entrySet().forEach(System.out::println);

        System.out.println("Simple Frequency Map Using for Adv. Simplified for loop : ");

        hashMap = new HashMap<>();
        for (int j : A) {
            hashMap.put(j, hashMap.getOrDefault(j,0)+1);
        }
        hashMap.entrySet().forEach(System.out::println);

        System.out.println("Simple Frequency Map Using for Stream APIs : ");

        HashMap<Integer,Long> hashMap1 ;

       ///hashMap1 =  Arrays.stream(A).collect(Collectors.groupingBy( Function.identity(),Collectors.counting() )) ;

        Map<Integer, Long> collect = Arrays.stream(A).boxed().collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        collect.entrySet().forEach(System.out::println);
    }
}














