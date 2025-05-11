package IBSInterview;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String answer = "";
        String[] strs = {"flower","flw", "floor"};
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        for( int i=0; i < first.length(); i++) {
            if (first.charAt(i) == last.charAt(i)) {
                answer = answer+first.charAt(i);
            } else {
                break;
            }
        }
        System.out.println(answer);
    }
}
