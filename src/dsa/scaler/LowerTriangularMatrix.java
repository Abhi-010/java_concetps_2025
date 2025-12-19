package scaler_questions.Scaler;

public class LowerTriangularMatrix {
    public static void main(String[] args){
        int [][] A =
                {
                        {1,0,0,0},
                        {3,5,0,5},
                        {5,7,8,0},
                        {0,0,0,0}

                } ;
        System.out.println(IsLowerMatrix(A)) ;
    }
    static int IsLowerMatrix(int[][] A){
        for(int i = 0;  i < A.length - 1  ; i++){
            for(int j = i + 1 ; j < A.length ;j++){
                if(j > i){
                    if(A[i][j] != 0){
                        return 0 ;
                    }
                }
            }
        }
        return 1 ;
    }
}
