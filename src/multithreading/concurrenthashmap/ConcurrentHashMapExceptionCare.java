package multithreading.concurrenthashmap;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExceptionCare {
    public static void main(String[] args){
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three",3);

        Iterator<Map.Entry<String,Integer>> iterator = map.entrySet().iterator();

        while(iterator.hasNext()) {
            Map.Entry<String,Integer> integerEntry = iterator.next();

            if(integerEntry.getKey().equals("Two")){
                map.put("Four",4);
            }
        }
        System.out.println(map);
    }
}
