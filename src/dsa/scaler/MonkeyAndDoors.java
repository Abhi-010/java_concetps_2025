package scaler_questions.Scaler;

public class MonkeyAndDoors {
    public static void main(String[] args){
        int [] A = new int[101] ;
        for(int i = 1 ; i < 101 ; i ++){
            A[i] = 1;
        }
        for(int i = 2 ; i < 101 ; i ++){

            if(factors(i) % 2 != 0){
                A[i] = 0 ;
            }
        }
        int count = 0  ;
        for(int i = 1; i < 101 ; i++){
            if(A[i] == 1){
                count++ ;
            }
        }
        System.out.println(count) ;
    }
    static int factors(int N){
        int countOffactors = 0 ;

        for(int i = 2 ; i <= N ; i++){
            if(N % i == 0){
                countOffactors++ ;
            }
        }
        return countOffactors ;
    }

}
