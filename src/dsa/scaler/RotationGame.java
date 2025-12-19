package scaler_questions.Scaler;

public class RotationGame {
    public static void main(String[] args){
        int[] A = {1,2,3,4,5} ;
        int k = 11 ;

        int N = A.length ;
        k = k % N ;
        reverse(A,0,N-1);
        reverse(A,0,k-1);
        reverse(A,k,N-1);

        for(int i = 0 ; i < A.length ; i++){
            System.out.print(A[i] + " ");
        }



    }
    static void rotate(int[] A, int k){
        int N = A.length ;
        k = k % N ;

        int[] B = new int[N] ;

        for(int i = 0  ; i < k  ; i++ ){
          B[i] = A[N-k+i] ;
        }
        for(int i = 0 ; i < N-k ; i++){
            B[k+i] = A[i] ;
        }

        for(int i = 0 ; i < B.length ; i++){
            System.out.print(B[i] + " ");
        }

    }

    static void reverse(int[] A, int i , int j){
        int temp ;
        while(i < j){
            temp = A[i] ;
            A[i] = A[j] ;
            A[j] = temp  ;
            i++ ;
            j-- ;
        }
    }
}
