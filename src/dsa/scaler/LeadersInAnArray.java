package scaler_questions.Scaler;

import java.util.ArrayList;
import java.util.List;

public class LeadersInAnArray {
    public static void main(String[] args){
        int[] A = {4,8,1,3,-9,-1} ;
        int [] B = findLeadersInArray_2(A);

        for(int i = 0 ; i < B.length ; i++){
            System.out.print(B[i] + " ");
        }
    }

    static int [] findLeadersInArray_2(int [] A){
        int maxElementFromRight = A[A.length - 1 ] ;
        List<Integer> list = new ArrayList<Integer>() ;
        list.add(maxElementFromRight) ;

        for(int i = A.length - 2 ; i >= 0 ; i--){
            if(A[i] > maxElementFromRight){
                list.add(A[i]) ;
                maxElementFromRight = A[i]  ;
            }
        }
        int[] B = new int[list.size()] ;
        for(int i = 0 ; i < list.size() ; i++){
            B[i] = list.get(i) ;
        }
        return B ;



    }
    static int[] findLeadersInArray(int [] A){
        int[] B = new int[A.length] ;
        int maxInd = 0;
        int maxEle = Integer.MIN_VALUE ;
        for(int i = 0 ; i < A.length ; i++){
            if(A[i] > maxEle){
                maxEle = A[i] ;
                maxInd = i  ;
            }
        }
        System.out.println(maxEle + " " + maxInd)  ;
        B[0] = maxEle ;
        int k = 1 ;
        for(int i = (maxInd + 1) ; i < A.length ; i++ ){
            int flag = 0 ;
            for(int j = i + 1 ; j < A.length ; j++){
                if(A[j] > A[i]){
                    flag = 1;
                    break ;
                }
            }
            if(flag != 1){
                B[k] = A[i] ;
                k++ ;
            }
        }
        return B ;
    }
}
