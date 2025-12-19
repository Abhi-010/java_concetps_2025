package scaler_questions.Scaler;

import java.util.Scanner;

public class EvenOddElements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int testCases = sc.nextInt() ;

        while(testCases-- != 0){
            int countOfEven = 0 ;
            int countOfOdd = 0  ;
            int N = sc.nextInt() ;
            for(int i = 0 ; i < N ; i++){
                int num = sc.nextInt() ;
                if((num & 1) != 0){
                    countOfEven++ ;
                }
                else{
                    countOfOdd++  ;
                }
            }
            System.out.println(Math.abs((countOfEven-countOfOdd)));
        }
    }
}
