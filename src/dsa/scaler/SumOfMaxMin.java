package scaler_questions.Scaler;

import java.util.Deque;
import java.util.LinkedList;

public class SumOfMaxMin {
    static int mod = 1000000007 ;
    public static void main(String[] args) {
        int[] A = {2, 5, -1, 7, -3, -1, -2};
        int B = 4;
        int max = getMax(A,B);
        int min = getMin(A, B);
        System.out.println("max " + max);
        System.out.println("min " + min);
    }
    public static int getMax(int[] A, int B) {
        Deque<Integer> deque = new LinkedList<Integer>();
        int N = A.length;
        int max = 0;
        int count = 0;
        int removeIndex = 0;
        for (int i = 0; i < N; i++) {
            if (deque.size() == 0) {
                deque.add(i);
            } else {
                int element = A[i];
                int index = deque.getLast();
                int topElement = A[index];
                if (topElement < element) {
                    while ((deque.size() > 0) && (A[deque.getLast()] < element)) {
                        deque.removeLast();
                    }
                }
                deque.addLast(i);
            }
            count++;
            if(count >= B){
                max = (max%mod + A[deque.getFirst()]%mod)%mod;
                if(removeIndex == deque.getFirst()){
                    deque.removeFirst();
                }
                removeIndex++;
            }
        }
        return max%mod;
    }

    public static int getMin(int[] A, int B){
        Deque<Integer> deque = new LinkedList<Integer>();
        int N = A.length;
        int min = 0;
        int count = 0;
        int removeIndex = 0;

        for (int i = 0; i < N; i++) {
            if (deque.size() == 0) {
                deque.add(i);
            } else {
                int element = A[i];
                int index = deque.getLast();
                int topElement = A[index];
                if (topElement > element) {
                    while ((deque.size() > 0) && (A[deque.getLast()] > element)) {
                        deque.removeLast();
                    }
                }
                deque.addLast(i);
            }
            count++;
            if(count >= B){
                min = (min%mod + A[deque.getFirst()]%mod)%mod;
                if(removeIndex == deque.getFirst()){
                    deque.removeFirst();
                }
                removeIndex++;
            }
        }
        return min%mod;
    }
}
