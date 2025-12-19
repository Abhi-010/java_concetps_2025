package scaler_questions.Scaler;

public class ReplicatingSubstring {
    public static void main(String[] args){
        System.out.println(solve(2,"aaab"));
    }

    static int solve(int A, String B) {

        if(B.length() % A != 0){
            return -1 ;
        }

        int[] arr = new int[26] ;
        String res = "";
        for(int i = 0 ; i< B.length() ;i++){
            arr[B.charAt(i) - 97]++ ;
        }

        for(int i = 0 ; i < 26 ; i++){
            if(arr[i] != 0){
                int k = arr[i];

                while(k != 0){
                    res = res + (char)(97+ i);
                    k-- ;
                }
            }
        }
        System.out.println(res);
        for(int i = 0 ; i < res.length() ;i++ ){
            int k = A ;
            while(k > 1){
                if(res.charAt(i) != res.charAt(i+1)){
                    return -1 ;
                }
                i++;
                k--;
            }
        }
        return 1 ;

    }
}
