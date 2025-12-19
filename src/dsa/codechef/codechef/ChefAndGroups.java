package dsa.codechef.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class ChefAndGroups {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());

        while(testCases-- != 0){
            String str = br.readLine() ;

            int numberOfGroups = 0 ;
            if(str.charAt(0) == '1'){
                numberOfGroups++;
            }
            for(int i = 1 ; i < str.length() ; i++){
                if(str.charAt(i) == '1' && str.charAt(i-1) != '1'){
                    numberOfGroups++ ;
                }
            }
            System.out.println(numberOfGroups);
        }
    }
}
