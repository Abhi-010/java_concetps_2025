package scaler_questions.Scaler;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt() ;
        int[][] array = new int[A][A] ;

        for(int i = 0 ; i < A ; i++){
            for(int j = 0 ; j < A ; j++){
                array[i][j] = 0  ;
            }
        }
        for(int i = 0 ; i < A ; i++){
            for(int j = 0 ; j <= i; j++){
                array[i][j] = j + 1 ;
            }
        }
        for(int i = 0 ; i < A ; i++){
            for(int j = 0 ; j < A ; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
