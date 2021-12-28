// Q4 Move all 'x' to the end of the string

package javadsa.recursion;

public class moveChar {
    public static void moveAllX(String str, int i, int count, String newString) {
        char currchar = str.charAt(i);
        if (i == str.length() - 1) {
            for (int j = 1; j <= count; j++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        if (currchar == 'x') {
            count++;
            moveAllX(str, i + 1, count, newString);
        } else {
            newString += currchar;
            moveAllX(str, i + 1, count, newString);
        }
    }

    public static void main(String[] args) {
        String str = "axxdhhxhxxyex";
        moveAllX(str, 0, 0, "");
    }
}
