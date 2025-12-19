package scaler_questions.Scaler;

public class MaxChunks {
    public static void main(String[] args){
        int[] A = {2,0,1,4,3,5,6} ;
        System.out.println(solve(A)) ;
    }
    static int solve(int[] A){
        int count = 0 ;
        for(int i = 0 ; i < A.length ; i++){
            if(A[i] == i){
                count++ ;
            }
            else {
                int val = A[i] ;
                for(int k = i ; k <=val ; k++){
                    if(A[k] > val){
                        val = A[k] ;
                    }
                }
                i = val ;
                count++ ;
            }
        }
        return count ;

    }
}
