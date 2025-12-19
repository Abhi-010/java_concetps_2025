package dsa.codechef.codechef;
import java.util.Scanner;
public class MaximiseFunction {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt() ;
        while(testCases-- != 0){
            int N = sc.nextInt() ;
            int [] listOfNumber = new int[N];
            for(int i = 0 ; i < N ; i++){
                listOfNumber[i] = sc.nextInt() ;
            }
            java.util.Arrays.sort(listOfNumber);
            System.out.println( 2 * (listOfNumber[N-1] - listOfNumber[0]));
            System.out.println(listOfNumber[0]);
        }
    }
}
