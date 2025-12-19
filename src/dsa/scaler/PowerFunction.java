package scaler_questions.Scaler;

public class PowerFunction {

    public static void main(String[] args){
        System.out.println(pow(9,3,5)) ;
    }

    public static int pow(int a, int n,int d) {
        //A - a, B - n, C- d
        if(n == 1) return a ;

        int x = pow(a,n/2,d) ;
        if(n%2==0) return (x*x)%d ;
        else return (x*x*a)%d ;
    }
}
