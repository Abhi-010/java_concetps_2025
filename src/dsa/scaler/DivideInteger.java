package scaler_questions.Scaler;

public class DivideInteger {
    public static void main(String[] args) {
        System.out.println(divide(Integer.MIN_VALUE, -1));
    }

    public static int divide(int A, int B) {
        //if (A == Integer.MIN_VALUE && B == -1) return Integer.MAX_VALUE;
       // if (A == Integer.MIN_VALUE && B == 1) return Integer.MIN_VALUE;

        long n = A, m = B;
        System.out.println("n : " + n + " m : " + m );
        int sign = 1;
        if (n < 0) sign = -sign;
        if (m < 0) sign = -sign;

        n = Math.abs(n);
        m = Math.abs(m);
        System.out.println("n : " + n + " m : " + m );
        long q = 0;
        for (int i = 31; i >= 0; i--) {
            if ((long) (m << i) <= n) {

                n = n - (m << i);
                q = q + (1 << i);
            }
        }
        System.out.println("sign  " + sign);
        System.out.println("Inside function  " + q);
        if (sign < 0) q = -q;
        q = (int)q ;
        System.out.println(" 2 Inside function  " + q);
        //System.out.println("Inside function  " + q);
        //System.out.println("Inside function int of q " + (int)q);
        if (q > Integer.MAX_VALUE) {
            //System.out.println("you are here");
            return Integer.MAX_VALUE;
        }
        return (int) q;
    }
}
