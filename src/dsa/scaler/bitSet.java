package scaler_questions.Scaler;

public class bitSet {
    public static void main(String[] args){
        int N = 22 ;
        int i = 2 ;

        IsSet(N,i) ;
        int num = Unset(N,i) ;
        System.out.println(num) ;
    }

    static int Unset(int N,int i)
    {


        return N ;
    }
    static void IsSet(int N , int i ){

        if( ((N>>i) & 1) == 1){
            System.out.println("Set") ;
        }
        else
            System.out.println("UnSet") ;
    }
}
