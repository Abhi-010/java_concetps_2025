package scaler_questions.Scaler;

import java.util.*;

public class multiSourceBFS {

    public static void main(String[] args){
        int[][] mat = {
                {0,0,0},{0,1,0},{1,1,1},{0,1,1},{1,1,1}
        };
        int[][] ans = updateMatrix(mat) ;

        for(int i = 0 ; i < ans.length ; i++){
            for(int j = 0 ; j < ans[i].length ; j++){
                System.out.print(ans[i][j] + " ") ;
            }
            System.out.println();
        }
    }

    static int[][] updateMatrix(int[][] mat){

        int N = mat.length ;
        int M = mat[0].length ;

        boolean [][] visited = new boolean[N][M] ;

        Queue<ArrayList<Integer>> q = new LinkedList<>();

        for(int i = 0 ; i < mat.length ; i++){
            for(int j = 0 ; j < mat[i].length ; j++){
                if(mat[i][j] == 0){
                    ArrayList<Integer> l = new ArrayList<>() ;
                    l.add(i) ;
                    l.add(j) ;
                    q.add(l) ;

                    visited[i][j] = true ;
                }
            }
        }
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < M ; j++){
                System.out.print(visited[i][j] + " ");
            }
            System.out.println();
        }
        while(q.size() > 0){

            ArrayList<Integer> l = q.peek() ;
            q.remove() ;

            int i = l.get(0) ;
            int j = l.get(1) ;

            //(i,j)
            //down : i+1 ,j
            //up : i-1 , j
            //right : i, j+1
            //left : i , j-1
            // if possible : and put this in possible index  = mat[i][j] + possible index

            //down
            if( (i+1) < N && visited[i+1][j] == false ){

                mat[i+1][j] = mat[i][j] + 1 ;
                visited[i+1][j] = true ;

                ArrayList<Integer> l1 = new ArrayList<>() ;
                l1.add(i+1) ;
                l1.add(j) ;

                q.add(l1) ;
            }
            //up
            if( (i-1) >= 0 && visited[i-1][j] == false ){

                mat[i-1][j] = 1 + mat[i][j] ;
                visited[i-1][j] = true ;

                ArrayList<Integer> l2 = new ArrayList<>() ;
                l2.add(i-1) ;
                l2.add(j) ;

                q.add(l2) ;
            }

            //right
            if( (j+1) < M && visited[i][j+1] == false){

                mat[i][j+1] = 1 + mat[i][j] ;
                visited[i][j+1] = true ;

                ArrayList<Integer> l3 = new ArrayList<>() ;
                l3.add(i) ;
                l3.add(j+1) ;
                q.add(l3) ;
            }
            //left
            if( (j-1) >= 0 && visited[i][j-1] == false ){

                mat[i][j-1] = 1 + mat[i][j] ;
                visited[i][j-1] = true ;

                ArrayList<Integer> l3 = new ArrayList<>() ;
                l3.add(i) ;
                l3.add(j-1) ;
                q.add(l3) ;
            }
        }


        return mat ;
    }
}
