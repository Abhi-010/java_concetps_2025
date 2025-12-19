package dsa.codechef.codechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class MaximumTheMinimum {
    public static void main (String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
        int t = Integer.parseInt(br.readLine())  ;
        Scanner sc = new Scanner(System.in) ;
        while(t-- != 0){
            String st = br.readLine() ;
            String[] arrSt = st.split(" ") ;
            int N = Integer.parseInt(arrSt[0]) ;
            int K = Integer.parseInt(arrSt[1]) ;

            int[] A = new int[N];
            for(int i = 0 ;i < N ; i++){
                A[i] = sc.nextInt() ;
            }

            //sort Array Array
            Arrays.sort(A) ;
            for(int i = 0 ;i < N ; i++){
                System.out.println(A[i]);
            }
            if(K >= (N-1)){
                System.out.println(A[N-1]) ;
            }
            else{
                System.out.println(A[K]) ;
            }
        }
    }
}
