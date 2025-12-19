package scaler_questions.Scaler;

public class MinimizeAndOfXoR {
    public static void main(String[] args) {
        int A[][ ] = {
                {1,1,1},
                {1,3,3}
        };
        int B = 0;
        System.out.println(solve(A,B));
    }
    public static int solve(int[][] A, int B){
        int N = A.length;
        int M = A[0].length;
        int[] xor = new int[N];

        for(int i = 0 ; i < N ; i++){
            int x = 0;
            for(int j = 0 ; j < A[i].length ; j++){
                x = x ^ A[i][j];
            }
            xor[i] = x;
        }

       // System.out.println("end");
        int and = xor[0];
        for(int i = 0 ; i < N ; i++){
            and = and & xor[i];
        }

        //System.out.println(and);
        for(int i = 31 ; i >= 0 ; i--){
            if(B > 0){
                if( ((and >> i)&1) == 1){
                    and = and - (int)Math.pow(2,i);
                    B--;
                }
            }
            else{
                break;
            }
        }
        return and;
    }


}
