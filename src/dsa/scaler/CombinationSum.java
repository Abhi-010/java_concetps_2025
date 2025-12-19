package scaler_questions.Scaler;

import java.util.*;

public class CombinationSum {

    static ArrayList<ArrayList<Integer>> ans = new ArrayList<>() ;

    public static void main(String[] args){
        ArrayList<Integer> A = new ArrayList<>() ;
        A.add(8);
        A.add(10);
        A.add(6);
        A.add(11);
        A.add(1);
        A.add(16);
        A.add(8);
        int B = 28 ;
        //***********************
        int sum = 0 ;
        int pos = 0 ;
        ArrayList<Integer> l = new ArrayList<>() ;
        solveCombinationSum(A,B,sum,pos,l);

        Collections.sort(ans, (ArrayList < Integer > first, ArrayList < Integer > second) -> {
            for (int i = 0; i < first.size() && i < second.size(); i++) {
                if (first.get(i) < second.get(i))
                    return 1;
                if (first.get(i) > second.get(i))
                    return -1;
            }
            if (first.size() > second.size())
                return 1;
            return -1;
        });
        for(int i = 0 ;i < ans.size() ; i++){
            System.out.println(ans.get(i)) ;
        }
        /*
        //new ans array
        ArrayList<ArrayList<Integer>> res = new ArrayList<>() ;
        for(int i = 0 ; i < ans.size() ; i++){
            ArrayList<Integer> temp = ans.get(i) ;
            int s = 0 ;
            for(int j = 0 ; j < temp.size() ; j++){
                s = s + temp.get(j) ;
            }
            //B-s -- look for this in temp

            if((B-s) == 0){
                res.add(temp) ;
            }
            else {
                for(int j = 0 ; j < temp.size() ; j++){
                    ArrayList<Integer> newList = new ArrayList<Integer>() ;
                    if((B-s) % temp.get(j) == 0){
                        int loopCount = (B-s) / temp.get(i) ;
                        while(loopCount > 0){
                            newList.add(temp.get(i)) ;
                            loopCount-- ;
                        }

                        for(int k = 0 ; k < temp.size() ; k++){
                            newList.add(temp.get(k)) ;
                        }
                        res.add(newList) ;
                    }
                }
            }

        }
        /*
        for(int i = 0 ;i < res.size() ; i++){
            System.out.println(res.get(i)) ;
        }

         */

    }
    static void solveCombinationSum(ArrayList<Integer> A, int B , int sum , int pos, ArrayList<Integer> l){

        if(pos == A.size()){
            if(sum <= B && (l.size() > 0)){
                ans.add(new ArrayList<>(l)) ;
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
