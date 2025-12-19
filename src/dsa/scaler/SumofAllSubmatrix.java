package scaler_questions.Scaler;

public class SumofAllSubmatrix {
    public static void main(String[] args){

        int[][] A = { {4,-1,5},
                      {2,3,2}} ;

        System.out.println(BruteForce_add(A))  ;

        System.out.println(BruteForce_addWithPrefixSum(A));

    }
    static int BruteForce_add(int[][] A){

        int N = A.length ;
        int M = A[0].length ;

        int sum = 0 ;

        for(int r1 = 0 ; r1 < N ; r1++ ){
            for(int c1 = 0 ; c1 < M ; c1++){
                for(int r2 = r1 ; r2 < N ; r2++){
                    for(int c2 = c1 ; c2 < M ; c2++){
                        // r1 c1 to r2 c2
                        for(int i = r1 ; i <= r2 ; i++) {
                            for (int j = c1; j <= c2; j++) {

                                sum = sum + A[i][j];
                            }
                        }
                    }
                }
            }
        }
        return  sum  ;
    }

    static int BruteForce_addWithPrefixSum(int[][] A){
        int N = A.length ;
        int M = A[0].length ;
        int res = 0 ;

        for(int r1 = 0 ; r1 < N ; r1++ ){
            for(int c1 = 0 ; c1 < M ; c1++){
                for(int r2 = r1 ; r2 < N ; r2++){
                    for(int c2 = c1 ; c2 < M ; c2++){
                        // r1 c1 to r2 c2

                        int sum = solve(A,r1,c1,r2,c2) ;

                        res = res + sum ;
                    }
                }
            }
        }
        return  res  ;
    }
    public static int solve(int[][] A, int b, int c, int d, int e) {
        //create a prefix sum matrix
        int[][] p = new int[A.length][A[0].length] ;

        for(int i = 0 ; i < A.length ; i++){
            for(int j = 0 ; j < A[0].length ; j++){

                if(i == 0 && j ==0){
                    p[i][j] = A[i][j] ;
                }
                else if(i == 0){
                    p[i][j] = (p[i][j-1] + A[i][j]) ;
                }
                else if(j == 0 ){
                    p[i][j] = (p[i-1][j] + A[i][j]) ;
                }
                else{
                    p[i][j] = (p[i-1][j] + p[i][j-1] - p[i-1][j-1] + A[i][j]) ;
                }
            }
        }
            int x = 0 ;
            if(b == 0 && c == 0){
                x = p[d][e]  ;
            }
            else if(b == 0){
                x = (p[d][e] - p[d][c-1]) ;
            }
            else if(c == 0){
                x = (p[d][e] - p[b-1][e]) ;
            }
            else {
                x = (p[d][e] - p[b-1][e] - p[d][c-1]
                        + p[b-1][c-1])  ;
            }
            int res = x ;
            return res;
    }
}