package scaler_questions.Scaler;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

class Pair1 implements  Comparable<Pair1>{
    int a ;
    int b ;
    Pair1(int a,int b){
        this.a = a ;
        this.b = b ;
    }
    public int compareTo(Pair1 c)
    {
        if (a > c.a) {
            return 1;
        }
        else if (a < c.a) {
            return -1;
        }
        else {
            return 0;
        }
    }
}

public class CountRectangles {
    public static void main(String[] args){
        int [] x = {1, 1, 2, 2};
        int [] y = {1, 2, 1, 2 } ;

        ArrayList<Integer> A = new ArrayList<Integer>() ;
        ArrayList<Integer> B = new ArrayList<Integer>() ;

        A.add(1) ;
        A.add(1) ;
        A.add(2) ;
        A.add(2) ;

        B.add(1) ;
        B.add(2) ;
        B.add(1) ;
        B.add(2) ;


        System.out.println(solve(A,B)) ;
    }

    public static int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        //create a HashSet of pairs
        TreeSet<Pair1> hs = new TreeSet<>();
        int N = A.size() ;
        int count = 0 ;
        for(int i = 0 ; i < N ; i++){
            int x = A.get(i) ;
            int y = B.get(i) ;
            Pair1 p = new Pair1(x,y) ;
            hs.add(p) ;
        }

        for(int i = 0 ; i < N ; i++){
            for(int j = i+1 ; j < N ; j++){
                //fixing 2 points
                int x1 = A.get(i) ;
                int y1 = B.get(i) ;

                int x2 = A.get(j) ;
                int y2 = B.get(j) ;

                if (x1 == x2 || y1 == y2){
                    continue ;
                }
                //check : (x1,y2) && (x2,y1)
                Pair1 p1 = new Pair1(x1,y2) ;
                Pair1 p2 = new Pair1(x2,y1) ;

                if(hs.contains(p1) && hs.contains(p2)){
                    System.out.println("hello");
                    count++ ;
                }
            }
        }
        return count/2 ;
    }
}
