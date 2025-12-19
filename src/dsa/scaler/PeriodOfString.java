package scaler_questions.Scaler;

public class PeriodOfString {
    public static void main(String[] args){
        String A = "abcababcababcab";
        System.out.println(solve(A));
        String B = "abcaabcaab";
        System.out.println(solve(B));
        String C = "zzzzzzzzzzzzzzbzzzzzzzzzzzzzzbzzzzzzzzzzzzzzbzzzzzzzzzzzzzzbzzzzzzzzzzzzzzbzzzzzzzzzzzzzzbzzzzzzzzzzzzzzbzzzzzzzzzzzzzzbzzzzzzzz" ;
        System.out.println(solve(C));

        String D = "abababababb";
        System.out.println(solve(D));


    }
    static int solve(String A){
        int N1 = A.length();

        int[] LPS = new int[N1];
        LPS[0] = 0 ;
        for(int i = 1 ; i < N1 ; i++ ){
            int x = LPS[i-1];
            while(A.charAt(i) != A.charAt(x)){
                if(x == 0){
                    x = -1;
                    break;
                }
                x = LPS[x-1];
            }
            LPS[i] = x+1 ;
        }
        for(int i = 0 ; i < LPS.length ; i++){
            System.out.print(LPS[i] + " ");
        }
        System.out.println();
        int ans = 0 ;
        for(int i = 0 ; i < LPS.length-1 ; i++){
            if(LPS[i] == 0 || LPS[i] == 1){
                if(LPS[i+1] == 1){
                    ans = i;
                }
            }

            if(LPS[i] > LPS[i+1]){
                ans = i;
            }
        }
        return ans+1;

    }
}
