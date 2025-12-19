package regex.regular_expression;

public class Main {
    public static void main(String... args) {
        String helloWorld = String.format("%s %s", "Hello","World") ;

        String s = Main.format("%s %s %s", "hello", "world","buddy") ;
        System.out.println(s);

        String test = "yoU'll" ;
        test = test.toLowerCase();
        for(int i = 0 ; i < test.length() ; i++){
            if(test.charAt(i) >= 97 && test.charAt(i) <= 122){

            }
        }
        System.out.println(test.toLowerCase());
    }

    public static String format(String regexp, String ... args){

        int index = 0 ;
        while(regexp.matches(".*%s*.")){
            regexp = regexp.replaceFirst("%s",args[index]) ;
            index++ ;
        }
        System.out.println("regexp : " + regexp);
        return regexp ;
    }
}
