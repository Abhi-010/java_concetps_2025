package scaler_questions.Scaler;

public class rotateMatrix {
    public static void main(String[] args){

        int [][] A = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        } ;
        int row = A.length ;
        int col = A[0].length ;
        transpose(A);
        reverse(A);

        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                System.out.print(A[i][j] + " ") ;
            }
            System.out.println() ;
        }
    }

    public static void transpose(int[][] A){
        int k=0;
        for(int i = 0 ; i<A.length ; i++){

            for(int j = i+1 ; j < A[0].length ; j++){
                k = A[i][j] ;
                A[i][j] = A[j][i] ;
                A[j][i] = k ;
            }
        }
    }

    public static void reverse(int[][] A){
        int k = 0 ;
        int i = 0 ;
        int j = A[0].length-1 ;

        while(i < j){

            for(int p = 0 ; p < A.length ; p++){
                k = A[p][i] ;
                A[p][i] = A[p][j] ;
                A[p][j] = k  ;
            }
            i++;
            j--;
        }

    }
}
