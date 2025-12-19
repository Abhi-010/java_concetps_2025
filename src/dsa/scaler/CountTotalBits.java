package scaler_questions.Scaler;

public class CountTotalBits {
    public static void main(String[] args){
        System.out.println(solve(5)) ;
    }
    public static int solve(long A) {
        long ans = 0 ;
        while(A>0){
            for(int i = 30 ; i >= 0 ; i--){
                System.out.println("(1<<i) :  " + (1<<i));
                if((1<<i) > A){
                }
                else {
                    System.out.println("you are in else ");
                    System.out.println("value of i : " + i);
                    if((1<<i) == A){
                        System.out.println("you are in if ");
                        ans = (pow(2,i-1,1000000007) * i%1000000007)%1000000007 + 1 ;
                        System.out.println("i :" + i);
                        return (int)ans ;
                    }
                    else{
                        System.out.println("you are in 2nd if ");
                        int q = (pow(2,i-1,1000000007) * i%1000000007)%1000000007 + 1 ;
                        ans = ans + q ;
                        A = A%1000000007 - pow(2,i,1000000007) ;
                    }
                }
            }
        }
        return (int)ans ;
    }
    public static int pow(int A, int B, int C) {
        //Solution with Recursion : TC : O(logB)
        if(B == 0 && A != 0) return 1 ;
        else if(A==0 && B==0) return 0 ;
        else{
            if(B % 2 == 0){
                long x = pow(A,B/2,C) ;
                return (int)((x%C * x%C)%C + C)%C ;
            }
            else {
                long x = pow(A,(B-1)/2,C) ;
                //return ((A*x*x)%C+C)%C ;
                return (int)((((A%C * x%C * x%C)%C + C)%C)%C + C)%C;
            }
        }
    }

}
