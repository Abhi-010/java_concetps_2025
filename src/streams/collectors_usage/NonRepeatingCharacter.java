package streams.collectors_usage;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatingCharacter {
    
    public static void main(String[] args) {
        String str = "abacabad";
        char firstNonRepeatingChar = findFirstNonRepeatingCharacter(str);
        System.out.println("First non-repeating character: " + firstNonRepeatingChar);
    }

    public static Character findFirstNonRepeatingCharacter(String str) {
        LinkedHashMap<Character, Long> collect = str.toLowerCase().chars().mapToObj(c -> (char) c)
                .filter(Character::isLetterOrDigit)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        return str.toLowerCase().chars().mapToObj(c -> (char)c)
                .filter(c -> {
                        Character lowerCh = Character.toLowerCase((char) c);
                        return collect.containsKey(lowerCh) && collect.get(lowerCh) == 1;
                }).findFirst().orElse(null) ;
    }
}
