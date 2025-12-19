package dsa.codechef.codechef.starters32;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class FlipSorting {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
        int t = Integer.parseInt(br.readLine())  ;
        while(t-- != 0){
            int N = Integer.parseInt(br.readLine()) ;
            String s = br.readLine() ;
            char[] ch = s.toCharArray();
            Map<Integer,Integer> hm = new HashMap<>() ;
            for(int i = 0 ; i < N ; i++){
                if(ch[i] == '1'){
                    hm.put(i+1,N-i) ;
                    //flip the string
                    for(int j = i ; j < N ; j++){
                        if(ch[j] == '1'){
                            ch[j] = '0' ;
                        }
                        else {
                            ch[j] = '1' ;
                        }
                    }
                }
            }

            System.out.println(hm.size());
            for (Map.Entry<Integer,Integer> entry : hm.entrySet())
                System.out.println( entry.getKey() + " "+
                         entry.getValue());

        }

    }
}
