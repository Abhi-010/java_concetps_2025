package dsa.scaler_questions;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class question1 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        int[] ans = nextGreater(new int[] {34,35,27,42,5,28,39,20,28});
        for(int i = 0 ; i < ans.length ; i++){
            System.out.print(ans[i] + " ");
        }
    }

    public static int[] nextGreater(int[] A) {

        int n = A.length ;
        Stack<Integer> q = new Stack<>();
        int[] g = new int[n] ;
        for(int i = n-1 ; i >=0 ; i--){
            int e = A[i];
            if(q.isEmpty()){
                g[i] = -1 ;
            }
            else{
                if(q.peek() > e){
                    g[i] = q.peek();
                }
                else{
                    while(!q.isEmpty() && q.peek() < e){
                        q.pop();
                    }
                    if(q.isEmpty()){
                        g[i] = -1;
                    }
                    else{
                        g[i] = q.peek();
                    }
                }
            }
            q.add(e);
        }
        return g ;
    }
}
