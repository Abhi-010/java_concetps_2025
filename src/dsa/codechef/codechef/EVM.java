package dsa.codechef.codechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EVM {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());
        while (testCases-- != 0) {

            String st = br.readLine();

            String[] str = st.split(" ");

            int[] arr = new int[6];

            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }

            int majority = (arr[3] + arr[4] + arr[5]) / 2;
            int chefVotes = arr[0] + arr[1] + arr[2];

            boolean chefWon = false;

            if (chefVotes > majority) {
                chefWon = true;
            } else {
                for (int i = 0; i < 3; i++) {
                    if ((chefVotes - arr[i] + arr[i + 3]) > majority) {
                        chefWon = true;
                        break;
                    }
                }
            }
            if (chefWon) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

        }
    }
}
