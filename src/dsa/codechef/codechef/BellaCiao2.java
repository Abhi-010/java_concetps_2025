package dsa.codechef.codechef;

import java.util.Scanner;

public class BellaCiao2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int testCases = sc.nextInt() ;

        while(testCases-- != 0){
            int D = sc.nextInt();
            int d = sc.nextInt() ;
            int p = sc.nextInt();
            int q = sc.nextInt() ;

            int numOfd_days = D / d ;
            int remDay = D % d ;
            int totalProduction = 0  ;
            for(int i = 0 ; i < numOfd_days ; i++){
                totalProduction = totalProduction +  d*(p + i * q)  ;
            }
            totalProduction = totalProduction + remDay*(p + numOfd_days * q) ;
            System.out.println(totalProduction) ;
        }
    }
}
