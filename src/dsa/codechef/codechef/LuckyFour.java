package dsa.codechef.codechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LuckyFour {
    public static void main (String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine()) ;
        while(testCases-- != 0){
            String st = br.readLine() ;
            int countOfFour = 0 ;
            for(int i = 0 ; i < st.length() ; i++){
                if( st.charAt(i) == '4'){
                    countOfFour++;
                }
            }
            System.out.println(countOfFour) ;
        }
    }
}
