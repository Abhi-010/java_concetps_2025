package scaler_questions.Scaler;

import java.util.ArrayList;
import java.util.Collections;

public class SumZero {
    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>() ;
        list.add(-31013930) ;
        list.add(-31013930) ;
        list.add(9784175) ;
        list.add(21229755) ;

        ArrayList<ArrayList<Integer>> l = func(list) ;

        for(int i = 0 ; i < l.size() ; i++) {
            ArrayList<Integer> a = l.get((i)) ;
            System.out.println(a.get(0) + " " + a.get(1) + " "  + a.get(2))  ;
        }
    }
    static ArrayList<ArrayList<Integer>> func(ArrayList<Integer> A){

        int N = A.size() ;
        Collections.sort(A);
        ArrayList<ArrayList<Integer>> ans = new ArrayList();

        int p1 = 0 ;
        while(p1 < N){

            int p2 = p1+1 ;
            int p3 = N-1 ;

            int k = A.get(p1);
            while( p1 < N && p2 < p3 && p2 < N && p3 < N){
                if(( k + A.get(p2) + A.get(p3)) == 0){
                    ArrayList<Integer> l = new ArrayList<Integer>() ;
                    l.add(k) ;
                    l.add( A.get(p2)) ;
                    l.add(A.get(p3)) ;
                    ans.add(l) ;

                    p2++ ;
                    while(p2<N && A.get(p2)==A.get(p2-1)) p2++;

                    p3-- ;
                    while(p3>=0 && A.get(p3)==A.get(p3+1)) p3--;
                }
                else if( ( A.get(p2) + A.get(p3)  + k) > 0){
                    p3-- ;
                }
                else{
                    p2++ ;
                }
            }
            p1++ ;
            System.out.println("A.get(p1) " + A.get(p1)) ;
            System.out.println("A.get(p1-1) " + A.get(p1-1)) ;

            while( p1 < A.size() )
            {
                if(A.get(p1) == A.get(p1-1)){
                    System.out.println("you are here..") ;
                    p1++;
                }
            }

        }
        return ans ;
    }
    }

