package dsa.codechef.codechef;

import java.util.Scanner;

public class BOLT {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- != 0){
            double k1 = sc.nextDouble();
            double k2 = sc.nextDouble();
            double k3 = sc.nextDouble();
            double v = sc.nextDouble();

            double res1 = 100/(k1*k2*k3*v);
            System.out.println(res1);

            double res = Math.round(res1 * 100.0) / 100.0 ;
            System.out.println(Math.round(res1*100.0));
            System.out.println(res + " " + res1*100.0);
            if(res < 9.58){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
    }
}
