package scaler_questions.Scaler.Queue;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class slidingMaximum {
    public static void main(String[] args){
        //int [] A = {5,4,3,10,1,23,5,-4,19} ;
        int [] A = {268, 202, 139, 744, 502, 582, 94, 81, 117, 258, 506, 461, 531, 768, 827, 128, 592, 571, 559, 374, 910, 610, 561, 489, 647, 246, 355, 313, 158, 922, 557, 36, 430, 983, 913, 303, 765, 945, 167, 340, 869, 869, 609, 809, 529, 715, 34, 13, 657, 407, 684, 801, 129, 952, 159, 250, 546, 508, 540, 948, 429, 174 };
        int k = 6 ;

        int[] ans = solve(A,k) ;

        System.out.println("Length of A : " + A.length);
        System.out.println("Length of ans : " + ans.length);
        for(int i = 0 ; i < ans.length ; i++){
            System.out.println(ans[i] + " ");
        }


    }
    public static int[] solve (int[] A, int k){
        int N = A.length ;
        int[] ans = new int[N-k+1] ;

        Deque<Integer> cl = new LinkedList<Integer>();

        cl.add(A[0]) ;
        //insert first k elements in CL
        for(int i = 1 ; i < k ;i++){
            while(!cl.isEmpty() && cl.getLast() < A[i] ){
                cl.removeLast() ;
            }
            cl.addLast(A[i]);
        }
        ans[0] = cl.getFirst() ;
        if(A[0] == cl.getFirst()){
            cl.removeFirst();
        }
        int indexAns = 1 ;
        int L = 1 ;
        int R = k ;

        while(R < N){
            while(!cl.isEmpty() && cl.getLast() < A[R] ){
                cl.removeLast() ;
            }
            cl.addLast(A[R]);

            //
            /*
            if(indexAns >=35 && indexAns <=42 ){
                for (Iterator itr = cl.iterator();
                     itr.hasNext();) {
                    System.out.print(itr.next() + " ");
                }
                System.out.println();
            }

             */
            ans[indexAns] = cl.getFirst() ;
            indexAns++ ;
            if(A[L] == cl.getFirst()){
                cl.removeFirst() ;
            }
            L++ ;
            R++ ;
        }
        return ans ;
    }
}
