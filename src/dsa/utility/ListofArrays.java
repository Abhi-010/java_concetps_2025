package dsa.utility;

import java.util.ArrayList;
import java.util.List;

public class ListofArrays {
    public static void main(String[] args) {
        ArrayList<int[]> merged = new ArrayList<>() ;

        merged.add(new int[]{1,2,3});
        merged.add(new int[]{4,5,6});
        merged.add(new int[]{7,8,9});
        merged.add(new int[]{1,2}) ;

        int[][] ans = merged.toArray(new int[ merged.size() ][]) ;

            for (int i = 0; i < ans.length; i++) {
                for (int j = 0; j < ans[i].length; j++) {
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
    }
}
