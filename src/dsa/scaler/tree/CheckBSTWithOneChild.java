package scaler_questions.Scaler.tree;

public class CheckBSTWithOneChild {

    public static void main(String[] args){

        int[] A = {12, 1, 9, 6, 2};
        System.out.println(solve(A)) ;
    }
    public static  String solve(int[] A) {
        if(A.length <=2){
            return "YES" ;
        }

        for(int i = 2 ; i < A.length ; i++){
            System.out.println(i);
            if(A[i-1] > A[i-2]){
                if( (A[i] < A[i-1]) && (A[i] > A[i-2])){

                }
                else {
                    System.out.println("u r 1");
                    return "NO" ;
                }
            }
            else if(A[i-2] > A[i-1]){
                
                if( (A[i] < A[i-2]) && (A[i] > A[i-1])){
                    ;
                }
                else {
                    System.out.println("A[i-1] " + A[i-1] );
                    System.out.println("A[i-2] " + A[i-2] );
                    System.out.println("A[i] " + A[i] );
                    return "NO" ;
                }
            }
        }
        return "YES" ;
    }
}
