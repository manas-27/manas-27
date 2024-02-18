// Q7 To print unique subsequences of a given string

package recursion;

import java.util.*;

public class subsequences1 {

    public static void printuniqueSubsequence(String str, int i, String newString, HashSet<String> set) {
        if (i == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }

        }
        char currChar = str.charAt(i);
        // if char wants to be part of subsequence
        printuniqueSubsequence(str, i + 1, newString + currChar, set);

        // if char does not want to be part of subsequence

        printuniqueSubsequence(str, i + 1, newString, set);
    }

    public static void main(String[] args) {
        String str = "aaaaa";
        HashSet<String> set = new HashSet<>();
        printuniqueSubsequence(str, 0, "", set);
    }
}