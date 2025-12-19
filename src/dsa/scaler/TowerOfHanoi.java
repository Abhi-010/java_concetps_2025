package scaler_questions.Scaler;

public class TowerOfHanoi {
    public static void main(String[] args){
        int N = 6;
        int count = 0 ;
        TOH(N,'A','C','B' ) ;
    }

    static void TOH(int N,char src, char dest, char inter){
        if(N == 1){
            System.out.println("Move from "+ src + " to " + dest) ;
            return ;
        }
        TOH(N-1,src, inter,dest);
        TOH(1, src, dest,inter) ;
        TOH(N-1, inter, dest,src) ;
    }
}
