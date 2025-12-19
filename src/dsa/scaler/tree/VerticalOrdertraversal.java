package scaler_questions.Scaler.tree;

import java.util.ArrayList;
import java.util.HashMap;

public class VerticalOrdertraversal {

    public static void main(String[] args){

        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>() ;

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l1.add(1);
        l1.add(4) ;

        //l2.add(9) ;

        hm.put(0,l1) ;
        hm.put(1,l2) ;
        ArrayList<Integer> test = hm.get(1) ;
        System.out.println("size of test : " + test.size());
        int[][] ans = new int[hm.size()][] ;
        int k = 0 ;
        for(int i = 0; i <= 1 ; i++){
            ArrayList<Integer> list = hm.get(i) ;
            int s = hm.get(i).size() ;
            int[] a = new int[s] ;

            for(int j = 0 ; j < a.length ;j++){
                a[j] = hm.get(i).get(j) ;
            }
            ans[k] = a ;
            k++ ;
        }
        for(int i = 0 ; i < ans.length ;i++){
            for(int j = 0 ; j < ans[i].length ; j++){
                System.out.print( ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
