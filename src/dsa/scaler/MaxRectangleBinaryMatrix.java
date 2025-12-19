package scaler_questions.Scaler;

public class MaxRectangleBinaryMatrix {
    public static void main(String[] args){

      /*  int [][] A = {
                {1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1},
                {1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1},
                {1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0},
                {1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1},
                {1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1},
                {1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1}
        };



        int[][] A = {
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 1, 1, 0, 0, 0}
        };
        */
        int[][] A = {
                {0, 0, 1, 0, 0, 0, 1, 0, 1},
                {0, 1, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 1, 0, 1, 0, 1},
                {0, 1, 0, 0, 0, 1, 1, 0, 1},
                {0, 1, 0, 0, 0, 0, 1, 1, 1},
                {1, 0, 1, 1, 1, 0, 1, 1, 1},
                {1, 1, 1, 1, 0, 1, 1, 1, 1},
                {1, 1, 1, 0, 1, 0, 1, 0, 1}
        };
        System.out.println(maximalRectangle(A));
    }
    public static int maximalRectangle(int[][] A) {
        int N = A.length ;
        int M = A[0].length ;

        int[][] pf_mat = new int[N][M] ;

        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < M ; j++){

                if(j == 0 && A[i][j] == 1 ){
                    pf_mat[i][j] = 1 ;
                }
                else {
                    if(A[i][j] == 1){
                        pf_mat[i][j] = 1 + pf_mat[i][j-1] ;
                    }
                }
            }
        }
        for(int i = 0 ; i < N ; i++){
            for(int j = 0  ; j < M ; j++){
                System.out.print(pf_mat[i][j] + " ") ;
            }
            System.out.println() ;
        }

        int area = Integer.MIN_VALUE ;

        for(int j = M-1 ; j >= 0 ; j--){
            int w = pf_mat[N-1][j];
            int h = 0 ;
            for(int i = N-1 ; i >= 0 ; i--) {
                if (pf_mat[i][j] == 0) {
                    h = 0;
                } else {
                    if(i != 0){
                        w = Math.min(pf_mat[i][j],pf_mat[i+1][j]) ;
                    }
                    else{

                    }
                    //w = Math.min(w, pf_mat[i][j]);
                    h = h + 1;

                }
                area = Math.max(area, (h*w)) ;
            }
        }
        return area ;
    }
}
