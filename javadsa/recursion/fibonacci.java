package javadsa.recursion;

public class fibonacci {
    public static void printfibo(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        printfibo(b, c, n - 1);
    }

    public static void main(String[] args) {
        int a = 0, b = 1;
        int n = 8;
        System.out.println(a);
        System.out.println(b);
        printfibo(a, b, n - 2);

    }
}
