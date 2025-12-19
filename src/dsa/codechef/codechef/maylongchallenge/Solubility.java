package dsa.codechef.codechef.maylongchallenge;

import java.util.Scanner;

public class Solubility {
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt() ;

        while(testCases-- > 0)
        {
            int X = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt() ;
            int sugarDissolve = ( A + B*(100 - X) ) * 10 ;
            System.out.println(sugarDissolve);
        }
    }

}
