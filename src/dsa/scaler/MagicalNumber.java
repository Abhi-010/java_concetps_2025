package scaler_questions.Scaler;

public class MagicalNumber {
    public static void main(String[] args){
        int A = 807414236,B=3788,C=38141 ;
        System.out.println(solve(A,B,C));
    }
    public static int solve(int A, int b, int c) {
        long B = (long)b ;
        long C = (long)c ;

        long l = Math.min(B,C) ;
        long h = Math.max(B,C) * A ;
        long lcmValue = lcm(b,c) ;
        System.out.println("lcm : " + lcmValue);
        while(l<=h){
            System.out.print("l : " + l + " h : " + h);
            long mid = (l+h)/2 ;
            System.out.println(" mid :" + mid);
            long totalNum =  mid/(long)B + mid/(long)C - mid/lcmValue ;

            if(mid%B == 0 || mid%C == 0){
                if(totalNum == A) return (int) (mid%1000000007) ;
            }

            if(totalNum < A){
                l = mid+1 ;
            }
            else {
                h = mid-1 ;
            }
        }
        return 0;
    }

    static long lcm(int B ,int C){
        long gcd = gcd_fuction(B,C) ;

        return (long)(B*C)/gcd ;
    }

    static long  gcd_fuction(int a , int b){
        if(a>b){
            int temp = a ;
            a = b ;
            b = temp ;
        }
        while(a>0){
            int temp = a ;
            a = b % a ;
            b = temp ;
        }
        return (long)b ;
    }

}
