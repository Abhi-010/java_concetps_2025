package dsa.codechef.codechef;

import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class Meet {
    public static int convert(String s){
        String time = "";
        for(int i = 0 ; i < s.length() - 3 ; i++){
            if(s.charAt(i) != ':')
                time+=s.charAt(i);
        }
        int k = Integer.parseInt(time);
        return k;
    }
    public static int timeConversion(int n, String s) {
        int k = n;
        if (s.contains("AM") & k >= 1200)
            k = k - 1200;
        else if (s.contains("PM")){
            if (k >= 1200)
                k = k + 0;
            else
                k += 1200;
        }
        return k;

    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();

        while (testCases-- != 0) {
            String P = sc.nextLine();
            int n = sc.nextInt();
            sc.nextLine();
            int ini = convert(P);
            ini = timeConversion(ini, P);
            String ans = "";

            for(int j = 0 ; j < n ; j++){
                String time = sc.nextLine();
                String Li = time.substring(0,time.indexOf('M',0) + 1);
                String Ri = time.substring((time.indexOf('M',0) + 2),time.length());

                int start = convert(Li);
                int end = convert(Ri);
                start = timeConversion(start, Li);
                end = timeConversion(end, Ri);

                if(ini >= start && ini <= end)
                    ans+=1;
                else
                    ans+=0;
            }
            System.out.println(ans);
        }
    }
}