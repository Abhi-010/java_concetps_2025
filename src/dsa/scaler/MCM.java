package scaler_questions.Scaler;

public class MCM {

    public static void main(String[] arg){
        //int [] A = {45, 17, 34, 27, 12, 22} ;
        //int [] A = {10,20,30} ;
        int [] A = {4, 2, 3, 1} ;
        System.out.println(solve(A)) ;
    }
    static int solve(int[] A){
        int N = A.length ;
        if(N == 1){
            return 0 ;
        }
        int numMat = N-1 ;
        int [][] dp = new int[N][N] ;
        for(int r = 0 ; r < N ; r++){
            for(int c = 0 ; c < N ; c++){
                dp[r][c] = -1 ;
            }
        }
        int i = 1 ;
        int j = numMat ;
        minCost( dp, A, i, j ) ;

        //print :
        for(int r = 0 ; r < N ; r++){
            for(int c = 0 ; c < N ; c++){
                System.out.print(dp[r][c] + " ");
            }
            System.out.println();
        }
        return dp[1][numMat] ;
    }

    static int minCost(int[][] dp , int[] V, int i , int j ){
        if(i == j){
            return 0 ;
        }
        if(dp[i][j] == -1){
            int ans = Integer.MAX_VALUE ;
            for(int k = i ; k < j ; k++){
                int l = minCost(dp, V, i, k) ;

                int r = minCost(dp, V, k+1, j) ;

                int c = V[i-1] * V[j] * V[k] ;

                ans = Math.min(ans , l+r+c) ;
            }
            dp[i][j] = ans  ;
        }
        return dp[i][j] ;
    }
}
