package scaler_questions.Scaler;

import java.util.Stack;

public class SumOfMaxOfEverySubArray {
    public static void main(String[] args){
        //int[] A = {4,5,2,10,8,2} ;
        ///int[] A = {8,3,6} ;
        int[] A = {994390, 986616, 976849, 979707, 950477, 968402, 992171, 937674, 933065, 960863, 980981, 937319, 951236, 959547, 991052, 991799, 992213, 941294, 978103, 997198, 960759, 988476, 963517, 980366, 921767, 979757, 977912, 983761, 981869, 947454, 930202, 999086, 973538, 999798, 996446, 944001, 974217, 951595, 942688, 975075, 970973, 970130, 897109, 927660, 862233, 997130, 986068, 954098, 978175, 889682, 988973, 996036, 969675, 985751, 977724, 881538, 988613, 924230, 906475, 915565, 986952, 975702, 994316, 964011, 986848, 983699, 949076, 989673, 981788, 929094, 988310, 926471, 994763, 999736, 980762, 973560, 996622, 934475, 998365, 966255, 998697, 998700, 911868, 983245, 996382, 996992, 953142, 994104, 987303, 853837, 960626, 904203, 998063, 977596, 977868, 996012, 946345, 949255, 988138, 996298, 954933, 965036, 886976, 998628, 990878, 953725, 916744, 985233, 919661, 970903, 986066} ;
        ///int[] A = {994390, 986616, 976849, 979707, 950477, 968402} ;

        //int[] A = {4, 7, 3, 8};
       // int[] A = {1};

       System.out.println(sumOfMax(A));
       System.out.println(sumOfMin(A));
        System.out.println(sumOfMax(A) - sumOfMin(A));
       // sumOfMax(A) ;

    }
    public static int sumOfMax(int[] A){
        int[] leftMax ;
        leftMax = leftGreaterIndex(A) ;
        int[] rightMax ;
        rightMax = rightGreaterIndex(A) ;
        long sum = 0 ;
        for(int i = 0 ;i < A.length ; i++){
            int p1 = leftMax[i] ;
            int p2 = rightMax[i] ;
            int start = i-p1 ;
            int end = p2-i ;
            long subarray = ((long)start%1000000007 * end%1000000007)%1000000007 ;
            sum = (sum%1000000007 + (subarray%1000000007 * A[i]%1000000007)%1000000007)%1000000007 ;

        }
        return (int)((sum+1000000007)%1000000007) ;
    }
    public static int sumOfMin(int[] A){
        int[] leftMin  ;
        leftMin = leftSmallerIndex(A)  ;

        int[] rightMin ;
        rightMin = rigthsmallerindex(A)  ;

        long sum = 0 ;
        for(int i = 0 ; i < A.length ; i++){
            int p1 = leftMin[i] ;
            int p2 = rightMin[i] ;
            int start = i-p1;
            int end = p2-i ;
            long subarray = ((long)start * end) ;
            sum = (sum%1000000007 + (subarray%1000000007 * A[i]%1000000007)%1000000007)%1000000007 ;
        }
        return (int)((sum+1000000007)%1000000007) ;
    }

    public static int[] leftSmallerIndex(int[] A) {
        Stack<Integer> st = new Stack<>() ;
        int n = A.length ;
        int[] ans = new int[n] ;

        for(int i = 0 ; i < n ; i++){
            ans[i] = -1 ;
        }
        for(int i = 0 ; i < n  ; i++){
            while(st.size() > 0 && A[st.peek()] >= A[i]){
                st.pop() ;
            }
            if(st.size() > 0){
                ans[i] = st.peek() ;
            }
            st.push(i) ;
        }
        return ans ;
    }
    public static int[] rigthsmallerindex(int[] A) {
        Stack<Integer> st = new Stack<>() ;
        int N = A.length ;
        int[] ans = new int[N] ;

        for(int i = 0 ; i < N ; i++){
            ans[i] = N ;
        }
        for(int i = N-1 ; i >= 0  ; i--){
            while(st.size() > 0 && A[st.peek()] >= A[i]){
                st.pop() ;
            }
            if(st.size() > 0){
                ans[i] = st.peek() ;
            }
            st.push(i) ;
        }
        return ans ;
    }
    public static int[] leftGreaterIndex(int[] A){
        Stack<Integer> st = new Stack<>() ;

        int[] ans = new int[A.length] ;
        for(int i = 0 ; i < A.length ;i++){
            ans[i] = -1 ;
        }
        for(int i = 0 ;i < A.length ;i++){
            while(st.size() > 0 && A[st.peek()] <= A[i] ){
                st.pop();
            }
            if(st.size() > 0){
                ans[i] = st.peek() ;
            }
            st.push(i) ;
        }
        return ans ;
    }
    public static int[] rightGreaterIndex(int[] A){
        Stack<Integer> st = new Stack<>() ;

        int[] ans = new int[A.length] ;
        for(int i = 0 ; i < A.length ;i++){
            ans[i] = A.length ;
        }
        for(int i = A.length-1 ;i >= 0 ;i--){
            while(st.size() > 0 && A[st.peek()] <= A[i] ){
                st.pop();
            }
            if(st.size() > 0){
                ans[i] = st.peek() ;
            }
            st.push(i) ;
        }
        return ans ;
    }
}
