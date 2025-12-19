package scaler_questions.Scaler;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int [N] ;
        for(int i = 0 ; i < N ; i++){
            array[i] = sc.nextInt() ;
        }

        int result = 0 ;
        for(int i = 0 ; i < N ; i++){
            result = array[i] ^ result ;
        }
        System.out.println(result)  ;
    }

}
