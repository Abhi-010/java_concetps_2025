package dsa.codechef.codechef.sep21;

import java.util.Scanner;

public class ShufflingParities {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int testCases = sc.nextInt() ;

        while(testCases-- != 0){
            int N = sc.nextInt() ;
            int[] A = new int[N] ;

            for(int i = 0 ; i < N ; i++){
                A[i] = sc.nextInt() ;
            }

            int numberOfEvenNumbers = 0 ;
            int numberOfOddNumbers  = 0 ;

            for(int i = 0 ; i < N ; i++){
                if(A[i] % 2 == 0)
                    numberOfEvenNumbers++ ;
                else
                    numberOfOddNumbers++ ;
            }

            int numberOfEvenPos ;
            int numberOfOddPos ;

            if(N % 2 == 0){
                numberOfEvenPos = N / 2 ;
                numberOfOddPos = N /2 ;
            }
            else{
                numberOfEvenPos = N / 2 ;
                numberOfOddPos = N / 2 + 1 ;
            }

            int sumOfArrayB = 0 ;

            if(numberOfEvenPos <= numberOfOddNumbers){
                sumOfArrayB = sumOfArrayB + numberOfEvenPos ;
            }
            else{
                sumOfArrayB = sumOfArrayB + numberOfOddNumbers ;
            }

            if(numberOfOddPos <= numberOfEvenNumbers){
                sumOfArrayB = sumOfArrayB + numberOfOddPos ;
            }
            else{
                sumOfArrayB = sumOfArrayB + numberOfEvenNumbers ;
            }
            System.out.println(sumOfArrayB);
        }
    }
}
