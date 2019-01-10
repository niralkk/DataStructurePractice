//387. First Unique Character in a String
//        Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
//
//        Examples:
//
//        s = "leetcode"
//        return 0.
//
//        s = "loveleetcode",
//        return 2.
//        Note: You may assume the string contain only lowercase letters.


import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class firstUniqueCharacter {

    public static void main(String[] args) {
        System.out.println(firstUniqChar("anagram"));
    }

    public static int firstUniqChar(String s) {
        LinkedHashSet<Character> lhs = new LinkedHashSet<>();
        HashSet<Character> hs = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (lhs.contains(ch)) {
                lhs.remove(ch);
                hs.add(ch);
            } else if (!hs.contains(ch)) {
                lhs.add(ch);
            }
        }
        char fnp = '\u0000';
        Iterator<Character> it = lhs.iterator();
        if (it.hasNext())
            fnp = it.next();
        int index = -1;
        for (int i = 0; i < s.length(); i++) {
            if (fnp == s.charAt(i)) {
                index = i;
                break;
            }
        }
        return index;
    }
}
