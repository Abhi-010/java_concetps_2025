package scaler_questions.Scaler;

import java.util.Arrays;

public class ValidPaths {
    static int[] x = {0,1,1,1,0,-1,-1,-1} ;
    static int[] y = {1,1,0,-1,-1,-1,0,1} ;

    public static void main(String[] args){
        int A = 58 ;
        int B = 91  ;
        int C = 6 ;
        int D = 8 ;
        int [] E = {40, 6, 36, 38, 23, 54 } ;
        int [] F = {88, 14, 50, 10, 15, 5} ;
        System.out.println(solve(A,B,C,D,E,F) );
    }

    public static String solve(int X, int Y, int C, int R, int[] E, int[] F) {
        int s1 = 0 ;
        int s2 = 0 ;
        int d1 = X ;
        int d2 = Y ;
        int visited[][] = new int[X+1][Y+1] ;
        for(int i = 0 ; i <= X ; i++){
            Arrays.fill(visited[i],1) ;
        }


        IsCircleTouch(R,E,F,visited) ;

        System.out.println("after visit") ;
        for(int i = 0 ; i < visited.length ; i++){
            for(int j = 0 ; j < visited[i].length ; j++){
                System.out.print(visited[i][j] + " ");
            }
            System.out.println() ;
        }

        if(visited[X][Y] == 0){
            return "NO" ;
        }
        int N = visited.length ;
        int M = visited[0].length  ;

        boolean ans = dfs(visited,0,0,N,M) ;

        System.out.println("after dfs") ;
        for(int i = 0 ; i < visited.length ; i++){
            for(int j = 0 ; j < visited[i].length ; j++){
                System.out.print(visited[i][j] + " ");
            }
            System.out.println() ;
        }
        System.out.println("ans " + ans)  ;
        if(ans == true){
            return "YES" ;
        }
        return "NO" ;
    }

    static boolean dfs(int[][] visited, int r , int c, int N , int M){
        //N : Rows
        //M : Columns

        if(r == N-1 && c == M-1){
            return true ;
        }
        if(r < 0 || c < 0 ||  r >= N || c >= M || visited[r][c] == 0){
            return false ;
        }
        visited[r][c] = 0 ;

        for(int i = 0 ; i < 8 ; i++){

            if(dfs(visited, r + x[i],c+y[i],  N ,  M) != true){
                continue;
            }
            else{
                return true ;
            }
            //return dfs(visited, r + x[i],c+y[i],  N ,  M) ;
            //if my dfs returns false , i will continue to check
        }
        return  false ;
    }

    static void IsCircleTouch(int R, int[] E, int[] F, int[][] visited){
        int N = visited.length ;
        int M = visited[0].length ;
        for(int i = 0 ; i < N  ; i++){
            for(int j = 0 ; j < M ; j++){
                //if (i,j) lie inside any of the given circle then we can say that we can't travel on (i,J)
                if( isPointLieInsideCircle(i,j,R,E,F)){
                    visited[i][j] = 0 ;
                }
            }
        }
    }

    static boolean isPointLieInsideCircle(int i , int j, int R, int[]E, int[] F){
        for(int c = 0 ; c < E.length ; c++){
            int c1 = E[c] ;
            int c2 = F[c] ;
            double val = (c1-i) * (c1-i) + (c2-j) * (c2-j) ;
            int distance = (int)Math.sqrt(val) ;
            if(distance <= R){
                return true ;
            }
        }
        return false ;
    }
}
