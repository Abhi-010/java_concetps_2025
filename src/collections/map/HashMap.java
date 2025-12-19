package collections.map;

import java.util.Iterator;
import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        Map<String,Integer> hashMap = new java.util.HashMap<>();
        hashMap.put("Apple",4) ;
        hashMap.put("Mango",3) ;
        hashMap.put("Orange",4);

        // iteration :
        for(Map.Entry<String,Integer> m : hashMap.entrySet()){
            System.out.println("key : " + m.getKey() + " value : " + m.getValue());
        }
        System.out.println("Iteration through iterator : ");
        Iterator<String> itr = hashMap.keySet().iterator() ;
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
