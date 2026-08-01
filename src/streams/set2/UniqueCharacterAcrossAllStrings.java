package streams.set2;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueCharacterAcrossAllStrings {
    public static void main(String[] args) {
        String str = "Java is a Programming Languague !" ;

        // 1. Convert this into character
        // 2. filter out everything except letters
        // 3. collect in a set

        Set<Character> set = str.chars().mapToObj(ch-> (char)ch)
                .filter(Character::isAlphabetic)
                .collect(Collectors.toSet()) ;

        List<Character> list1 = str.chars().mapToObj(ch-> (char)ch)
                .filter(Character::isAlphabetic)
                .distinct().collect(Collectors.toList());


        System.out.println("set : " + set);
        System.out.println("list : " + list1);
    }
}
