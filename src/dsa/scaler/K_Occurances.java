package scaler_questions.Scaler;

import java.util.HashMap;

public class K_Occurances {
    public static void main(String[] args){
        int [] C = {1,2,2,3,3,7,7,9,8,-1} ;
        int A = 2 ;
        System.out.println(findHeight(A ,C)) ;
    }
    static int findHeight(int k , int[] C){

        HashMap<Integer,Integer> hm = new HashMap<>() ;
        for(int i = 0 ; i < C.length ; i++){
            if(hm.containsKey(C[i])){
                hm.put(C[i], hm.get(C[i]) + 1 ) ;
            }
            else{
                hm.put(C[i],1);
            }
        }
        int height = 0 ;
        for(int i = 0 ; i < C.length ; i++){
            if(hm.get(C[i]) == k){
                height = height + C[i] ;
                hm.put(C[i],-1);
            }
        }
        return height ;
    }
}
