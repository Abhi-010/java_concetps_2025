package dsa.codechef.codechef.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MemCachedService {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int n = Integer.parseInt(br.readLine());
            String str = br.readLine();
            String[] strArray = str.split(" ");

            for(int i = 0 ; i < strArray.length ; i++){
                System.out.println(strArray[i]);
            }

            boolean error = false;

            if(strArray[0].equals("stop")){
                System.out.println("you are here..");
                error = true;
            }
            else{
                for(int j = 1; j < strArray.length ; j++){
                    if(strArray[j].equals("stop")){
                        if(strArray[j-1].equals("stop"))
                       error = true;
                    }
                }
            }
            if(error){
                System.out.println("404");
            }
            else {
                System.out.println("200");
            }
        }
    }
}
