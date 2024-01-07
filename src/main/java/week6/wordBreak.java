package week6;

import java.util.List;

/***
 * Given a string s and a dictionary of strings wordDict,
 * return true if s can be segmented into a space-separated sequence of one or more dictionary words.
 *
 * Note that the same word in the dictionary may be reused multiple times in the segmentation.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "leetcode", wordDict = ["leet","code"]
 * Output: true
 * Explanation: Return true because "leetcode" can be segmented as "leet code".
 * Example 2:
 *
 * Input: s = "applepenapple", wordDict = ["apple","pen"]
 * Output: true
 * Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
 * Note that you are allowed to reuse a dictionary word.
 */
public class wordBreak {

    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] visited = new boolean[n+1];
        visited[0] = true;

        for(int i=0;i<=n;i++){
            for(String word:wordDict){
                if(word.length()<=i
                && visited[i-word.length()]
                && s.substring(i-word.length(), i).equals(word)){
                    visited[i] = true;
                }
            }
        }

        return visited[n];
    }
}
