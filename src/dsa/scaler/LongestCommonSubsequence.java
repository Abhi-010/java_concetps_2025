package scaler_questions.Scaler;

public class LongestCommonSubsequence {
    public static void main(String[] args){
        String A = "bebdeeedaddecebbbbbabebedc" ;
        String B = "abaaddaabbedeedeacbcdcaaed" ;

        System.out.println(lcs(A,A.length()-1, B, B.length()-1));
    }
    static int lcs(String A, int i, String B, int j){

        int N = i+1 ;
        int M = j+1 ;
        int[][] dp = new int[N][M] ;

        //fill 0th row
        for(int c = 0 ; c < M ; c++){
            if(B.charAt(c) == A.charAt(0)){
                dp[0][c] = 1 ;
            }
            if(c > 0 && dp[0][c-1] == 1 ){
                dp[0][c] = 1 ;
            }
        }

        for(int r = 0 ; r < N ; r++){
            if(B.charAt(0) == A.charAt(r)){
                dp[r][0] = 1 ;
            }
            if(r > 0 && dp[r-1][0] == 1){
                dp[r][0] = 1 ;
            }
        }

        for(int r = 1 ; r < N ; r++){
            for(int c = 1; c < M ; c++){
                if(A.charAt(r) == B.charAt(c)){
                    dp[r][c] = 1 + dp[r-1][c-1] ;
                }
                else {
                    dp[r][c] = Math.max(dp[r-1][c],dp[r][c-1]) ;
                }
            }
        }

        for(int r = 0 ; r < N ; r++){
            for(int c = 0 ; c < M ;c++){
                System.out.print(dp[r][c] + " ") ;
            }
            System.out.println();
        }
        return dp[N-1][M-1] ;
    }
}
