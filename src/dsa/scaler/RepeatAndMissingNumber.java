package scaler_questions.Scaler;

public class RepeatAndMissingNumber {
    public static void main(String[] args){
        int [] A = {1,2,3,3,5} ;
        solve(A) ;
    }

    static void solve(int[] A){

        long sumOfArray = 0 ;
        long productOfArray = 1;
        for(int i = 0 ; i < A.length ; i++){
            sumOfArray = sumOfArray + A[i] ;
            productOfArray = productOfArray * A[i] ;
        }

        long ActualSum = A.length * (A.length +1) / 2 ;
        long diff = sumOfArray - ActualSum ;

        int i = 2;
        long product = 1 ;
        while(i <= A.length){
            product = product * i ;
            i++ ;
        }
        //sumOfArray ActualSum
        //productOfArray product

        //System.out.println(sumOfArray);
        //System.out.println(ActualSum);
        //System.out.println(productOfArray);
        //System.out.println(product);
        long missingNum =  (product * (sumOfArray - ActualSum))/(productOfArray - product) ;
        long RepeatNum = missingNum + (sumOfArray - ActualSum) ;
        System.out.println( (int)missingNum + " " +  (int)RepeatNum   ) ;






    }
}
