package dsa.codechef.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class SmallestPair {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
        int t = Integer.parseInt(br.readLine())  ;
        while(t-- != 0){
            String st = br.readLine() ;
            String[] arrSt = st.split(" ") ;
            int A = Integer.parseInt(arrSt[0]) ;
            int B = Integer.parseInt(arrSt[1]) ;
            int C = Integer.parseInt(arrSt[2]) ;
        }

        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt() ;
        while(testCases-- != 0){
            int N = sc.nextInt() ;
            int[] arr = new int[N] ;

            for(int i = 0 ; i < N ; i++){
                arr[i] = sc.nextInt() ;
            }
            Arrays.sort(arr) ;
            sort(arr);
            System.out.println(arr[0] + arr[1]);
        }
    }
    public static void sort(int[] elements){
        for(int j = elements.length - 1 ;  j > 0 ; j--){
            for(int i = 0 ; i < j ; i++){
                if(elements[i] > elements[i+1]){
                    swap(elements,i,i+1);
                }
            }
        }
    }
    public static void swap(int[] elements , int i , int j){
        int temp = elements[i] ;
        elements[i] = elements[j];
        elements[j] = temp ;
    }
}
