package scaler_questions.Scaler;

import java.util.ArrayList;
import java.util.Collections;

public class PrintAllSubsets {

    static ArrayList<ArrayList<Integer>> ans = new ArrayList<>() ;
    public static void main(String[] args){
        ArrayList<Integer> A = new ArrayList<>() ;
        A.add(1) ;
        A.add(2) ;
        A.add(3) ;
        int N = A.size() ;
        int pos = 0 ;
        ArrayList<Integer> l = new ArrayList<Integer> () ;
        solve(A,N,pos,l);

        Collections.sort(ans, (ArrayList < Integer > first, ArrayList < Integer > second) -> {
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
        for(int i = 0 ; i < ans.size() ; i++){
            System.out.println(ans.get(i)) ;
        }
    }
     static void  solve(ArrayList<Integer> A, int N, int pos, ArrayList<Integer> l){
        if(pos == N){
            ans.add(new ArrayList<>(l)) ;
            return  ;
        }
        //pick
         l.add(A.get(pos)) ;
        solve(A, N, pos+1,l) ;

        //not pick
         l.remove(l.size()-1) ;
         solve(A,N,pos+1,l) ;
    }
}
