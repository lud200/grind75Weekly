package week7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findAllAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        List<Integer> result = new ArrayList<>();

        if(s.length()<p.length()) return result;

        for(int i=0;i<p.length();i++){
            freq1[s.charAt(i)-'a']++;
            freq2[p.charAt(i)-'a']++;
        }

        int start = 0, end = p.length();

        if(Arrays.equals(freq1, freq2)){
            result.add(start);
        }

        while(end<s.length()){
            freq1[s.charAt(start)-'a']--;
            freq1[s.charAt(end)-'a']++;

            if(Arrays.equals(freq1, freq2)){
                result.add(start+1);
            }

            start++;
            end++;
        }

        return result;
    }
}
