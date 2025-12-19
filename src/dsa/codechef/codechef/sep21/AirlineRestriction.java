package dsa.codechef.codechef.sep21;

import java.util.Scanner;

public class AirlineRestriction {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;
        int testCases = sc.nextInt() ;
        while(testCases-- != 0) {
            int A = sc.nextInt() ;
            int B = sc.nextInt() ;
            int C = sc.nextInt() ;
            int D = sc.nextInt() ;
            int E = sc.nextInt() ;

            if(A <= E && (B+C) <= D)
            {
                System.out.println("Yes");
            }
            else if( B <= E && (A+C) <= D)
            {
                System.out.println("Yes");
            }
            else if(C <= E && (A+B) <= D)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
    }
}
