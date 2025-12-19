package scaler_questions.Scaler;

public class CodeNation {
    public static void main(String[] args){
        int [] A = {5,3,6,8,8,6,10,9,9,15,3,5,15,10,99,100} ;
        checkTwoDistinctNum(A) ;

    }
    static void checkTwoDistinctNum(int [] A){

        int XOR = 0 ;
        for(int i = 0 ; i < A.length ; i++){
            XOR = XOR ^ A[i] ;
        }

        int i = 0 ;
        int pos = 0 ;
        while(XOR > 0){
            if((XOR & 1) == 1){
                pos = i ;
                break;
            }
            i++ ;
            XOR = XOR>>1 ;
        }
        int ans1 = 0, ans2 = 0;
        for(int j = 0 ; j < A.length ; j++){
            if((A[j] & (1<<pos)) != 0){
                ans1 = ans1 ^ A[j] ;
            }
            else{
                ans2 = ans2 ^ A[j] ;
            }
        }
        System.out.println(ans1 + " " + ans2) ;

    }
}
