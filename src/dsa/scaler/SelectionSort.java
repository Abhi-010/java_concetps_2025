package scaler_questions.Scaler;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] A = {5,5,6,6,10,5,5};
        sort(A)  ;
        for(int i = 0 ; i< A.length ; i++){
            System.out.print(A[i] + " ") ;
        }
    }
    static void sort(int[] A){

        Arrays.sort(A);
        /*
        int N = A.length ;
        for(int i = N-1 ; i >= 0 ; i--){
            int max = A[i] ;
            int index = i ;
            int temp = 0 ;
            for(int j = 0 ; j <= i ; j++){

                if(A[j] > max){
                    max = A[j] ;
                    index = j ;
                }
            }
            temp = A[index] ;
            A[index] = A[i] ;
            A[i] = temp ;
        }*/
    }
}
