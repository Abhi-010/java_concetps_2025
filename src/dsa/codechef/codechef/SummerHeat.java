package dsa.codechef.codechef;

import java.util.Scanner;

public class SummerHeat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int testCases = sc.nextInt() ;

        while(testCases-- != 0){
            int xa = sc.nextInt() ;
            int xb = sc.nextInt() ;
            int Xa = sc.nextInt() ;
            int Xb = sc.nextInt() ;
            System.out.println(Xa/xa + Xb/xb);
        }
    }
}
