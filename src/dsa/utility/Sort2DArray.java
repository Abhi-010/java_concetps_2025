package dsa.utility;

import java.util.Arrays;
import java.util.Comparator;

public class Sort2DArray {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {0,-9,5,4},
                {0,-9,1,1},
                {33,11,22,0}
        } ;

        /*
        [[0,2],[1,3],[2,4],[3,5],[4,6]]
        [[-52,31],[-73,-26],[82,97],[-65,-11],[-62,-49],[95,99],[58,95],[-31,49],[66,98],[-63,2],[30,47],[-40,-26]]
         */
        int[][] arr1 = new int[][]{
                {-52,31},{-73,-26},{82,97},{-65,-11},{-62,-49},{95,99},{58,95},{-31,49},{66,98},{-63,2},{30,47},{-40,-26}
        } ;

//        int[][] res = sortByRow(arr);
//        printArray(res);
        int[][] res  = sortByCol(arr1,0) ;
        printArray(res);
    }


    public static int[][] sortByRow(int [][] A){
        for(int[] row : A){
            Arrays.sort(row);
        }
        return A;
    }

    public static int[][] sortByCol(int[][] A,int col){
//        Arrays.sort( A, Comparator.comparing( (int[] arr)-> arr[0] )
//                .thenComparing(arr-> arr[1]).thenComparing(arr-> arr[2]) );

        Arrays.sort(A, Comparator.comparingInt((int[] arr) -> arr[0])
                .thenComparingInt(arr -> arr[1]));
        return A;
    }



    public static void printArray(int[][] A){
        for(int i = 0 ;i < A.length ; i++){
            for(int j = 0 ; j < A[0].length ; j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

}
