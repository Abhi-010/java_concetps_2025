package scaler_questions.Scaler;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PathInDirectedPath {
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
        System.out.println(solve(A, B));
    }
    public static int solve(int A, int[][] B) {

        ArrayList<Integer>[] g = new ArrayList[A+1] ;

        // initializing
        for (int i = 0; i < g.length; i++) {
            g[i] = new ArrayList<Integer>();
        }


        for(int i = 0 ; i < B.length ; i++){
            g[B[i][0]].add(B[i][1]) ;
        }

        boolean [] isVisited = new boolean [A+1] ;

        Queue<Integer> q = new LinkedList<>() ;
        q.add(1) ;
        isVisited[1] = true ;

        while(q.size() > 0){
            int u = q.peek() ;
            q.remove() ;

            for(int i = 0 ; i < g[u].size() ; i++){
                int v = g[u].get(i) ;
                if(isVisited[v] == false){
                    q.add(v) ;
                    isVisited[v] = true ;
                }
            }
        }

        if(isVisited[A] == true ){
            return 1 ;
        }
        return 0 ;
    }
}
