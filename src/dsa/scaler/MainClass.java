package scaler_questions.Scaler;

public class MainClass {

    public static void main(String[] args){

        addBinary("110100001010010000110110100001","100100111000111011110011011111111001101011111110101011001111110110001101010001011110011") ;

    }
    public static void  addBinary(String A, String B) {

        int N1 = A.length() ;
        int N2 = B.length() ;

        int i = N1 - 1 ;
        int j = N2 - 1 ;


        //String result = "";
        StringBuilder result = new StringBuilder();

        int sum = 0 ;
        int carry = 0 ;
        while(i > - 1 && j > -1){
            sum = ( (A.charAt(i) - 48) + (B.charAt(j) - 48) + carry) % 2 ;
            carry = ( ((A.charAt(i) - 48) + (B.charAt(j)-48) + carry) / 2 ) ;
            //result = result + sum ;
            result.append(sum) ;
            i-- ;
            j-- ;
        }
        while(j>-1){
            sum = ( (B.charAt(j) - 48) + carry) % 2 ;
            carry = ( ((B.charAt(j) - 48) + carry)  / 2 ) ;
            //result = result + sum ;
            result.append(sum) ;
            j-- ;

        }
        //System.out.println(result) ;
        while(i>-1){
            sum = ( (A.charAt(i) - 48) + carry) % 2 ;
            carry = ( ((A.charAt(i) - 48) + carry)  / 2 ) ;
            //result = result + sum ;
            result.append(sum) ;
            i-- ;
        }
        if(carry == 1){
            //result = result + 1;
            result.append(1) ;
        }
       //    String result1 = "" ;
        StringBuilder result1 = new StringBuilder() ;
        for(int k = result.length() - 1 ; k > -1 ; k--){
            //result1 = result1 + result.charAt(k)  ;
            result1.append(result.charAt(k)) ;
        }
        System.out.println(result1)  ;
    }

}
