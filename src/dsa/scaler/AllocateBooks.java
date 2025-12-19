package scaler_questions.Scaler;

public class AllocateBooks {
    public static void main(String[] args){
        int[] A = {73, 58, 30, 72, 44, 78, 23, 9} ;
        int B = 5 ;
        System.out.println(books(A,B)) ;
    }

    static int books(int[] A, int B){

        int N = A.length ;
        int l = A[0] ;
        int h = A[0] ;
        for(int i = 1 ; i < N ; i++){
            h = h + A[i] ;
            if(A[i] > l){
                l = A[i] ;
            }
        }
        System.out.println("l " + l) ;
        System.out.println("h " + h) ;
        int ans = l ;
        while( l <= h){
            int mid = l + (h-l)/2 ;
            System.out.println("mid " + mid) ;
            if(check(mid,A,N,B) == true){
                ans = mid ;
                h = mid-1 ;
            }
            else {
                l = mid+ 1;
            }
        }
        return ans ;
    }

    static boolean check(int maxPage, int[]A, int N , int B){

        int studentallocated = 0 ;
        int totalPagePerStudent = 0 ;

        for(int i = 0 ; i < N ; i++){
            totalPagePerStudent = totalPagePerStudent + A[i] ;
            if(totalPagePerStudent > maxPage){
                totalPagePerStudent = A[i] ;
                studentallocated++ ;
            }
        }

        if(totalPagePerStudent <= maxPage){
            studentallocated++ ;
        }
        else{
            return false ;
        }


        if(B >= studentallocated){
            return true ;
        }
        return false ;
    }

}
