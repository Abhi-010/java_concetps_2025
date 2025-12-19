package scaler_questions.Scaler;

import java.util.HashMap;
import java.util.Map;

public class CheckPalindrome {
    public static void main(String[] args){
        String A = "aahhiii" ;
        System.out.println(check(A)) ;
    }
    static int check(String A) {
        char[] ch = A.toCharArray();
        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < ch.length; i++) {
            if (hm.containsKey(ch[i])) {
                hm.put(ch[i], hm.get(ch[i]) + 1);
            } else {
                hm.put(ch[i], 1);
            }
        }
        if (ch.length % 2 == 0) {
            for (int i = 0; i < ch.length; i++) {
                if (hm.get(ch[i]) % 2 != 0) {
                    return 0;
                }
            }
            return 1 ;
        }
        int count = 0 ;
        for(Map.Entry<Character,Integer> set : hm.entrySet()){
            if(set.getValue() % 2 != 0){
                count++ ;
                if(count>1){
                    return 0 ;
                }
            }
        }
        return 1 ;
    }
}
