package scaler_questions.Scaler;

public class IsItIdentityMatrix {
    public static void main(String[] args) {

        int[][] A =
                {
                        {1, 0, 0},
                        {0, 1, 0},
                        {0, 8, 1}
                };
        System.out.println(solve(A));
    }

    static int solve(final int[][] A) {
        int ans = 1;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (i == j) {
                    if (A[i][j] == 0) {
                        ans = 0;
                        break;
                    }
                } else {
                    if (A[i][j] == 1) {
                        ans = 0;
                        break;
                    }
                }
            }
        }
        return ans;
    }
}
