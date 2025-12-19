package scaler_questions.Scaler;

import java.util.ArrayList;
import java.util.Collections;

public class CombinationSum_3 {

    static ArrayList<ArrayList<Integer>> ans = new ArrayList<>() ;

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        //8, 10, 6, 11, 1, 16, 8
        A.add(2);
        A.add(3);
        A.add(6);
        A.add(7);
        int B = 7;
        Collections.sort(A);

        ArrayList<Integer> l = new ArrayList<>() ;
        int sum = 0 ;
        int pos = 0 ;
        solveCombinationSum(A,B,sum,pos,l);

        for(int i = 0 ; i < ans.size() ; i++){
            System.out.println(ans.get(i)) ;
        }
    }

    static void solveCombinationSum(ArrayList<Integer> A, int B , int sum, int pos, ArrayList<Integer> l){
        //base condition
        if(B < sum || pos == A.size()){
            return ;
        }
        if(B == sum){
            ans.add(new ArrayList<Integer>(l)) ;
        }

        //Add with no inc in pos
        sum = sum + A.get(pos) ;
        l.add(A.get(pos)) ;
        solveCombinationSum(A,B,sum,pos,l);
        sum = sum - A.get(pos);
        l.remove(l.size()-1) ;

        //pick
        //sum = sum + A.get(pos+1) ;
        //l.add(A.get(pos+1)) ;
        //solveCombinationSum(A,B,sum,pos+1,l);
        //sum = sum - A.get(pos+1) ;
        //l.remove(l.size()-1) ;

        //don't pick
        solveCombinationSum(A,B,sum,pos+1,l);
    }

}
