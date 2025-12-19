package dsa.codechef.codechef.sep21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class TravelPass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;

        int testCases = Integer.parseInt(br.readLine());
        while(testCases-- != 0){

           String st = br.readLine() ;
           String[] arr = st.split(" ") ;
           int N = Integer.parseInt(arr[0]) ;
           int A = Integer.parseInt(arr[1]) ;
           int B = Integer.parseInt(arr[2]) ;

           String S = br.readLine() ;

           int numberOfTimeCrossingDistrict = 0 ;
           int numberOfTimeCrossingState = 0 ;

           for(int i = 0 ; i < N ; i++){
               if(S.charAt(i) == '0')
                   numberOfTimeCrossingDistrict++ ;
               else
                   numberOfTimeCrossingState++ ;
           }

           System.out.println(numberOfTimeCrossingDistrict * A + numberOfTimeCrossingState * B);
        }
    }
}
