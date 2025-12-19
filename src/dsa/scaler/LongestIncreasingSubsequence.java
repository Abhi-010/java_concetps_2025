package scaler_questions.Scaler;

public class LongestIncreasingSubsequence {
    public static void main(String[] args){
        int [] A = {1,2,3,4,5,10,11,12} ;
        System.out.println(lis(A)) ;
    }

    static int lis(int[] A){
        int[] dp = new int[A.length] ;
        dp[0] = 1 ;

        for(int i = 1 ; i < A.length ;i++){
            int val = 1 ;
            for(int j = 0 ; j < i ; j++){
                if(A[j] < A[i]){
                    val = Math.max(val, (1+dp[j])) ;
                }
            }
            dp[i] = val ;
        }

        int ans = dp[0] ;
        for(int i = 0 ; i < A.length ;i++){
            ans = Math.max(ans, dp[i]) ;
        }
        return ans ;
    }
}
