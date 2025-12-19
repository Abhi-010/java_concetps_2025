package scaler_questions.Scaler;

public class SpiralOrderMatrix {
    public static void main(String[] args){
        printSpiralMatrix(3) ;
    }
    static void printSpiralMatrix(int A){

        int[][] array = new int[A][A]  ;

        int k = 1;
        for(int i = 0 ; i < A ; i++){
            for(int j = 0 ; j < A ; j++){
                array[i][j] = k ;
                k++ ;
            }
        }
        for(int i = 0 ; i < A ; i++){
            for(int j = 0 ; j < A ; j++){
                System.out.print(array[i][j] + " ") ;
            }
            System.out.println();
        }

    }
}
