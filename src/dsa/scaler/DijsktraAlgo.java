package scaler_questions.Scaler;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DijsktraAlgo {
    public static void main(String[] args){
        int A  = 6 ;
        int C = 4 ;
        int[][] B = {
                {0, 4, 9},
                {3, 4, 6},
                {1, 2, 1},
                {2, 5, 1},
                {2, 4, 5},
                {0, 3, 7},
                {0, 1, 1},
                {4, 5, 7},
                {0, 5, 1}
        };
        int[] ans = solve(A,B,C) ;

        for(int i = 0 ; i < ans.length ; i++){
            System.out.print(ans[i] + " ");
        }
    }

    public static int[] solve(int A, int[][] B, int C) {
        //adj List
        ArrayList<ArrayList<Integer>> [] g = new ArrayList[A] ;
        for(int i = 0 ; i < A ; i++){
            g[i] = new ArrayList< ArrayList<Integer> >() ;
        }

        for(int i = 0 ; i < B.length ; i++){

            int u = B[i][0] ;
            int v = B[i][1] ;
            int w = B[i][2] ;

            ArrayList<Integer> l = new ArrayList<>() ;
            l.add(v) ;
            l.add(w) ;

            g[u].add(l) ;

            ArrayList<Integer> l1 = new ArrayList<>() ;
            l1.add(u) ;
            l1.add(w) ;

            g[v].add(l1) ;


        }

        //distance arrray
        int[] dist = new int[A] ;

        dist[C] = 0 ;
        for(int i = 0 ; i < A ; i++){
            if(i != C){
                dist[i] = Integer.MAX_VALUE ;
            }
        }
        //Min heap
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>(new PairComparator());
        pq.add(new Pair(0,C)) ;
        while(pq.size() > 0){
            Pair p = pq.peek() ;
            pq.remove() ;
            //this distance from min heap
            int d = p.d ;
            //this node from min heap
            int n = p.n ;
            //dist[n] is from dist array
            if( d == dist[n]){
                for(int i = 0 ; i < g[n].size() ; i++){

                    //g[n] : give us the ArrayList of ArrayList<Integer>

                    ArrayList<Integer> l = g[n].get(i) ;
                    int v = l.get(0) ;
                    int w = l.get(1) ;

                    if(dist[n] + w < dist[v]){
                        //update dist array
                        dist[v] = dist[n] + w ;
                        //insert in heap
                        pq.add(new Pair(dist[v],v)) ;

                    }
                }
            }
        }


        for(int i = 0 ; i < dist.length ; i++){
            if(dist[i] == Integer.MAX_VALUE){
                dist[i] = -1 ;
            }
        }



        return dist ;
    }

}

class Pair{

    public int d ;
    public int n ;
    public Pair(int d, int n){
        this.d = d ;
        this.n = n ;
    }
}
class PairComparator implements Comparator<Pair> {
    public int compare(Pair p1, Pair p2) {
        if (p1.d < p2.d)
            return 1;
        else if (p1.d > p2.d)
            return -1;
        return 0;
    }

}
