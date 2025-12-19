package scaler_questions.Scaler;

public class MultipleLeftRotationArray {
    public static void main(String[] args){
        int[] A = {1,2,3,4,5} ;
        int[] B = {2,3} ;
        //int[][] mat = new int[B.length][A.length] ;
        int[][] mat = solve(A,B) ;

        for(int i = 0 ; i < B.length ; i++){
            for(int j = 0 ; j < A.length ; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] solve(int[]A, int[] B){
        int[][] mat = new int[B.length][A.length]  ;

        for(int i = 0; i < B.length ; i++){

            for(int k = 0 ; k < A.length ; k++){
                mat[i][k] = A[k] ;
            }
            int N = A.length ;
            int K = B[i] % N ;

            reverseLeft(mat, i ,0, N-1) ;
            reverseLeft(mat,i ,0, N-K-1);
            reverseLeft(mat,i ,N-K, N-1) ;


        }
        return mat  ;
    }
    static void reverseLeft(int[][] mat, int index, int s, int e){

        int i = s ;
        int j = e ;
        int temp ;
        while(i < j){
            temp = mat[index][i] ;
            mat[index][i] = mat[index][j] ;
            mat[index][j] = temp ;
            i++ ;
            j-- ;
        }
    }
}
