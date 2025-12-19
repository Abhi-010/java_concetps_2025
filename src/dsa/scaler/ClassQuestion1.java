package scaler_questions.Scaler;

public class ClassQuestion1 {
    public static void main(String[] args){

        System.out.println(countBits(15)) ;

        //System.out.println(((0100 & 0) >> 2 ) % 2 );
        //System.out.println( (21>>2) & 1);
        //System.out.println(checkBit(21,2) ) ;


    }

    public static int countBits(int N){
        int count = 0  ;
        int i = 0 ;
        while(i < Math.pow(2,5)){
            count = count + ((N>>i) & 1) ;
            i++ ;
        }
        return count ;

    }
    public static boolean checkBit(int N,int i){
        StringBuilder binary = new StringBuilder() ;

        while( N != 1){
            binary.append(N % 2) ;
            N = N / 2;
        }
        binary.append('N') ;

        if(binary.charAt(i) == '1'){
            return true ;
        }
        else{
            return false ;
        }
    }
}
