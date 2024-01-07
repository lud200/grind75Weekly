package week7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class letterComboPhoneNumber {
    public List<String> letterCombinations(String digits) {

        String[] strs = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        LinkedList<String> lst = new LinkedList<>();
        if(digits.length()<1) return lst;

        lst.add("");

        for(int i=0;i<digits.length();i++){
            int n = Character.getNumericValue(digits.charAt(i));
            while(lst.peek().length() == i){
                String t = lst.remove();
                for(char c:strs[n].toCharArray()){
                    lst.add(t+c);
                }
            }
        }
        return lst;
    }
}
