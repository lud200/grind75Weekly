package week8;

/***
 * 1347. Minimum Number of Steps to Make Two Strings Anagram
 * Medium
 * Topics
 * Companies
 * Hint
 * You are given two strings of the same length s and t. In one step you can choose any character of t and replace it with another character.
 *
 * Return the minimum number of steps to make t an anagram of s.
 *
 * An Anagram of a string is a string that contains the same characters with a different (or the same) ordering.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "bab", t = "aba"
 * Output: 1
 * Explanation: Replace the first 'a' in t with b, t = "bba" which is anagram of s.
 * Example 2:
 *
 * Input: s = "leetcode", t = "practice"
 * Output: 5
 * Explanation: Replace 'p', 'r', 'a', 'i' and 'c' from t with proper characters to make t anagram of s.
 * Example 3:
 *
 * Input: s = "anagram", t = "mangaar"
 * Output: 0
 * Explanation: "anagram" and "mangaar" are anagrams.
 *
 */
public class minStepsForAnagram {
    public static void main(String[] args){
        minMoves("bab", "aba");
    }
    public static int minMoves(String s, String t){
        if(s.length()!=t.length()) return 0;

        int[] index1 = new int[26];
        int count = 0;

        for(int i=0;i<s.length();i++){
            index1[s.charAt(i)-'a']++;
        }

        for(int i=0;i<t.length();i++){
            if(index1[t.charAt(i)-'a']>0){
                index1[t.charAt(i)-'a']--;
                count++;
            }
        }

        count = s.length()-count;
        System.out.println(count);
        return count;
    }
}
