package scaler_questions.Scaler;

public class firstMissingPositive {
    public static void main(String[] args){
        int[] A = {8, 10, 1, -3, 2, -5} ;
        //int[] A = {3,2,1};
        System.out.println(solve(A));
    }
    static int solve(int[] A){
        int N = A.length ;
        for(int i = 0 ; i < N ;i++){
            if(A[i]>=1 && A[i] <= N){
                if( A[i] != A[A[i]-1] ){
                    int index = A[i] - 1;
                    int temp = A[i] ;
                    A[i] = A[A[i]-1] ;
                    A[index] = temp ;
                    i-- ;
                }
            }
        }
        for(int i =  0 ;i < N ; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println() ;
        int count = 1 ;
        for(int i = 0 ; i < N ; i++){
            if(A[i] != count){
                return count ;
            }
            count++ ;
        }
        return count ;
    }
}
