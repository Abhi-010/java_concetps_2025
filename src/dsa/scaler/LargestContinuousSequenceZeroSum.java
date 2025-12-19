package scaler_questions.Scaler;

import java.util.HashMap;
import java.util.Map;

public class LargestContinuousSequenceZeroSum {
    public static void main(String[] args){
        //int [] A = {1,2,-2,4,-4}  ;
        int [] A = {1, 2, -3, 3}  ;
        int[] res = solve(A)  ;

       // System.out.println(res.length)  ;
        for(int i = 0 ; i < res.length ; i++){
            System.out.print(res[i] + " ");
        }
    }

    static int[] solve(int[] A){

        int[] ps = new int[A.length];
        ps[0] = A[0] ;

        for(int i = 1 ; i < A.length ;i++){

            ps[i] = ps[i-1] + A[i] ;
        }



        HashMap<Integer,Integer> hs1 = new HashMap<>() ;
        HashMap<Integer,Integer> hs2 = new HashMap<>() ;

        hs1.put(0,-1) ;

        for(int i = 0 ; i < ps.length ;i++){

            if( hs1.containsKey(ps[i])){
                hs2.put(ps[i], i) ;
            }
            else {
                hs1.put(ps[i], i) ;

            }
        }


        int len = Integer.MIN_VALUE ;
        int startIndex = 0 ;
        int endIndex = 0 ;



        for(int i = 0 ; i < ps.length ; i++){

            if(hs1.containsKey(ps[i]) && hs2.containsKey(ps[i])){

                if( ( hs2.get(ps[i]) - hs1.get(ps[i]) ) > len ){

                    len = hs2.get(ps[i]) - hs1.get(ps[i]) ;
                    startIndex = hs1.get(ps[i]) ;
                    endIndex = hs2.get(ps[i]) ;
                }

            }
        }
        //System.out.println(startIndex + " * " + endIndex)  ;
        int [] res = new int[endIndex - startIndex] ;

        for(int i = startIndex+1, j = 0 ; i <= endIndex ; i++,j++){
            res[j] = A[i] ;

        }

        return res ;
    }

}
