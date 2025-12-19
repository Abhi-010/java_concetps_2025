package scaler_questions.Scaler.classquestion;

public class ProblemsOnArray {
    public static void main(String[] args){

        int [][] A = {
                        {5,10,15,16},
                        {6,12,18,24},
                        {7,14,21,28},
                        {8,16,24,32},
                        } ;
        int k = 1 ;
        System.out.println(findElement(A, k));
    }

    static boolean findElement(int[][] A, int k){
        int N = A.length ;
        int M = A[0].length ;

        int i = 0 , j = M-1;

        if(k < A[0][0] || k > A[N-1][M-1])
            return false ;

        while(i < N && j < M){

            if(A[i][j] == k){
                return true ;
            }
            else if(A[i][j] < k){
                i = i + 1;
            }
            else {
                 j = j - 1 ;
            }
        }
        return false ;
    }
}
