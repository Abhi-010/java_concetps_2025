package dsa.codechef.codechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BinaryBaseBasics {
    public static void main (String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
        int t = Integer.parseInt(br.readLine()) ;

        while(t-- != 0){
            String s = br.readLine() ;
            String[] strArr = s.split(" ") ;
            int N = Integer.parseInt(strArr[0]) ;
            int K = Integer.parseInt(strArr[1]) ;

            String str = br.readLine() ;

            if(isPalindrome(str)){
                if(N%2 == 0){
                    if(K%2 == 0){
                        System.out.println("yes") ;
                    }
                    else{
                        System.out.println("no") ;
                    }
                }
                else{
                    System.out.println("yes") ;
                }
            }
            else{
                int dc = 0 ;
                int i = 0 ;
                int j = N-1 ;

                while(i < j){
                    if(str.charAt(i) != str.charAt(j)){
                        dc++ ;
                    }
                    i++ ;
                    j-- ;
                }
                if(K == 0 || (K<dc)) {
                    System.out.println("no");
                }
                else{
                    if(N%2 == 0){
                        if((K-dc)%2 == 0){
                            System.out.println("yes");
                        }
                        else{
                            System.out.println("no");
                        }
                    }
                    else{
                        System.out.println("yes");
                    }
                }
            }
        }
    }
     static boolean  isPalindrome(String s){
        int i = 0 ;
        int j = s.length()-1 ;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false ;
            }
            i++ ;
            j-- ;
        }
        return true ;
    }
}
