package dsa.utility;


import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class TreeMap_Sorting {
    public static void main(String[] args) {
        TreeMap<Character,Integer> treeMap = new TreeMap<>();
        treeMap.put('z',9);
        treeMap.put('a',41);
        treeMap.put('b',5);


        treeMap.forEach((key,value)-> System.out.println(key + " : " + value));


    }
}
