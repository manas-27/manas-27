package javadsa.recursion;

public class stringreverse {
    public static void printrev(String str, int i) {
        if (i == -1) {
            return;
        }
        System.out.print(str.charAt(i));
        printrev(str, i - 1);
    }

    public static void main(String[] args) {
        String str = "AsimVaibhav";
        printrev(str, str.length() - 1);

    }

}
