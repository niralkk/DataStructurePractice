//242. Valid Anagram
//
//        Given two strings s and t , write a function to determine if t is an anagram of s.
//
//        Example 1:
//
//        Input: s = "anagram", t = "nagaram"
//        Output: true
//        Example 2:
//
//        Input: s = "rat", t = "car"
//        Output: false
//        Note:
//        You may assume the string contains only lowercase alphabets.


import java.util.HashMap;

public class validAnagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }

    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int lenS = s.length();
        int lenT = t.length();

        if (lenS != lenT)
            return false;

        for (int i = 0; i < lenS; i++) {
            char ch = s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < lenT; i++) {
            char ch = t.charAt(i);
            if (hm.containsKey(ch) && hm.get(ch) > 0) {
                hm.put(ch, hm.get(ch) - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}
