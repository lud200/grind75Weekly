package week8;

public class removeNonrepeatingCharacter {
    public static void main(String[] args){
        String s = "abbbbbbbbbccdefghe";
        removeSingles(s);
    }

    public static void removeSingles(String s){
        int[] index = new int[26];
        String res = "";

        for(int i=0;i<s.length();i++){
            index[s.charAt(i)-'a']++;
        }

        for(int i=0;i<s.length();i++){
            if(index[s.charAt(i)-'a']==1){
                res = res+s.charAt(i);
            }
        }

        System.out.println(res);
    }
}
