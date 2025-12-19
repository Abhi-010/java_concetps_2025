package scaler_questions.Scaler;

public class PainterPartition {
    public static void main(String[] args){
        int A = 1 ;
        int B = 1000000;
        //int[] C = {185, 186, 938, 558, 655, 461, 441, 234, 902, 681} ;
        //int[] C = {1,8,11,3} ;
        int[] C = {1000000,1000000} ;
        System.out.println(paint(A,B,C));
    }
    public static int paint(int A, int B, int[] C) {
        long ans1 = 0 ;
        if(A == 1){
         for(int i = 0 ; i < C.length ; i++){
             ans1 = ans1%10000003 + ( (long) C[i]*B ) % 10000003 ;
         }
         return (int)ans1%10000003 ;
        }


        long max = Long.MIN_VALUE ;
        for(int i = 0 ; i < C.length ; i++){
            if(C[i] > max){
                max = (long) C[i] ;
            }
        }
        long l = (long)max * B ;
        long totaltime = 0 ;
        for(int i = 0 ; i < C.length ;i++){
            totaltime+=C[i];
        }
        System.out.println("total time :" + totaltime);
        long h = (long)totaltime * B ;

        long ans = 0 ;
        System.out.println("l : " + l + " h : " + h);
        while(l <= h){
            //System.out.println("l : " + l + " h : " + h);
            long mid = (l+h)/2 ;
            if(checkPoss(C,mid,A,B)){
                ans = mid ;
                ans = ans % 10000003 ;
                h = mid-1 ;
            }
            else {
                l = mid+1 ;
            }
        }
        System.out.println("ans : " + ans);

        return (int)ans ;
    }
    public static boolean checkPoss(int[] C,long mid,int A, int B){
        long count = 0 ;
        long sum = 0 ;
        for(int i = 0 ; i < C.length ; i++){
            sum = sum + B*C[i] ;
            if(sum >= mid){
                count++ ;
                if(count > A){
                    return false ;
                }
                if(sum == mid){
                    sum = 0 ;
                }
                else {
                    sum = C[i]*B ;
                }
            }
        }
        if(sum == 0 && count == A) return true;
        if(sum<=mid && count < A){
            return true ;
        }
        return false ;
        // sum == mid,
        // sum < mid,
        // sum == 0
        // sum > mid ,
        // count - no of painters used till now , A : total painters available
    }

}
