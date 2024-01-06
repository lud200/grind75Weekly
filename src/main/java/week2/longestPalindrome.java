package week2;

/***
 * Given a string s which consists of lowercase or uppercase letters,
 * return the length of the longest palindrome that can be built with those letters.
 *
 * Letters are case-sensitive, for example, "Aa" is not considered a palindrome here.
 */

public class longestPalindrome {
    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(longestPalindrome(s));
    }

    public static int longestPalindrome(String s) {
        int[] index = new int[26];
        int n = s.length();
        int odd = 0;

        for (int i = 0; i < n; i++) {
            index[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if ((index[i] & 1) == 1) {
                odd++;
            }
        }

        if (odd > 1) {
            n = n - odd + 1;
        }

        return n;
    }

}
