package scaler_questions.Scaler;

public class RectanglesOverlap {
    public static void main(String[] args){
        int A = 60;
        int B = 65 ;
        int C = 99 ;
        int D = 84 ;
        int E = 85, F = 24 ,G = 99 ,H = 84 ;

        System.out.println(solve(A,B,C,D,E,F,G,H)) ;
    }

    static int solve(int A, int B, int C, int D, int E, int F, int G, int H){

        if(  (H > B && H < D) || (F > B && F < D)  )
        {
            if( (E > A && E < C) || (G > A && G < C) ){
                return 1 ;
            }
        }

        if( (D > F && D < H) || (B > F && B < H)){

            if(( A > E && A < G) || ( C > E && C < G )  ){
                return 1 ;
            }
        }
        return 0 ;
    }
}
