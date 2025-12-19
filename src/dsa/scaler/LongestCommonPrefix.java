package scaler_questions.Scaler;

public class LongestCommonPrefix {
    public static void main(String[] args){

        int ans = fun(2,10) ;
        System.out.println(ans) ;



        //String[] A = {"ABCD"};
        //System.out.println(solve(A)) ;
    }

    static int fun(int x, int n){
        if(n==0){
            return 1 ;
        }
        else if(n%2==0){
            return fun(x*x,n/2) ;
        }
        else{
            return x * fun(x*x, (n-1)/2) ;
        }
    }
    static String solve(String[] A){

        if(A.length == 1){
            return A[0];
        }

        String res = "";
        int j = 0 ;
        while(j < Math.min(A[0].length(),A[1].length())){

            if(A[0].charAt(j) == A[1].charAt(j)){
                j++;
            }
            else{
                break;
            }
        }
        res = A[0].substring(0,j) ;

        for(int i = 2 ; i < A.length ; i++){

             j = 0 ;
            while(j < Math.min(res.length(),A[i].length())){

                if(res.charAt(j) == A[i].charAt(j)){
                    j++;
                }
                else{
                    break;
                }
            }
            res = res.substring(0,j) ;
        }
        return res;
    }
}
