package week8;

public class countAndSay {
    public static void main(String[] args){
        int n = 5;
        System.out.println(countAndSay(n));
    }

    public static String countAndSay(int n){
        String s = "1";
        for(int i = 1; i < n; i++){
            s = countIdx(s);
        }
        return s;
    }

    public static String countIdx(String s){
        StringBuilder sb = new StringBuilder();
        char c = s.charAt(0);
        int count = 1;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == c){
                count++;
            }
            else
            {
                sb.append(count);
                sb.append(c);
                c = s.charAt(i);
                count = 1;
            }
        }
        sb.append(count);
        sb.append(c);
        return sb.toString();
    }
}
