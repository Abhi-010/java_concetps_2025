package interviews.epam;

import java.util.ArrayList;
import java.util.List;

public class EpamMain {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("abc","123","9","1abc"));
        List<String> list1 = list.stream().filter(EpamMain::isInt).toList();
        list1.stream().map(String::valueOf).forEach(System.out::println);
    }

    public static boolean isInt(String s){
        int n = s.length();
        for(int i = 0 ; i < n ; i++){
            int charInt = (int)s.charAt(i);
            if(charInt>= 97 && charInt<=122){
                return false;
            }
        }
        return true;
    }
}

/*
public class EpamJava8 {
    public static void main(String[] args) {
        List<String> list = List.of("abc", "123", "9", "1abc");
        List<String> list1 = list.stream()
                                 .filter(EpamJava8::isInt)
                                 .collect(Collectors.toList());
        list1.forEach(System.out::println);
    }

    public static boolean isInt(String s) {
        return s.matches("\\d+");
    }
}
 */
