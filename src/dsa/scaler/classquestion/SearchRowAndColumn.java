package scaler_questions.Scaler.classquestion;

public class SearchRowAndColumn {

    public static void main(String[] args){

        int [][] A = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        } ;
        int k = 2 ;
        System.out.println(findElement(A, k));
    }

    static int  findElement(int[][] A, int B){
        int N = A.length ;
        int M = A[0].length ;

        int i = 0 , j = M-1;


        int indices = Integer.MAX_VALUE ;

        if(B < A[0][0] || B > A[N-1][M-1])
            return -1 ;

        while((i < N && j < M) && ( i > -1 && j > -1)){

            if(A[i][j] == B){
                int p = i ;
                int q = j ;

                while(q > -1 ){
                    if(A[i][j] == A[p][q]){
                        if((p+1)*1009 + (q+1) < indices){
                            indices = (p+1)*1009 + (q+1) ;
                        }
                    }
                    else {
                        break;
                    }
                    q-- ;
                }
                p = i ;
                q = j ;
                while(p < N ){
                    if(A[i][j] == A[p][q]){
                        if( (p+1)*1009 + (q+1) < indices){
                            indices = (p+1)*1009 + (q+1) ;
                        }
                    }
                    else {
                        break ;
                    }
                    p++ ;
                }
                i++ ;
                j-- ;
            }
            else if(A[i][j] < B){
                i = i + 1;
            }
            else {
                j = j - 1 ;
            }
        }

        if(indices == Integer.MAX_VALUE){
            return -1 ;
        }
        else {
            return indices ;
        }

    }
}
