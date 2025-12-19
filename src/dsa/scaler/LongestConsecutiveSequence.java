package scaler_questions.Scaler;

import java.util.HashSet;
import java.util.Iterator;

public class LongestConsecutiveSequence {
    public static void main(String[] args){

        int[] A = {100, 4, 200, 1, 3, 2} ;
        System.out.println(solve(A)) ;
    }

    static int solve(int[] A){
        HashSet<Integer> hs = new HashSet<>() ;

        for(int i = 0 ; i < A.length ; i++){
            hs.add(A[i]) ;
        }
        int maxLen = 1;
        for (Integer i: hs
             ) {
            if(hs.contains(i-1)){
                continue;
            }
            else{
                int ele = i ;
                int count = 1 ;

                while(hs.contains(ele+1)){
                    count++ ;
                    ele++ ;
                }
                maxLen = Math.max(count,maxLen) ;
            }

         }
        return  maxLen ;
        }
}
