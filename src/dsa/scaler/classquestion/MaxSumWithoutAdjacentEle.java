package scaler_questions.Scaler.classquestion;

public class MaxSumWithoutAdjacentEle {
    public static void main(String[] args){
        /*
        int[][] A = { {16, 5, 54, 55, 36, 82, 61, 77, 66, 61},
                        {31, 30, 36, 70, 9, 37, 1, 11, 68, 14}} ;

         */

        int[][] A = { {74, 37, 82, 1},
                {66, 38, 16, 1}} ;

        System.out.println(adjacent(A));
    }
    static  public int adjacent(int[][] A) {
        int M = A[0].length ;
        if(M == 1){
            return Math.max(A[0][0], A[1][0]) ;
        }

        int[] ele = new int[M+1] ;

        for(int j = 1 ; j <= M ; j++ ){

            ele[j] = Math.max(A[0][j-1], A[1][j-1]) ;

        }
        int[] dp = new int[M+1] ;
        dp[0] = 0 ;
        dp[1] = ele[1] ;

        for(int i = 2 ; i <= M ;i++){
            dp[i] = Math.max( (dp[i-2] + ele[i]) , dp[i-1] ) ;
        }
        return dp[M] ;
    }
}
