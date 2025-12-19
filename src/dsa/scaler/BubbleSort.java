package scaler_questions.Scaler;

public class BubbleSort {
    public static void main(String[] args){
        int[] A = {9,5,1} ;
        sort(A) ;
        for(int i = 0 ; i < A.length ; i++){
            System.out.println(A[i] + " ") ;
        }
    }
    static void sort(int[]A){
        int N = A.length - 1 ;
        for(int k = 0 ; k <  N ; k++ ){
            for(int i = 0 ; i < N ; i++){
                if(A[i] > A[i+1]){
                    int temp = A[i] ;
                    A[i] = A[i+1] ;
                    A[i+1] = temp ;
                }
            }
        }
    }
}
