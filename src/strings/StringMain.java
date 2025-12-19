package strings;

public class StringMain {
    public static void main(String[] args) {
//        String s1 = "z" ;
//        String s2 = "abcdfe" ;
//
//        System.out.println(s1.compareTo(s2));
//        char ch1 = 'd' ;
//        char ch2 = 'a' ;
//        System.out.println(ch1 - ch2);

        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");

        s3 = s2.intern() ;
        if(s2 == s3){
            System.out.println("true");
        }
    }
}
