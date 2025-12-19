package scaler_questions.Scaler;

public class AddBinaryStrings {

    public static void main(String[] args){
        String A = "101" ;
        String B = "11" ;
        System.out.println(addBinary(A,B) );
    }
    static String  addBinary(String A, String B){
        int i = A.length()-1 ;
        int j = B.length()-1 ;
        int carry = 0 ;
        String ans = "" ;

        while(i >= 0 || j >= 0){
            int p = 0 ;
            if(i >= 0 && j>=0){
                p = ((A.charAt(i)-48) + (B.charAt(j)-48) + carry) % 2 ;
                carry = ((A.charAt(i)-48) + (B.charAt(j)-48) + carry) / 2 ;
            }
            else if(i>=0){
                p = (A.charAt(i)-48 + carry) % 2 ;
                carry = (A.charAt(i)-48 + carry) / 2 ;
            }
            else {
                p = (B.charAt(j)-48 + carry) % 2 ;
                carry = (B.charAt(j)-48 + carry) / 2 ;
            }
            ans = ans + p ;
            i-- ;
            j-- ;
        }

        if(carry > 0){
            ans = ans + carry ;
        }
        String ans1 = "" ;
        i=ans.length()-1;
        while(i>=0){
            ans1 = ans1 + ans.charAt(i) ;
            i-- ;
        }
        return ans1 ;
    }
}
