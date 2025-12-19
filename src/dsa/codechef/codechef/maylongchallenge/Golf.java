package dsa.codechef.codechef.maylongchallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Golf {
    static public void main(String[] args) throws IOException {
        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));

        long testCases = Long.parseLong(br.readLine());

        while(testCases-- >0)
        {
            String st = br.readLine();
            String[] arr = st.split(" ");

            long N = Long.parseLong(arr[0]);
            long x = Long.parseLong(arr[1]);
            long k = Long.parseLong(arr[2]);

            if(x % k == 0)
            {
                System.out.println("yes");
            }
            else if(( (N-1) - x) % k == 0)
            {
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
    }
}
