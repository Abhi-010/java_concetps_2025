package scaler_questions.Scaler;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int [N] ;
        for(int i = 0 ; i < N ; i++){
            array[i] = sc.nextInt() ;
        }

        int evenMaxNumber = Integer.MIN_VALUE , oddMaxNumber = Integer.MIN_VALUE ;

        for(int i = 0 ; i < N ; i++){
            if(array[i] % 2 == 0){
                if(array[i] > evenMaxNumber){
                    evenMaxNumber = array[i]  ;
                }
            }
            else{
                if(array[i] > oddMaxNumber){
                    oddMaxNumber = array[i] ;
                }
            }

        }
        System.out.println(evenMaxNumber - oddMaxNumber) ;


    }
}
