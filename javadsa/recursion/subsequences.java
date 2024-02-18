// Q6 To print subsequences of a given string

package recursion;

public class subsequences {

    public static void printSubsequence(String str, int i, String newString) {
        if (i == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(i);
        // if char wants to be part of subsequence
        printSubsequence(str, i + 1, newString + currChar);

        // if char does not want to be part of subsequence

        printSubsequence(str, i + 1, newString);
    }

    public static void main(String[] args) {
        String str = "abc";
        printSubsequence(str, 0, "");
    }
}
// Time complexity is O(2^n)