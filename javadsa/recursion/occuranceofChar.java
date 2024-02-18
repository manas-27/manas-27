// Q2 To find first and last occurence of given character in given String

package recursion;

public class occuranceofChar {
    public static int first = -1, last = -1;

    static void firstandLastoccur(String str, int i, char element) {
        if (i == str.length()) {
            System.out.println("First occuence of d is " + first);
            System.out.println("Last occuence of d is " + last);
            return;
        }
        if (str.charAt(i) == element) {
            if (first == -1) {
                first = i;
            } else {
                last = i;
            }
        }
        firstandLastoccur(str, i + 1, element);

    }

    public static void main(String[] args) {
        String str = "fdjfdjdjddjf";
        firstandLastoccur(str, 0, 'd');
    }
}
