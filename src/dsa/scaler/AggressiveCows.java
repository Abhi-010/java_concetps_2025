package scaler_questions.Scaler;

public class AggressiveCows {
    public static void main(String[] args) {
        int A[] = {82, 61, 38, 88, 12, 7, 6, 12, 48, 8, 31, 90, 35, 5, 88, 2, 66, 19, 5, 96, 84, 95};
        int B = 8 ;
        System.out.println(solve(A, B)) ;
    }

    public static int solve(int[] A, int B) {
        java.util.Arrays.sort(A) ;

        for(int i = 0 ; i < A.length ; i++){
            System.out.print(A[i] + " ") ;
        }

        int N = A.length ;
        //calculating low value
        int l = A[1] - A[0] ;
        for(int i = 0 ; i < N-1 ;i++ ){

            if(l > (A[i+1] - A[i])){
                l = A[i+1] - A[i] ;
            }
        }
        //calculating high value
        int h = A[N-1] - A[0] ;

        int ans = l ;
        while(l <= h){
            System.out.println("l: " + l + " h : " + h );
            int mid = (l+h)/2 ;
            if(check(A,N,B,mid)){
                ans = mid ;
                l = mid+1 ;
            }
            else {
                h = mid-1 ;
            }
        }
        return ans ;

    }
    static boolean  check(int[] A, int N, int B, int mid){
        int lastCow = A[0] ;
        int c = 1 ;
        for(int i = 1 ; i < N ; i++){

            if(( A[i] - lastCow ) >= mid){
                lastCow = A[i] ;
                c++ ;

                if(c == B) return true ;
            }
        }
        return false ;
    }
}

