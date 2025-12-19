package scaler_questions.Scaler.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class NPerfectNumber {
    public static void main(String[] args){
            for(int i = 1 ; i <= 14 ; i++){
                System.out.println(solve(i));
            }
    }

    public static  String solve(int A) {
        Queue<String> q = new LinkedList<>();
        if(A == 1) return "11" ;
        if(A == 2) return "22" ;
        q.add("11") ;
        q.add("22")  ;
        int count = 2 ;
        String ans = new String();
        while(count < A){
            StringBuilder s1 = new StringBuilder() ;
            StringBuilder s2 = new StringBuilder() ;

            s1.append(q.peek());
            s2.append(q.peek());
            q.remove() ;
            int index = s1.length()/2 ;
            //first insert
            s1.insert(index,"11") ;
            if((count + 1) == A){
                ans = s1.toString() ;
                break ;
            }
            //second insert
            s2.insert(index,"22") ;
            if((count + 2) == A){
                ans = s2.toString() ;
                break ;
            }
            q.add(s1.toString()) ;
            q.add(s2.toString()) ;
            count = count + 2 ;
        }
        return ans ;
    }
}
