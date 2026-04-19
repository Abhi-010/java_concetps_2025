package leetcode_contest_5_april_2026;
import java.util.* ;

public class MirrorFreqDistance {
    public static void main(String[] args) {
        int ans = mirrorFrequency("363");
        System.out.println(ans);
    }


    public static int mirrorFrequency(String s) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        int n = s.length();

        for(int i = 0  ; i < n ; i++){
            char curr = s.charAt(i);
            if (map1.containsKey(curr)) {
                map1.put(curr, map1.get(curr) + 1);
            } else {
                map1.put(curr, 1);
            }
        }

        for (int i = 0; i < n; i++) {
            char curr = s.charAt(i);
            char mirror = getMirrorCharacter(curr);
            if(map1.containsKey(mirror)){
                map2.put(mirror,map1.get(mirror));
            }
            else{
                map2.put(mirror,0);
            }
        }

        HashSet<String> set = new HashSet<>();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            char curr = s.charAt(i);
            char mirror = getMirrorCharacter(curr);

            String s1 = curr + "," + mirror;
            String s2 = mirror + "," + curr;

            if (!set.contains(s1) && !set.contains(s2)) {
                if(map1.containsKey(curr) && map2.containsKey(mirror)){
                    ans = ans + Math.abs(map1.get(curr) - map2.get(mirror));
                }
                set.add(s1);
                set.add(s2);
            }
        }
        return ans;

    }

    public static char getMirrorCharacter(char curr) {
        char mirror;
        if (curr >= 97 && curr <= 122) {
            mirror = (char) ('z' - (curr - 'a'));
        } else {
            mirror = (char) (57 - curr);
        }
        return mirror;
    }
}
