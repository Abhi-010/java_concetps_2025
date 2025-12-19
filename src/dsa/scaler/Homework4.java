package scaler_questions.Scaler;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int minElement = 0 ;
        int maxElement = 0 ;
        if(A[0] > A[1]){
            maxElement = A[0] ;
            minElement = A[1] ;
        }
        else{
            maxElement = A[1] ;
            minElement = A[0] ;
        }

        for(int i = 2 ; i < N ; i++){
            if(A[i] > maxElement){
                maxElement = A[i] ;
            }
            else if(A[i] < minElement){
                minElement = A[i] ;
            }
        }
        System.out.println(maxElement + " " +minElement) ;
        int count = 0 ;
        for(int i = 0 ; i < N ; i++){
            if(A[i] != minElement && A[i] != maxElement){
                count++ ;
            }
        }
        System.out.println(count);
         //1 1 2 2 3
    }

}
