package week2;

/***
 * The question is asking for a function that returns a number based on how many times “BALLOON”
 * is being removed from S, the input string.
 * All that matters is that all the letters in “BALLOON” are there,
 * it doesn’t matter if they are in order.
 * If all the letters in “BALLOON” are removed once, the function should return 1,
 * and if they are removed twice, it should return two, etc.
 */
public class balloonProblem {
    public static void main(String[] args) {
        String s = "BAOOLLNNOLOLGBAX";
        int[] index = new int[26];
        int counter = 0, returnCounter = 0;

        String balloon = "BALLON";
        for (int i = 0; i < balloon.length(); i++) {
            index[balloon.charAt(i) - 'A']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (index[s.charAt(i) - 'A'] > 0) {
                index[s.charAt(i) - 'A']--;
                counter++;
            }
        }
        System.out.println(counter);

        if (counter == 7) {
            returnCounter++;
        }
        System.out.println(returnCounter);
    }
}
