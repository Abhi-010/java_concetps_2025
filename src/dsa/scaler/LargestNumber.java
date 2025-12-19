package scaler_questions.Scaler;

import java.util.ArrayList;
import java.util.Comparator;
public class LargestNumber {
    public static  class CompNum implements Comparator<String> {
        public int compare(String a, String b)
        {

            return (b+a).compareTo(a+b);
            /*
            if(Integer.parseInt(a+b) > Integer.parseInt(b+a)){
                return 1;
            }
            return 0 ; */
        }
    }
    public static void main(String[] args){
        int[] A = {0,0} ;

        String[] str = new String[A.length] ;

        for(int i = 0 ; i < str.length ; i++){
            str[i] = A[i] + "" ;
        }

        java.util.Arrays.sort(str,new CompNum());

        String res = "" ;
        for(int i = 0 ; i <str.length ; i++){
            res = res + str[i] ;
        }
        int i = 0 ,j = 0 ;
        while( i < res.length() ){
            if(res.charAt(i) != '0'){
                j = i ;
                break ;
            }
            i++ ;
        }
        if(j == 0 ){
            System.out.println("0");
        }
        else {
            System.out.println(res.substring(j));
        }

        //if(j == 0) return "0" ;
       // return res.substring(j) ;
    }

    }
