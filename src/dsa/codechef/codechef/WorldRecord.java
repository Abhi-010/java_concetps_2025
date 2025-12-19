package dsa.codechef.codechef;

import java.util.Scanner;

public class WorldRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int T = sc.nextInt() ;

        while(T-- != 0){
            int A = sc.nextInt() ;
            int B = sc.nextInt() ;

            if(A > 0 && B > 0){
                System.out.println("solution");
            }
            else if(B == 0){
                System.out.println("solid");
            }
            else if(A == 0 ){
                System.out.println("liquid");
            }
        }

    }
}
 /*

        Scanner scan = new Scanner(System.in);
        float k1 = scan.nextFloat();
        float k2 = scan.nextFloat();
        float k3 = scan.nextFloat();
        float v = scan.nextFloat();

        float result = 100 / (k1 * k2 * k3 * v);
        String s = String.valueOf(result);
        String[] s1 = s.split(".");
        int beforeDecimal = Integer.parseInt(s1[0]);
        //int afterDecimal = Integer.parseInt(s1[2]);

        if (beforeDecimal < 9) {
            System.out.println("yes");
        } else if (beforeDecimal > 9) {
            System.out.println("no");
        } else {
            int firstDigit = Integer.parseInt("s1[1].charAt(0)");
            int secondDigit = Integer.parseInt("s1[1].charAt(1)");
            int thirdDigit = Integer.parseInt("s1[1].charAt(2)");
            if (thirdDigit >= 5) {
                secondDigit = secondDigit + 1;

            }
        }

        System.out.println(result);
    }
}*/
