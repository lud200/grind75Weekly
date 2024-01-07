package week6;

/***
 * Given a string s, return the longest
 * palindromic substring in s.
 * Example 1:
 *
 * Input: s = "babad"
 * Output: "bab"
 * Explanation: "aba" is also a valid answer.
 * Example 2:
 *
 * Input: s = "cbbd"
 * Output: "bb"
 */
public class longestPalindromicSubstring {
    int maxLen, lo;
    public String longestPalindrome(String s) {
        char[] ch = s.toCharArray();
        int n = ch.length;
        for(int i=0;i<n;i++){
            longUtil(i, i, ch);
            longUtil(i, i+1, ch);
        }

        return s.substring(lo, maxLen+lo);
    }

    public void longUtil(int low, int high, char[] ch){
        while(low>=0 && high<ch.length && ch[low]==ch[high]){
            low--;
            high++;
        }

        if(maxLen<high-low-1){
            maxLen = high-low-1;
            lo = low+1;
        }
    }
}
