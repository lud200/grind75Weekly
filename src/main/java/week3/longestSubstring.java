package week3;

import java.util.Arrays;

/***
 * Given a string s, find the length of the longest
 * substring
 *  without repeating characters.
 * Example 1:
 *
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 *
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 *
 */
public class longestSubstring {
    public static void main(String[] args){
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {

        int i = 0, res = 0;
        int[] index = new int[256];
        Arrays.fill(index, -1);

        for(int j=0;j<s.length();j++){
            i = Math.max(i, index[s.charAt(j)]+1);
            res = Math.max(res, j-i+1);
            index[s.charAt(j)] = j;
        }

        return res;

    }
}
