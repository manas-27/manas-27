// Q5 To remove all the duplicates from the given string

package javadsa.recursion;

public class noDuplication {
    public static boolean[] map = new boolean[26];

    public static void removeDuplicate(String str, int i, String newString) {
        if (i == str.length()) {
            System.out.println(newString);
            return;
        }
        char currchar = str.charAt(i);
        if (map[currchar - 'a']) {
            removeDuplicate(str, i + 1, newString);
        } else {
            newString += currchar;
            map[currchar - 'a'] = true;
            removeDuplicate(str, i + 1, newString);
        }
    }

    public static void main(String[] args) {
        String str = "axxdhhxhxxyex";
        removeDuplicate(str, 0, "");
    }
}
