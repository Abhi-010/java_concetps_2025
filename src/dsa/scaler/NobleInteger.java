package scaler_questions.Scaler;

import java.util.Arrays;

public class NobleInteger {
    public static void main(String[] args){
        //int[] A = { 1, 2, 7, 0, 9, 3, 6, 0, 6} ;
        int[] A = {2,5,7,1,100,102} ;
        //1,2,3,5,6
        System.out.println(IsNobleInteger(A));
    }
    static int IsNobleInteger(int[] A) {
        Arrays.sort(A);
        int N = A.length;
        for (int i = 0; i < N - 1 ; i++) {
            if ((A[i] < A[i + 1]) && A[i] == (N - i - 1)) {
                return 1;
            }
        }
        return -1;
    }

}

