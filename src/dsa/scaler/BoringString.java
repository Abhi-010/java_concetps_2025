package scaler_questions.Scaler;

import java.util.Arrays;

public class BoringString {
    public static void main(String[] args){
        String A = "ajafafgja";
        System.out.println(solve(A)) ;
    }
    public static  int solve(String A) {
        int N = A.length();
        int[] odd = new int[N];
        int count = 0 ;
        for(int i = 0 ; i < N ; i++){
            if(A.charAt(i) % 2 != 0){
                odd[i] = A.charAt(i);
                count++ ;
            }
        }
        int[] even = new int[N];
        for(int i = 0 ; i < N ; i++){
            if(A.charAt(i) % 2 == 0){
                even[i] = A.charAt(i);
            }
        }

        Arrays.sort(odd);
        Arrays.sort(even);

        for(int i = 0 ; i < N ; i++){
            System.out.println( odd[i] + " " + even[i]);
        }

       int oddVal = odd[N-1];
       for(int i = 0 ; i < N ; i++){
           if(Math.abs(oddVal - even[i]) > 1){
               return 1 ;
           }
       }
       return 0 ;
    }
}
