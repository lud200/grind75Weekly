package week1;

/***
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 *
 * Example 1:
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * Example 2:
 *
 * Input: s = "rat", t = "car"
 * Output: false
 */
public class validAnagram {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        int m = s.length(), n = t.length();
        if (m != n) return false;

        final int NOCHARS = 26;
        int[] index = new int[NOCHARS];

        for (int i = 0; i < m; i++) {
            index[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < n; i++) {
            index[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < NOCHARS; i++) {
            if (index[i] != 0) return false;
        }

        return true;
    }
}
