package dsa.codechef.codechef;

import java.util.Scanner;

public class Marathon {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt() ;

        while(testCases-- != 0){
            int D = sc.nextInt() ;
            int d = sc.nextInt() ;
            int A = sc.nextInt() ;
            int B = sc.nextInt() ;
            int C = sc.nextInt() ;
            int totalDistanceCoverByChef = d * D  ;

            if(totalDistanceCoverByChef >= 42){
                System.out.println(C);
            }
            else if(totalDistanceCoverByChef < 42 && totalDistanceCoverByChef >=21){
                System.out.println(B);
            }
            else if(totalDistanceCoverByChef < 21 && totalDistanceCoverByChef >= 10){
                System.out.println(A);
            }
            else{
                System.out.println(0);
            }
        }

    }


}
