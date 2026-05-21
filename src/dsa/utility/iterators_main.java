package dsa.utility;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class iterators_main {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        Iterator<Integer> iterator = al.iterator() ;

        while (iterator.hasNext()){
           // System.out.println(iterator.next());
            if(iterator.next() == 4){
                System.out.println("Removing element 3");
                iterator.remove();
            }

        }


        // Creating a ConcurrentHashMap
        ConcurrentHashMap<String, Integer> map
                = new ConcurrentHashMap<String, Integer>();

        map.put("ONE", 1);
        map.put("TWO", 2);
        map.put("THREE", 3);
        map.put("FOUR", 4);

        // Getting an Iterator from map
        Iterator it = map.keySet().iterator();

        while (it.hasNext()) {
            String key = (String)it.next();
            System.out.println(key + " : " + map.get(key));

            // This will reflect in iterator.
            // Hence, it has not created separate copy
            map.put("SEVEN", 7);
        }

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }


        System.out.println("Testing HashMap with null key and null value:");
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("A","Apple");
        hashMap.put("B","Ball");
        hashMap.put("C","Cat");
        hashMap.put(null,"NullKey");
        hashMap.put("D",null);

        System.out.println(hashMap.get("E"));
        if(hashMap.containsKey(null)){
            System.out.println("HashMap contains null key with value: " + hashMap.get(null));
        } else {
            System.out.println("HashMap does not contain null key.");
        }

        for(Map.Entry<String,String> entry : hashMap.entrySet()){
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
