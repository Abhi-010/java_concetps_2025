package dsa.codechef.codechef;
import java.util.Scanner;
public class NoTimeToWait {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int H = sc.nextInt();
        int x = sc.nextInt();
        int flag = 0 ;
        int[] timeZones = new int[N] ;
        for(int i = 0 ; i < N ; i++)
        {
            timeZones[i] = sc.nextInt();
        }
        for(int i = 0 ; i < N ; i++){
            if(timeZones[i] + x >= H) {
                flag = 1;
                break;
            }
        }
        if(flag == 1){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
