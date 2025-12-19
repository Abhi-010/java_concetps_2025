package scaler_questions.Scaler;

import java.util.Scanner;

public class BookLover {
    public static void main(String[] args){

        Scanner sc = new Scanner((System.in)) ;
        int N = sc.nextInt()  ;
        int[] A = new int[N] ;

        for(int i = 0 ; i < N ; i++){
            A[i] = sc.nextInt()  ;
        }
        int ans ;
        int[] B = new int[200000] ;


        for(int j = N - 1 ; j >= 0 ; j-- ){
            if(B[A[j]] == 0){
                ans = A[j] ;
                B[A[j]] = 1 ;
            }
        }

    }
}
