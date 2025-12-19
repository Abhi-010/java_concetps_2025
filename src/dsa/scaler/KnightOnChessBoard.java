package scaler_questions.Scaler;

import java.util.LinkedList;
import java.util.Queue;

public class KnightOnChessBoard {
    static int[] x = {-2,-1,1,2,2,1,-1,-2} ;
    static int[] y = {1,2,2,1,-1,-2,-2,-1} ;
    public static void main(String[] args){
        int A = 8 ;
        int B = 8 ;
        int C = 1 ;
        int D = 1 ;
        int E = 8 ;
        int F = 8 ;

        System.out.println(knight(A,B,C,D,E,F)) ;
    }
    static int knight(int A, int B, int C, int D, int E, int F) {
        if(E > A || F > B){
            return -1 ;
        }
        int[][] mat = new int[A+1][B+1] ;

        for(int i = 1 ; i <= A ; i++){
            for(int j = 1 ; j <= B ; j++){
                mat[i][j] = Integer.MAX_VALUE ;
            }
        }
        mat[C][D] = 0 ;
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(C,D)) ;

        while(q.size() > 0){

            pair p = q.peek() ;
            q.remove() ;

            int m = p.u ;
            int n = p.v ;

            for(int i = 0 ; i < 8 ; i++){

                int C1 = m + x[i] ;
                int D1 = n + y[i] ;
                //jumping from (m,n) to (C1,D1)
                if(isValidCell(C1,D1, A+1, B+1) == true){
                    int dist = 1 + mat[m][n] ;
                    //dist will be value of mat[C1][D1]
                    if(dist < mat[C1][D1]){
                        q.add(new pair(C1,D1)) ;
                        mat[C1][D1] = dist ;
                    }
                }
            }
        }
        //print
        for(int i = 1 ; i < mat.length ; i++){
            for(int j = 1 ; j < mat[0].length ; j++){
                System.out.print(mat[i][j] + " ") ;
            }
            System.out.println();
        }

        if(mat[E][F] == Integer.MAX_VALUE){
            return -1 ;
        }


        return mat[E][F];
    }
    static boolean isValidCell(int C, int D, int N , int M){

        if(C < 1 || C >= N || D < 1 || D >= M){
            return false ;
        }
        return true ;
    }
}

class pair{
    int u ;
    int v ;
    pair(int a , int b){
        this.u = a ;
        this.v = b ;
    }
}
