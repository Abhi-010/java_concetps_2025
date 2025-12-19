package dsa.codechef.codechef.practice;

import java.util.Scanner;

public class INTEST {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long n = input.nextLong();
        long k = input.nextLong();
        long count = 0 ;

        for(int i = 1 ; i <= n ; i++){
            if(input.nextLong() % k == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
