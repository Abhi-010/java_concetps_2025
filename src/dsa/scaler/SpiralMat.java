package scaler_questions.Scaler;

public class SpiralMat {

    public static void main(String[] args){
        int A = 10 ;
        int [][] mat = generateMatrix(A) ;

        for(int i = 0 ; i < A ; i++){
            for(int j = 0 ; j < A ; j++){
                System.out.print(mat[i][j] + " ") ;
            }
            System.out.println() ;
        }
    }

    public static int[][] generateMatrix(int A) {
        int[][] mat = new int[A][A] ;
        int T = 0 , L = 0 , B = A-1 , R = A-1;
        int num = 1;

        while(T <= B && R >= L){

            for(int k = L ; k <= R ; k++){
                mat[T][k] = num;
                num++ ;
            }
            T++ ;

            for(int k = T ; k <= B ; k++){
                mat[k][R] = num ;
                num++ ;
            }
            R-- ;

            for(int k = R; k >= L ; k--){
                mat[B][k] = num ;
                num++ ;
            }
            B-- ;
            for(int k = B ; k >= T ; k--){
                mat[k][L] = num ;
                num++ ;
            }
            L++ ;
        }
        return mat ;

    }
}
