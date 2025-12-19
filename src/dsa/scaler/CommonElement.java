package scaler_questions.Scaler;

import java.util.HashMap;

public class CommonElement {
    public static void main(String[] args){

        int [] A = {1, 2, 2, 1} ;
        int [] B = {2, 3, 1, 2} ;

        int [] res = solve(A, B);

        for(int i = 0 ; i< res.length ; i++){
            System.out.print(res[i] + " ") ;
        }
    }
    static int[] solve(int[] A, int[] B) {

        HashMap<Integer, Integer> hs1 = new HashMap<>();

        for (int i = 0; i < A.length; i++) {

            if (hs1.containsKey(A[i])) {

                hs1.put(A[i], (hs1.get(A[i]) + 1));
            } else {
                hs1.put(A[i], 1);
            }
        }

        for(int i = 0 ; i < B.length ; i++){

            if(hs1.containsKey(B[i]) && (hs1.get(B[i]) > 0) ){

                hs1.put(B[i], (hs1.get(B[i]) - 1)) ;
            }
            else {
                B[i] = -1 ;
            }
        }
        int len = 0 ;
        for(int i = 0 ; i < B.length ;i++){
            if(B[i] != -1){
                len++ ;
            }
        }

        int[] res = new int[len] ;

        for(int i = 0,j=0 ; i < B.length ; i++){

            if(B[i] != -1){
                res[j] = B[i] ;
                j++ ;
            }
        }
        return res ;
    }
}
