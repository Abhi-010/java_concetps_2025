package scaler_questions.Scaler;

import myPackage.codechef.practice.INTEST;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicates {
    public static void main(String[] args){
        int [] A = {156629687, 156629687, 950873097, -816928664, 633452756, 156629687, -816928664, 950873097, 950873097} ;
       System.out.println(solve(A)) ;
    }
    public static int solve(final int[] A) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>() ;

        for(int i = 0 ; i < A.length ; i++){
            if(map.containsKey(A[i])){
                map.put(A[i], map.get(A[i]) + 1) ;
            }
            else{
                map.put(A[i], 1 ) ;
            }
        }

        int ans = 0 ;
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue())  ;

        }
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getValue() > 1){
                ans = ans + e.getValue() ;

            }
        }
        return ans ;
    }
}
