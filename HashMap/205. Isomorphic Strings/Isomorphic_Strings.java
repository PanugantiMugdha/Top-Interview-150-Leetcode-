import java.util.*;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (map.containsKey(c1)) {
                // already mapped, check consistency
                if (map.get(c1) != c2) {
                    return false;
                }
            } else {
                // if c2 already used by another c1 → not isomorphic
                if (map.containsValue(c2)) {
                    return false;
                }
                map.put(c1, c2);
            }
        }
        return true;
    }
}
