package scaler_questions.Scaler;

import java.util.Arrays;
import java.util.Stack;

public class CheckTwoBracketExp {
    public static void main(String[] args) {
        //String A = "-(a+((b-c)-(d+e)))"
        String A = "-(-(-(-a+b)-d+c)-q)" ;
        String B = "a-b-d+c+q" ;
        //String B = "a-b-d+c+q" ;
        String s1 = RemoveBrackets(A);
        String s2 = RemoveBrackets(B);
        System.out.println(s1);
        System.out.println(s2);

        // for String A
        int[] array = new int[27];
        Arrays.fill(array,0);

        for(int i = 0 ; i < s1.length() ; i++){
            char ch = s1.charAt(i);
            if(ch >= 97 && ch <= 122){
                System.out.println("value of i" + i);
                if(i == 0){
                    array[s1.charAt(i) - 96] = 1 ;
                }
                else{
                    if(s1.charAt(i-1) == '-'){
                        array[s1.charAt(i) - 96] = -1 ;

                    }
                    else{
                        array[s1.charAt(i) - 96] = 1 ;
                    }
                }
            }
        }

        //for string B
        int[] array1 = new int[27];
        Arrays.fill(array1,0);
        for(int i = 0 ; i < s2.length() ; i++){
            char ch = s2.charAt(i);
            if(ch >= 97 && ch <= 122){
                if(i == 0){
                    array1[s2.charAt(i) - 96] = 1 ;
                }
                else{
                    if(s2.charAt(i-1) == '-'){
                        array1[s2.charAt(i) - 96] = -1 ;
                    }
                    else{
                        array1[s2.charAt(i) - 96] = 1 ;
                    }
                }
            }
        }

        for(int i = 1 ; i < 27 ; i ++){
            if(array[i] != array1[i]){
                System.out.println("return 0");
            }
        }
        System.out.println("return 1");
    }
    public static String RemoveBrackets(String A) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        int N = A.length();
        for (int i = 0; i < N; i++) {
            char ch = A.charAt(i);
            if (ch != ')') {
                s1.push(ch);
            } else {
                while (!s1.empty() && s1.peek() != '(') {
                    s2.push(s1.pop());
                }
                s1.pop();
                boolean flag = true;
                if (!s1.empty() && s1.peek() == '-') {
                    while (!s2.empty()) {
                        if (flag == true && s2.peek() == '-') {
                            s1.pop();
                            s2.pop();
                            s1.push('+');
                            continue;
                        }
                        flag = false;
                        if (s2.peek() == '-') {
                            s1.push('+');
                            s2.pop();
                        } else if (s2.peek() == '+') {
                            s1.push('-');
                            s2.pop();
                        } else {
                            s1.push(s2.pop());
                        }
                    }
                    flag = true;
                }
                else{
                    while(!s2.empty()){
                        s1.push(s2.pop());
                    }
                }
            }
        }

        while (!s1.empty()) {
            s2.push(s1.pop());
        }

        StringBuilder s = new StringBuilder();
        while (!s2.empty()) {
            s.append(s2.pop());
        }
        return s.toString();
    }
}
