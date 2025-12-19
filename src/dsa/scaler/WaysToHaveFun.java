package scaler_questions.Scaler;

public class WaysToHaveFun {

    public static void main(String[] args){
        int A = 100000 ;
        solve(A) ;
        System.out.println(solve(A)) ;
    }

    public static int solve(int N) {
        long[][] dp = new long[N+1][3] ;
        //0th row
        for(int j = 0 ; j < 3 ; j++){
            dp[0][j] = (long)0 ;
        }
        //0th col
        for(int j = 0 ; j < 3 ; j++){
            dp[1][j] = (long)1 ;
        }

        for(int i = 2 ; i <= N  ; i++){

            dp[i][0] = dp[i-1][0] + dp[i-1][1] + dp[i-1][2] ;
            dp[i][0] = (dp[i][0] + 1000000007)%1000000007 ;

            dp[i][1] = dp[i-1][0] + dp[i-1][2];
            dp[i][1] = (dp[i][1] + 1000000007)%1000000007 ;

            dp[i][2] = (dp[i-1][0] + dp[i-1][1] - (dp[i-2][2]%1000000007 + dp[i-2][2]%1000000007)+ 1000000007)%1000000007 ;

            dp[i][2] = (dp[i][2] + 1000000007)%1000000007 ;
        }


        for(int i = 0 ; i <= N ; i++){
            for(int j = 0 ; j < 3 ; j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println() ;
        }
        long ans = (  dp[N][0] + dp[N][1] + dp[N][2]  )%1000000007 ;
        System.out.println("ans " + ans);
        return (int)ans ;
    }
}
