package scaler_questions.Scaler;

import java.util.Arrays;

public class MaximumUnsor {
    public static void main(String[] args){
        int[] A = {1, 2,3, 4, 5} ;
        int[] res = subUnsort(A) ;
        System.out.println(res[0] + " & " + res[1]);
    }
    public static int[] subUnsort(int[] A) {
        int[] B = new int[A.length] ;
        for(int i = 0 ; i < A.length ; i++){
            B[i] = A[i] ;
        }
        Arrays.sort(B) ;
        int l = -1 ;
        int r = -1 ;
        for(int i = 0 ; i < A.length ; i++){
            if(A[i] != B[i]){
                if(l == -1){
                    l = i ;
                }
                else {
                    r = i ;
                }
            }
        }
        return new int[]{l,r} ;
    }
}
