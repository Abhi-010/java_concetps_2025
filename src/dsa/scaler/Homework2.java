package scaler_questions.Scaler;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int N = sc.nextInt() ;
        int[] array = new int[N] ;
        int[] arrayNew = new int[N-2] ;

        for(int i = 0 ; i < N ; i++){
            array[i] = sc.nextInt() ;
        }

        int s1 ;
        int s2 ;
        if(array[0] < array[1]){
            s1 = array[0] ;
            s2 = array[1] ;
        }
        else {
            s1 = array[1] ;
            s2 = array[0] ;
        }

        //finding two largest number in array
        for(int i = 2 ; i < N ; i++ ){
            if(array[i] > s1 && array[i] > s2 ){
                s1 = s2 ;
                s2 = array[i] ;
            }
            else{
                if(array[i] > s1 && array[i] < s2){
                    s1 = array[i] ;
                }
            }
        }
        //System.out.println(s1 + " " + s2) ;

        for(int i = 0,j=0 ; i < N ; i++){

            if(array[i] < s1 && array[i] < s2){
                arrayNew[j] = array[i] ;
                j++ ;
            }
        }
        for(int i = 0 ; i < (N-2) ; i++){
            System.out.print(arrayNew[i] + " ");
        }
    }
}
