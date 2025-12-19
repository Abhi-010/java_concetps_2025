package scaler_questions.Scaler;

public class KthSymbol {
    public static void main(String[] args){
        System.out.println(solve(2,2));

    }
    static int solve(int A, int B){
        String s = symbol("0",A,1) ;
        return (s.charAt(B-1) - 48 );
    }

    static String symbol(String s , int A, int N){
        if(A == N ) return s ;
        StringBuilder a = new StringBuilder();
        for(int i= 0 ; i<s.length() ; i++){
            if(s.charAt(i) == '0'){
                a.append("01") ;
            }
            else {
                a.append("10") ;
            }
        }
        s = a.toString() ;
        N++ ;
        return symbol(s,A,N) ;
    }
}
