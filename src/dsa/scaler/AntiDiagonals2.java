package scaler_questions.Scaler;

public class AntiDiagonals2 {
    public static void main(String[] args){
        int[][] A =
                {
                        {1,2,3,4,5},
                        {6,7,8,9,10},
                        {11,12,13,14,15},
                        {16,17,18,19,20},
                        {21,22,23,24,25}
                } ;

        solve(A) ;
    }
    static void solve(int [][] A){
        int r = 2 * A.length - 1;
        int c = A.length ;

        int[][] mat = new int[r][c] ;

        for(int j = 0 ; j < A[0].length ; j++){
            int k = j ;
            int i = 0 ;

            while(i < A.length && k > -1) {
                mat[j][i] = A[i][k];
                k--;
                i++;
            }
        }
        int p = A.length ;

        for(int i = 1; i < A.length ; i++){

            int k = i ;
            int j = A.length - 1 ;
            int q = 0 ;
            while(k < A.length && j > -1){

                mat[p][q] = A[k][j] ;
                j-- ;
                k++ ;
                q++ ;
            }
            p++ ;
        }

        for(int i = 0 ; i < r ; i++){
            for(int j = 0; j < c ; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println() ;
        }
    }
}
