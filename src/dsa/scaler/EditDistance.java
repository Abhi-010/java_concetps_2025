package scaler_questions.Scaler;

public class EditDistance {
    public static void main(String[] args){
        String A = "a" ;
        String B = "b" ;
        int N = A.length() ;
        int M = B.length() ;

        int[][] dp = new int[N+1][M+1] ;
        for(int i = 0 ; i <= N ;i++){
            for(int j = 0 ; j <= M ; j++){
                dp[i][j] = -1 ;
            }
        }
        dp[0][0] = 0 ;

        for(int i = 0 ; i < N ;i++){
            for(int j = 0 ; j < M ; j++){
                System.out.print(dp[i][j]) ;
            }
            System.out.println();
        }
        System.out.println(solve(A,N,B,M,dp)) ;
    }
    static  int solve(String A , int l1 , String B , int l2 , int[][]dp){
        System.out.println("you r here...");
        if(l1 == 0){
            return l2 ;
        }
        if(l2 == 0){
            return l1 ;
        }
        if(dp[l1][l2] == -1){
            System.out.println("you r here...");
            if(A.charAt(l1-1) == B.charAt(l2-1)){
                dp[l1][l2] = solve(A,l1-1 , B,  l2-1,dp) ;
            }
            else {
                System.out.println(solve(A, l1, B, l2 -1, dp));
                System.out.println(solve(A, l1-1, B, l2 -1, dp));
                System.out.println(solve(A, l1-1, B, l2, dp));

                dp[l1][l2] = 1 + Math.min( Math.min( solve(A, l1, B, l2 -1, dp) , solve(A, l1-1 , B ,l2-1,dp) ), solve(A,l1-1,B,l2,dp)) ;

            }
        }
        return dp[l1][l2] ;
    }
}
