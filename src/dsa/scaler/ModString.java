package scaler_questions.Scaler;

public class ModString {
    public static void main(String[] args){
        System.out.println(findMod("45653",3)) ;
    }

    static int findMod(String s, int p){

        int N = s.length() ;
        int ans = (s.charAt(N-1)-48)%p ;
        int cf = 1;

        for(int i = N-2 ; i >= 0 ; i--){
            cf = cf * (10%p) ;
            ans = (ans + ( (s.charAt(i)-48)%p * cf)%p)%p ;
        }
        return ans ;
    }
}
