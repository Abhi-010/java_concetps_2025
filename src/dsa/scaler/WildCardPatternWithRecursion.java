package scaler_questions.Scaler;

public class WildCardPatternWithRecursion {
    public static void main(String[] args){
        String S = "abcdefg" ;
        String P = "***************" ;

        int l1 = S.length() ;
        int l2 = P.length() ;

        System.out.println(isMatch(S,l1,P,l2));
    }
    static boolean isMatch(String S, int l1, String P, int l2){
        //base condition
        if(l1 == 0 && l2 == 0 ){
            return true ;
        }
        if(l2 == 0 ){
            return false ;
        }
        if(l1 == 0){
            for(int k = 0 ; k < l2 ; k++){
                if(P.charAt(k) != '*'){
                    return false ;
                }
            }
            return true ;
        }
        //main logic
        if(S.charAt(l1-1) == P.charAt(l2-1)){

            return isMatch(S, l1-1 , P, l2-1) ;
        }
        else if(P.charAt(l2-1) == '?') {
            return isMatch(S, l1-1 , P, l2-1) ;
        }
        else if(P.charAt(l2-1) == '*') {

            return (isMatch(S,l1,P,l2-1) || isMatch(S,l1-1,P,l2)) ;
        }
        else{
            return false ;
        }
    }
}
