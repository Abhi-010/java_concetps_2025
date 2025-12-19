package scaler_questions.Scaler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ColourNumber {
    public static void main(String[] args){
        int N = 230 ;
        System.out.println(solve(N))  ;
    }

    static int solve(int A){
        ArrayList<Integer> list = new ArrayList<>() ;
        while(A!=0){
            list.add(A%10) ;
            A = A/10 ;
        }
        Collections.reverse(list);

        HashSet<Integer> hs = new HashSet<>() ;
        for(int i = 0 ; i < list.size() ; i++){
            int product = 1;
            for(int j = i ; j < list.size() ; j++){
                product = product * list.get(j) ;
                System.out.println(list.get(j)) ;
                if(hs.contains(product)){
                    return 0 ;
                }
                else{
                    hs.add(product) ;
                }
            }
        }
        return 1 ;
    }
}
