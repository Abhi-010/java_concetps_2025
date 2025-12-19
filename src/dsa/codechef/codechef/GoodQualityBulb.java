package dsa.codechef.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class GoodQualityBulb {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
        Scanner sc = new Scanner((System.in)) ;
        int t = Integer.parseInt(br.readLine());
        while(t-- != 0)
        {
            String st = br.readLine() ;
            String st1 = br.readLine() ;


            String[] arrSt = st.split(" ") ;
            int N = Integer.parseInt(arrSt[0]) ;
            int X = Integer.parseInt(arrSt[1]) ;

            String[] arrSt1 = st1.split(" ") ;

           int sum = 0 ;
           for(int i = 0 ; i < N-1 ; i++){
               sum = sum + Integer.parseInt(arrSt1[i])  ;
           }
            if(sum >= (N*X)){
                System.out.println(0) ;
            }
            else {
                System.out.println( (N*X) - sum   ) ;
            }
        }
    }
}
