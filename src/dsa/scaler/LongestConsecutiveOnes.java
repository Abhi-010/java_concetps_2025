package scaler_questions.Scaler;

public class LongestConsecutiveOnes {
    public static void main(String[] args){
        String A = "111" ;
        System.out.println(solve(A));
    }
    static int solve(String A ){
        int n = A.length() ;

        int[] PS = new int[n] ;
        int[] SS = new int[n] ;

        if(A.charAt(0) == '1'){
            PS[0] = 1 ;
        }
        else {
            PS[0] = 0 ;
        }

        for(int i = 1 ; i < n ; i++){

            if(A.charAt(i) != '0'){
                PS[i] = PS[i-1] + 1 ;
            }
            else {
                PS[i] = 0 ;
            }
        }

        for(int i = 0 ; i < n ; i++){
            System.out.print(PS[i] + " ") ;
        }
        System.out.println() ;

        if(A.charAt(n-1) == '1'){
            SS[n-1] = 1 ;
        }
        else {
            SS[n-1] = 0 ;
        }


        for(int i = n-2 ; i >=0 ; i--){
            if(A.charAt(i) != '0'){
                SS[i] = SS[i+1] + 1 ;
            }
            else{
                SS[i] = 0 ;
            }
        }

        for(int i = 0 ; i < n ; i++){
            System.out.print(SS[i] + " ") ;
        }
        System.out.println() ;
        int count_of_one = 0 ;
        for(int i = 0 ; i < n ; i++){
            if(A.charAt(i) == '1'){
                count_of_one++ ;
            }
        }
        int longestSum = Integer.MIN_VALUE ;
        for(int i = 0 ; i < n ; i++){
            int sum = 0 ;
            if(PS[i] == 0  && i  == 0) {
                sum = SS[i+1] ;
            }
            else if(PS[i] == 0 && i == n-1) {
                sum = PS[i - 1];
            }
            else if(PS[i] == 0){
                sum = PS[i - 1] + SS[i + 1];
            }
            if(longestSum < sum){
                longestSum = sum ;
            }
        }

        if(longestSum < count_of_one){
            longestSum++ ;
        }
        return longestSum ;
    }

}
