package scaler_questions.Scaler;

public class RowToColumnZero {
    public static void main(String[] args){
        int [][] A =
                {
                        {1,2,0,4},
                        {5,6,7,1},
                        {0,12,9,4},
                        {4,4,4,4},
                } ;

        solve(A);
        for(int i = 0 ; i < A.length ; i++){
            for(int j = 0 ; j < A[0].length ; j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void solve(int[][] A){
        int r = A.length ;
        int c = A[0].length ;

        int[] row = new int[r];
        int[] col = new int[c];

        for(int i = 0 ; i < r ; i++){
            row[i] = -1 ;
        }
        for(int i = 0 ; i < c ; i++){
            col[i] = -1 ;
        }

        for(int i = 0 ; i < r ; i++){
            for(int j = 0 ; j < c ; j++){
                if(A[i][j] == 0){
                    row[i] = 0 ;
                    col[j] = 0 ;
                }
            }
        }

        for(int i = 0 ; i < r ; i++){
            for(int j = 0 ; j < c ;j++){
                if(row[i] == 0 || col[j] == 0){
                    A[i][j] = 0 ;
                }
            }
        }
    }

}
