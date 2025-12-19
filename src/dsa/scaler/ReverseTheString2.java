package scaler_questions.Scaler;

public class ReverseTheString2 {

    public static void main(String[] args) {
        String s = "crulgzfkif gg ombt vemmoxrgf qoddptokkz op xdq hv ";
        //String s = "hey how are you?";
        System.out.println(solve(s));
    }

    static String solve(String A) {
        String word = "";
        String ans = "" ;
        for(int i = A.length()-1 ; i >= 0 ; i--){

            if(A.charAt(i) == ' ') {
                if(word == "") continue;
                else{
                    word = reverse(word) ;
                    if(ans != ""){
                        ans = ans + " " ;
                    }
                    ans = ans + word ;
                    word = "" ;
                }
            }
            else{
                word = word + A.charAt(i) ;
            }
        }
        if(word != ""){
            if(ans != ""){
                ans = ans + " " ;
            }
            word = reverse(word) ;
            ans = ans + word ;
        }
        return ans ;
    }
    static String reverse(String word){
        String rev = "";
        for(int i = word.length()-1 ; i >= 0 ; i--){
            rev = rev + word.charAt(i) ;
        }
        return rev ;
    }

}