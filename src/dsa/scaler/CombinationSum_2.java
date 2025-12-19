package scaler_questions.Scaler;

import java.util.*;

public class CombinationSum_2 {
    static HashSet<ArrayList<Integer>> ans = new HashSet<>() ;
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        //8, 10, 6, 11, 1, 16, 8
        A.add(8);
        A.add(10);
        A.add(6);
        A.add(11);
        A.add(1);
        A.add(16);
        A.add(8);
        int B = 28;

        Collections.sort(A) ;
        for(int pos = 0 ; pos < A.size() ; pos++){
           ArrayList<Integer> l = new ArrayList<Integer>() ;
            int sum = B-A.get(pos) ;
            while(sum > 0){
                l.add(A.get(pos)) ;
                solveCombinationSum(A,sum,0,0,l);
                sum = sum - A.get(pos) ;
            }
        }

        ArrayList<ArrayList<Integer>> res = new ArrayList<>(ans) ;
        Collections.sort(res, (ArrayList < Integer > first, ArrayList < Integer > second) -> {
            for (int i = 0; i < first.size() && i < second.size(); i++) {
                if (first.get(i) < second.get(i))
                    return -1;
                if (first.get(i) > second.get(i))
                    return 1;
            }
            if (first.size() > second.size())
                return 1;
            return -1;
        });
        for(int i = 0 ;i < res.size() ; i++){
            System.out.println(res.get(i)) ;
        }
    }

    static void solveCombinationSum(ArrayList<Integer> A, int B , int sum , int pos, ArrayList<Integer> l){

        if(pos == A.size()){
            if(B == sum){
                ArrayList<Integer> newList = new ArrayList<>(l) ;
                Collections.sort(newList) ;
                ans.add(newList) ;
            }
            return ;
        }
        //pick
        sum = sum + A.get(pos) ;
        l.add(A.get(pos)) ;
        solveCombinationSum(A,B,sum,pos+1,l);

        //don't pick
        sum = sum - A.get(pos) ;
        l.remove(l.size()-1) ;
        solveCombinationSum(A,B,sum,pos+1,l);
    }
}
