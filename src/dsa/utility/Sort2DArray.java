package dsa.utility;

import java.util.Arrays;
import java.util.Comparator;

public class Sort2DArray {
    public static void main(String[] args) {
        int[][] A = new int[][]{
                {0,2,2},
                {1,3,8},
                {2,4,1},
                {4,5,90},
                {4,6,-4}
        } ;
        int[][] res  = sortByCol(A,2) ;
        printArray(res);
    }
    public static int[][] sortByCol(int[][] A,int col){
        Arrays.sort(A,(a,b)->b[col]-a[col]) ;
        return A;
    }



    public static int[][] sortByRow(int [][] A){
        for(int[] row : A){
            Arrays.sort(row);
        }
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
