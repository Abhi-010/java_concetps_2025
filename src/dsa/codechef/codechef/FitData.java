package dsa.codechef.codechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FitData {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            String s = br.readLine();
            String[] strArr = s.split(" ");
            int N = Integer.parseInt(strArr[0]);
            int X = Integer.parseInt(strArr[1]);

            System.out.println(X%(N+1));

        }
    }
}
