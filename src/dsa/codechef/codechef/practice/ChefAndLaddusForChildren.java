package dsa.codechef.codechef.practice;

import java.util.Scanner;

public class ChefAndLaddusForChildren {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- != 0){
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] arr = new int[N];
            for(int i = 0 ; i < N ; i++){
                arr[i] = sc.nextInt();
            }
            java.util.Arrays.sort(arr);
            /*
            for(int k = 0 ; k < arr.length ; k++){
                System.out.println(arr[k]);
            }*/
            int minDiff = Integer.MAX_VALUE ;

            if(K == 1) {
                System.out.println(0);
            }
            else {
                for(int j = 0 ; j <= N - K; j++){
                    int minOfSubset = arr[j + K - 1] - arr[j];
                    if(minOfSubset < minDiff){
                        minDiff = minOfSubset;
                    }
                }
                System.out.println(minDiff);
            }
        }
    }
}
