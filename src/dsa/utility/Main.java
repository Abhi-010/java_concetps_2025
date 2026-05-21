package dsa.utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) throws IOException {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(2);
        list.add(3);
        list.add(4);

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        HashMap<Integer,Integer> map1 = new HashMap<>();
        map1.put(1,10);
        map1.put(2,20);
        map1.put(3,30);

        for(Map.Entry<Integer,Integer> entry : map1.entrySet()){
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }





        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(1,10);
        map.put(null,20);
        map.put(null,30);

        ConcurrentHashMap<Integer,Integer> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put(1,10);
        concurrentHashMap.put(null,20);

        concurrentHashMap.forEach(( key, value) ->
        {
            System.out.println("Key: " + key + ", Value: " + value);
        });

        map.entrySet().forEach(entry -> {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        });




        //list.forEach(System.out::println);
        Collections.sort(list);
       // list.forEach(System.out::println);

        //list.sort(Collections.reverseOrder());
        Collections.sort(list,Collections.reverseOrder());
        //list.forEach(System.out::println);

        int[] A = new int[5];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
        String s = br.readLine();
        String[] arr = s.split(" ");


        for(int i = 0 ; i < 5 ; i++){
            A[i] = Integer.parseInt(arr[i]);
        }
        for(int i = 0 ; i < 5 ; i++){
            System.out.println(A[i]);
        }

        // 1 2 3 4 5
        /*
        1
        2
        3
        4
         */

//        Scanner sc = new Scanner(System.in);
//        for(int i = 0 ; i < 5 ; i++){
//            A[i] = sc.nextInt();
//        }
//        Arrays.sort(A);
//        for(int i = 0 ; i < 5 ; i++){
//            System.out.println(A[i]);
//        }



    }
}
