package scaler_questions.Scaler;

public class SortByColor {
    public static void main(String[] args){
        int [] A = {0,1,2,0,1,2,0,0,1,1,2,1,1,2,0,0,0,1,0} ;
        solve(A) ;
        for(int i = 0 ; i < A.length ; i++){
            System.out.print(A[i] + " ") ;
        }
    }

    static void solve(int[] A) {

        int j = 0 ;
        int temp = 0 ;
        for(int i = 0; i < A.length ; i++){
            if(A[i] == 0 ){
                temp = A[i] ;
                A[i] = A[j] ;
                A[j] = temp ;

                j++ ;
            }
        }
        for(int k = j ; k < A.length ;k++){
            if(A[k] == 1){
                temp = A[k] ;
                A[k] = A[j] ;
                A[j] = temp ;
                j++;
            }
        }
        for(int l = j ; l < A.length ; l++){
            if(A[l] == 2){
                temp = A[l] ;
                A[l] = A[j] ;
                A[j] = temp ;
                j++ ;
            }
        }

    }
}
