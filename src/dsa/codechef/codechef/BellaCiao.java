package dsa.codechef.codechef;

import java.util.Scanner;

public class BellaCiao {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int testCases = sc.nextInt() ;

        while(testCases-- != 0){
            long D = sc.nextLong();
            long d = sc.nextLong() ;
            long P = sc.nextLong();
            long Q = sc.nextLong();

            long totalProductionAfter_d_days  ;
            long avgRateOfProductionFor_d_days ;
            long totalProduction ;

            long noOf_d_Days = D / d ;
            long remDaysAfter_d_Days = D % d ;

            totalProductionAfter_d_days = d * (noOf_d_Days * (2*P + Q * ( noOf_d_Days - 1 ))) / 2 ;

            totalProduction = totalProductionAfter_d_days + remDaysAfter_d_Days * (P + noOf_d_Days * Q) ;
            System.out.println(totalProduction);
        }
    }
}
