package scaler_questions.Scaler;

import java.util.ArrayList;
import java.util.Collections;

public class Subset {
    public static void main(String[] args){
        //input
        ArrayList<Integer> A = new ArrayList<>() ;
        A.add(13) ;
        A.add(12) ;

        //ans
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>() ;
        //ans.add(new ArrayList<Integer>()) ;

        Collections.sort(A);

        ArrayList<Integer> temp = new ArrayList<>() ;
        int pos = 0 ;
        int N = A.size() ;

        while(pos < N){
            solve(pos,ans,A,N,temp) ;
            pos++ ;
        }
        for(int i = 0 ; i < ans.size() ; i++){
            System.out.println(ans.get(i)) ;
        }
    }
    static void solve(int pos, ArrayList<ArrayList<Integer>> ans , ArrayList<Integer> A, int N,ArrayList<Integer> temp){
        if(pos == N){
            return ;
        }
        int element = A.get(pos) ;
        temp.add(element) ;

        ans.add(temp) ;
        System.out.println(ans.get(0)) ;

        solve(pos+1, ans, A, N,temp) ;
        temp.remove(temp.size()-1) ;

        return  ;
    }

}
