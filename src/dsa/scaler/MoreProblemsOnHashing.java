package scaler_questions.Scaler;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class MoreProblemsOnHashing {
    public static void main(String[] args){



        //String A = "umeaylnlfd" ;
        //int B = 1 ;
        //System.out.println(solve(A,B)) ;

        //String[] A = {"fine", "none", "no"} ;
        //String B = "qwertyuiopasdfghjklzxcvbnm" ;
        //System.out.println(IsDictionary(A,B)) ;
        //int []A = {13, 10, 12, 8, 14, 17, 20, 15, 6, 7, 16, 5, 21, 18, 9, 11, 19} ;
        //int B = 2 ;
        //System.out.println(PairWithGivenXOR(A,B));
    }
    static int solve(String A, int B) {
        int[] arr = new int[26] ;

        for(int i = 0 ; i < A.length() ; i++){
            arr[A.charAt(i) - 97]++ ;
        }
        Arrays.sort(arr) ;
        int i = 0 ;
        while(arr[i] == 0){
            i++;
        }
        while(B != 0 && i < arr.length){
            if(arr[i] <= B){
                B = B - arr[i] ;
                i++ ;
                System.out.println(i) ;
            }
            else{
                break ;
            }
        }
        System.out.println(i) ;
        return arr.length-i ;
    }

    static int PairWithGivenXOR(int[]A, int B){
        HashSet<Integer> hs = new HashSet<>() ;

        for(int i = 0 ; i < A.length ; i++){
            hs.add(A[i]) ;
        }
        int count = 0 ;
        for(int i = 0 ; i < A.length ; i++){
            if(hs.contains(A[i] ^ B)){
                count++ ;
            }
        }
        return count/2 ;

    }
    static int IsDictionary(String[]A, String B){

        HashMap<Character,Integer> hm = new HashMap<>() ;
        for(int i = 0 ; i < B.length() ; i++){
            hm.put(B.charAt(i),i) ;
        }

        for(int i = 1 ; i < A.length ; i++){
            if(compareTwoWords( A[i-1], A[i], hm)){
                continue;
            }
            else{
                return 0 ;
            }
        }
        return 1 ;
    }

    static boolean compareTwoWords(String P, String Q,HashMap<Character,Integer> hm){
        int min_len = Math.min(P.length(), Q.length()) ;
        int i = 0 ;
        while(i!= min_len){
            if(hm.get(P.charAt(i)) < hm.get(Q.charAt(i))){
                return true ;
            }
            else {
                if(hm.get(P.charAt(i)) > hm.get(Q.charAt(i))){
                    return false ;
                }
            }
            i++ ;
        }

        if(P.length() < Q.length()){
            return true ;
        }
        return false ;
    }
}
