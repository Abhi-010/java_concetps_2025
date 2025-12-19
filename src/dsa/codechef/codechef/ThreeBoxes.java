package dsa.codechef.codechef;

import java.util.Scanner;

public class ThreeBoxes {

    public static void main (String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in) ;

        int testCases = sc.nextInt() ;

        while(testCases-- != 0){

            int A = sc.nextInt() ;
            int B = sc.nextInt() ;
            int C = sc.nextInt() ;
            int D = sc.nextInt() ;

            if(A+B+C <= D){
                System.out.println(1);
            }
            else if(A+B <= D || B+C <= D || A + C <= D){
                System.out.println(2);
            }
            else{
                System.out.println(3);
            }
        }
    }
}
