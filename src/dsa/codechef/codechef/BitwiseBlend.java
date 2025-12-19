package dsa.codechef.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BitwiseBlend {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()) ;
        while(t-- != 0){
            int N = Integer.parseInt(br.readLine()) ;
            int [] A = new int[N] ;
            String seq = br.readLine() ;
            String[] seqArr = seq.split(" ") ;
            for(int i = 0 ; i < N ; i++){
                A[i] = Integer.parseInt(seqArr[i]) ;
            }
            //A : Seq
            int numOfOperation = 0 ;
            int[] res = new int[2*N] ;

            for(int i = 0 ; i < 2*N ; i++){
                res[i] = -1 ;
            }
            int numOfEven = 0 ;
            int numOfOdd = 0 ;
            for(int i = 0 ; i < N ; i++){
                if((A[i] & 1) == 1){
                    numOfOdd++ ;
                }
                else{
                    numOfEven++ ;
                }
            }
            if(numOfEven == 0 || numOfOdd == 0){
                System.out.println(-1);
            }
            else {
                //main logic
                int a = A[0] ;
                int b = A[1] ;
                int c = A[2] ;


                for(int i = 1 ; i < N-1 ; i++){

                }
            }

        }
    }
}
