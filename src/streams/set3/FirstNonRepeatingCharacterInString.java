//package streams.set3;
//
//import javax.crypto.spec.PSource;
//import java.util.LinkedHashMap;
//import java.util.Map;
//import java.util.Optional;
//import java.util.function.Function;
//import java.util.stream.Collectors;
//
//public class FirstNonRepeatingCharacterInString {
//    public static void main(String[] args) {
//
//        firstNonRepeatingCharacterInString("ab,-cabcabccbaduq");
//    }
//
//    public static Character firstNonRepeatingCharacterInString(String str){
//
//        if(str == null || str.isEmpty()) return null  ;
//
//        Map<Character,Long> map  = str
//                        .chars()
//                        .mapToObj(c->(char)c)
//                        .filter(Character::isAlphabetic)
//                        .collect(Collectors.groupingBy(Function.identity(),()-> new LinkedHashMap<>(),Collectors.counting())) ;
//
//        Optional<Character> characterOptional = str.chars().mapToObj(c->(char)c).filter(c -> map.containsKey(c) ? ).findFirst() ;
//
//
//        System.out.println(characterOptional.isPresent());
//
//        map.forEach((key,value) -> System.out.println(key + ":" + value));
//
//        return  null ;
//
//
//    }
//}
