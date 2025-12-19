package scaler_questions.Scaler;

public class ReverseTheString {

    public static  void main(String[] args ){
        String s = "crulgzfkif gg ombt vemmoxrgf qoddptokkz op xdq hv " ;

        System.out.println(solve(s)) ;
    }

    static String solve(String A) {

        int len = A.length() ;
        char[] ch = new char[len] ;
        for(int i = 0 ; i < len ; i++){
            ch[i] = A.charAt(i) ;
        }

        reverse(ch, 0,len-1);

        int p1 = 0 ;
        int p2 = 0 ;
        while(p2 < len){

            while(p2 < len && ch[p2] != ' '){
                p2++ ;
            }
            reverse(ch, p1,p2-1) ;

            p1 = p2+1 ;
            p2 = p1 ;
        }
        String res = "" ;
        int i =0 ;
        if(ch[0] == ' '){
            i = 1;
        }
        for(; i < ch.length ; i++){
            res = res + ch[i] ;
        }
        return res ;

    }
    public static void reverse(char[] ch, int p1, int p2){

        while(p1 < p2){
            char temp = ch[p1] ;
            ch[p1] = ch[p2] ;
            ch[p2] = temp ;
            p1++ ;
            p2-- ;
        }
    }
  }


    //hv xdq op qoddptokkz vemmoxrgf ombt gg crulgzfkif