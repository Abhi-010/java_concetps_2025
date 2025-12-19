package scaler_questions.Scaler;

public class SmallestXOR {
    public static void main(String[] args){
        System.out.println(solve(4,6)) ;
    }
    public static int solve(int A, int B) {
        int count = setBits(A);
        if(count != B){
            long ans =  0 ;
            long N = A;

            for(int i = 31 ; i >= 0 ; i--){

                    if(((long)(1<<i) <= N)&& B>0) {
                        ans = ans + (1 << i);
                        B--;
                        A = A - (1 << i);
                    }

            }
            if(B>0){
                int i = 0;
                while(B>0){
                    if((ans & (1<<i)) == 0){
                        ans = ans + (1<<i) ;
                        i++ ;
                        B-- ;
                    }
                }
            }
            return (int)ans ;
        }
        return A ;
    }
    public static int setBits(int A){
        int count = 0 ;
        while(A>0){
            if((A&1) == 1){
                count++ ;
            }
            A = A>>1 ;
        }
        return count ;
    }
}
