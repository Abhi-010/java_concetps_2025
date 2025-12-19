package scaler_questions.Scaler.classquestion;

public class ClassQuestions {
    public static void main(String[] args){

        System.out.println(-40%7+7);

        /*

        int[][] mat = {
                {1,2,3},
                {5,6,7},
                {2,3,4}
                        } ;
            */
        //transpose(mat) ;
        //print diagonal matrix of a square matrix
        //print all diagonals elements of a non square matrix

       //printDiagonal(mat) ;
        //antiDiagonal(mat);

        /*
        int i = 0 ;
        int j = 3 ;

        while(i < 4 && j >= 0){
            System.out.print(mat[i][j] + " ") ;
            i++ ;
            j-- ;
        }
        /*
        for(int i = 0 ; i < mat.length ; i++){
            for(int j = 0 ; j < mat[0].length ; j++){
                System.out.print(mat[i][j] + " ") ;
            }
            System.out.println() ;
        }
        */

        //int[] A = {5,5,5,5,5,5} ;
        //System.out.print(subarrayMaxMin(A));

        //String s = "acgdgag" ;
        //System.out.println(countAlphabet(s));
    }

    static void antiDiagonal(int[][] mat){
        int row = mat.length ;
        int col = mat[0].length ;

        int[][] dia = new int[row+col-1][col] ;

        int p = 0 ;
        for(int k = 0 ; k < col ; k++){
            int i = 0 ;
            int j = k ;
            int index = 0 ;
            while(j > -1 && i < row){
                dia[k][index++] = mat[i][j] ;
                i++ ;
                j-- ;
            }
            p = k ;
        }

        for(int k = 1; k < row ; k++){
            int j = col - 1;
            int i = k ;
            int index = 0 ;
            while(j > -1 && i < mat.length){
                dia[p][index++] = mat[i][j] ;
                i++ ;
                j-- ;

            }
            p++ ;
        }

        for(int i = 0 ; i < row+col-1; i++){
            for(int j = 0 ; j < row ; j++){
                System.out.print(dia[i][j] + " ") ;
            }
            System.out.println()  ;
        }
    }
    static void printDiagonal(int[][] mat){
        int row = mat.length ;
        int col = mat[0].length ;

        for(int k = 0 ; k < col ; k++){
            int i = 0 ;
            int j = k ;
            while(j > -1 && i < row){
                System.out.print(mat[i][j] +" ") ;
                i++ ;
                j-- ;
            }
            System.out.println() ;
        }

        for(int k = 1; k < row ; k++){
            int j = col - 1;
            int i = k ;

            while(j > -1 && i < mat.length){
                System.out.print(mat[i][j] + " ") ;
                i++ ;
                j-- ;
            }
            System.out.println();
        }
    }

    static void transpose(int[][] mat){

        int row = mat.length;
        int col = mat[0].length ;
        int temp ;
        for(int i = 0 ; i < row ; i++){
            for(int j = i + 1; j < col ; j++){
                temp = mat[i][j] ;
                mat[i][j] = mat[j][i] ;
                mat[j][i] = temp ;
            }
        }
    }


    //given an array , return the smallest length of subarray that contain both max and
    //min elements

    static int subarrayMaxMin(int[] A){

        //find max and min elements
        int min, max ;
        if(A[0] > A[1]){
            max = A[0] ;
            min = A[1] ;
        }
        else {
            max = A[1] ;
            min = A[0] ;
        }
        //3,6,8,10,10,9

        for(int i = 2 ; i < A.length ; i++){
            if(A[i] > max){
                max = A[i] ;
            }
            else {
                if(A[i] < min){
                    min = A[i] ;
                }
            }
        }

        System.out.println(max + " " +min);
        int lastMin = -1 ;
        int lastMax = -1 ;
        int length = A.length ;
        for(int i = 0 ; i < A.length ; i++){
            if(A[i] == min){
                lastMin = i ;
            }
            if(A[i] == max){
                lastMax = i ;
            }

            if(lastMax != -1 && lastMin != -1){

                if( Math.abs(lastMax - lastMin) <= length){
                    length = Math.abs(lastMax - lastMin);
                }
            }
        }
        return length + 1 ;
    }



    //Given a String with all lower case alphabets, count the pair of (i,j) such that
    // string[i] = 'a' and string[j] = 'g'

    static int countAlphabet(String s ){
        int length = s.length() ;
        int count_a = 0 ;
        int totalCount = 0 ;

        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == 'a'){
                count_a++ ;
            }
            else if(s.charAt(i) == 'g'){
                totalCount = totalCount + count_a ;
            }
        }
        return totalCount ;

    }
}
