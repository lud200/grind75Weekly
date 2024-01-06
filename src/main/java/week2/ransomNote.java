package week2;

/***
 * Given two strings ransomNote and magazine,
 * return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
 *
 * Each letter in magazine can only be used once in ransomNote.
 *
 * Example 1:
 *
 * Input: ransomNote = "a", magazine = "b"
 * Output: false
 * Example 2:
 *
 * Input: ransomNote = "aa", magazine = "ab"
 * Output: false
 */
public class ransomNote {
    public static void main(String[] args) {
        String ransomNote = "a", magazine = "b";
        System.out.println(canConstruct(ransomNote, magazine));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;

        int[] index = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            index[magazine.charAt(i) - 'a']++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            if (index[ransomNote.charAt(i) - 'a'] == 0) return false;
            index[ransomNote.charAt(i) - 'a']--;
        }
        return true;
    }
}
