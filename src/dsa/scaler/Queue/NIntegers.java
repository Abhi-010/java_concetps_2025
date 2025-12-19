package scaler_questions.Scaler.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class NIntegers {
    public static void main(String[] args){
        int A = 29500;
        int[] ans = solve(A) ;

        for(int i = 0; i < A ; i++){
            System.out.print(ans[i] + " ");
        }
    }

    public static int[] solve(int A){
        int[] ans = new int[A] ;
        if(A == 1){
            ans[0] = 1 ;
            return ans ;
        }
        else if(A == 2){
            ans[0] = 1 ;
            ans[1] = 2 ;
            return ans ;
        }
        else if(A == 3){
            ans[0] = 1 ;
            ans[1] = 2 ;
            ans[2] = 3 ;
            return ans ;
        }
        else {
            ans[0] = 1 ;
            ans[1] = 2 ;
            ans[2] = 3 ;
        }
        Queue<String> q = new LinkedList<>() ;
        q.add("1") ;
        q.add("2") ;
        q.add("3") ;
        int count = 3 ;
        while(count < A){
            String s1 = q.peek() + 1 ;
            q.add(s1);
            ans[count] = Integer.parseInt(s1) ;
            count = count + 1;
            if(count == A) break;

            String s2 = q.peek() + 2 ;
            q.add(s2);
            ans[count] = Integer.parseInt(s2) ;
            count = count + 1;
            if(count == A) break;

            String s3 = q.peek() + 3 ;
            q.add(s3);
            ans[count] = Integer.parseInt(s3) ;
            count = count + 1;
            if(count == A) break;

            q.remove();
        }
        return ans ;
    }
}
