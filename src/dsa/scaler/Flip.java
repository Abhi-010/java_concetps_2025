package scaler_questions.Scaler;

public class Flip {
    public  static void main(String[] args){
        String A = "111";
        int[] ans = flip(A);
        System.out.println(ans[0] + " " + ans[1]);

    }
    static int[] flip(String A){
        int N = A.length();
        int[] ar = new int[N];

        for(int i = 0 ;i < N ; i++){
            if(A.charAt(i) == '1'){
                ar[i] = -1;
            }
            else{
                ar[i] = 1;
            }
        }

        int sum = 0;
        int ans = Integer.MIN_VALUE;

        int l = -1;
        int r = -1;
        boolean first_update = true;

        for(int i = 0; i < N ;i++){
            sum = sum + ar[i];
            if(sum > ans){
                if(first_update == true){
                    ans = sum ;
                    l = i;
                    r = i;
                    first_update = false;
                }
                else{
                    ans = sum ;
                    r = i;
                }
            }

            if(sum < 0){
                first_update = true;
                sum = 0;
            }
        }
        int[] res = new int[2];
        if(r != -1){
            res[0] = l+1;
            res[1] = r+1;
            return res;
        }
        System.out.println("you r here...");
        return new int[0];
    }
}
