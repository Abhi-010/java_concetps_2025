package scaler_questions.Scaler;

import java.util.*;

public class CycleInUndirectedGraph {
    public static void main(String[] args){
        int A = 5 ;
        int [][] B = {
                {1, 2} ,
                {4, 1},
                {2, 4},
                {3, 4},
                {5, 2},
                {1, 3}
        } ;
        System.out.println(solve(A,B));
    }

    public static int solve(int A, int[][] B) {

        //Create and Initialize Adj List
        ArrayList<Integer>[] g = new ArrayList [A+1];
        for(int i = 0 ; i <= A ; i ++){
            g[i] = new ArrayList<Integer>() ;
        }
        //assigne value in Adj List
        for(int i = 0 ; i < B.length ; i++){
            g[B[i][0]].add(B[i][1]) ;
            g[B[i][1]].add(B[i][0]) ;
        }

        //create a IsVisited boolean Array
        boolean [] isVisited = new boolean[A+1] ;

        int c = 0 ;
        for(int i = 1 ; i <= A ; i++){
            if(isVisited[i] == false){
                dfs(g,isVisited,i) ;
                c++ ;
            }
        }
        System.out.println("components : " + c);
        if((A-c) == B.length){
            return 0 ;
        }
        else if((A-c) > B.length){
            return 0 ;
        }
        return 1 ;
    }

    static void dfs(ArrayList<Integer> [] g, boolean[] isVisited , int i){
        if(isVisited[i] == true){
            return ;
        }
        isVisited[i] = true ;
        for(int j = 0 ; j < g[i].size() ; j++){
            int v = g[i].get(j) ;
            dfs(g,isVisited,v) ;
        }
    }
}
