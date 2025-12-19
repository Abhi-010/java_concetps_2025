package scaler_questions.Scaler;

public class MaxNonNegativeSubArray {
    public static void main(String[] args){
        //int [] A = {1, 2, 5, -7, 2, 5};
        //int [] A = {10, -1, 2, 3, -4, 100};
        //int[] A = {-846930886, -1714636915, 424238335, -1649760492};
        //int[]  A = {-5,-10,3};
        //int[] A = {0,0,-1,0};
        int[] A = {-1, -1, -1, -1, -1};
        int[] ans = solve(A);

        for(int i = 0 ; i < ans.length ; i++){
            System.out.print(ans[i] + " ");
        }
    }
    static int[] solve(int[] A) {
        int N = A.length;
        long [] pf = new long[N];
        if(A[0] < 0){
            pf[0] = 0;
        }
        else{
            pf[0] = A[0];
        }

        for(int i = 1 ; i < N ; i++){
            if(A[i] < 0){
                pf[i] = 0 ;
            }
            else{
                pf[i] = pf[i-1] + (long)A[i];
            }

        }

        //printing PF
        for(int i = 0 ; i < N ; i++){
            System.out.print(pf[i] + " ");
        }
        System.out.println();

        long max = pf[0];
        for(int i = 0 ; i < N ; i++){
            if(pf[i] >= max){
                max = pf[i];
            }
        }
        System.out.println("max " + max);/*
        if(max < 0){
            return new int[0];
            }
        */

        int endInd = 0;
        int startInd = 0;
        int S = -1;
        int E = -1;
        for(int i = 0 ; i < N ; i++){
            if(max == pf[i]){
                endInd = i;
                startInd = getStartIndex(A,endInd);
                if(S == -1 && E == -1){
                    S = startInd;
                    E = endInd;
                }
                else{
                    if((endInd-startInd+1) > (E-S+1)){
                       S = startInd;
                       E = endInd;
                    }
                    else if((endInd-startInd+1) == (E-S+1)){
                        if(startInd < S){
                            S = startInd;
                            E = endInd;
                        }
                    }
                }
            }
        }

        int[] ans = new int[E-S+1];
        int k = S;
        int countOfElements = 0;
        for(int i = 0 ; i < ans.length ; i++){
            if(A[k] >= 0){
                ans[i] = A[k];
                countOfElements++;
            }
            k++;
        }
        if(countOfElements>0){
            return ans;
        }
        return new int[0];
    }

    static int getStartIndex(int[] A , int endInd){
        int startInd = endInd;
        for(int i = endInd ; i >= 0 ; i--){
            if(A[i] >= 0){
                startInd = i;
            }
            else{
                break;
            }
        }
        return startInd;
    }

}
