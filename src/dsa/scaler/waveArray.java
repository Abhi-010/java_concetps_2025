package scaler_questions.Scaler;

import java.util.Arrays;

public class waveArray {
    public static void main(String[] args){
        int[] A = {3,2,1,1} ;
        wave(A);

        for(int i = 0 ; i < A.length ; i++){
            System.out.print(A[i] + " ") ;
        }

    }
    static void wave(int [] A){
        Arrays.sort(A);
        for(int i = 0 ; i < A.length ; i+=2){
            int temp = A[i] ;
            A[i] = A[i+1] ;
            A[i+1] = temp ;
        }
    }
}
