package scaler_questions.Scaler;

public class CountTotalBits_2 {
    public static void main(String[] args) {
        int A = 12 ;
        System.out.println(solve(A));

    }
    public static int solve(int A) {
        int totalCount = 0 ;
        // A = 12
        totalCount = (A+1)/2;
        for(int i = 1 ; i < 32 ; i++){
            int freq = (int)Math.pow(2,i);
            int p = (A+1)/freq ;
            totalCount = totalCount + freq * (p/2);
            if((p&1) == 1 && i > 1){
                totalCount = totalCount + (A+1)%freq;
            }
        }
        return totalCount ;
    }
}
