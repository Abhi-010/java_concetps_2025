package scaler_questions.Scaler;

public class CheckBit {
    public static void main(String[] args){

        int[][] arr = {{1, 2},
                {1,2,3}, {3,10,11,12,17}

        };

        //String str1 = "tutorials", str2 = "point";
        // comparing str1 and str2
        //int retval = str1.compareTo(str2);
        //System.out.println(retval);
        // prints the return value of the comparison
       /* if (retval < 0) {
            System.out.println("str1 is greater than str2");
        } else if (retval == 0) {
            System.out.println("str1 is equal to str2");
        } else {
            System.out.println("str1 is less than str2");
        }
*/



        //System.out.println(check(0,5));
    }
    static boolean check(int j, int i){
        if( ((1<<j) & i) != 0){
            return  true ;
        }
        return false ;
    }
}
