package dsa.codechef.codechef;

import java.util.Scanner;

public class LongestAndStarry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases-- != 0) {

            int N = sc.nextInt();
            int lp = LowestPower(N) ;
            int lp1 =  LowestPower(lp-1) ;

            System.out.println(Math.max((N-lp+1),(lp-lp1))) ;
        }
    }
    static int LowestPower(int N ){
        int ans = 1 ;

        while(ans <= N){
            ans = ans * 2 ;
        }
        return ans/2 ;
    }
}


