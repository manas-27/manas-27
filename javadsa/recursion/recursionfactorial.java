package javadsa.recursion;

public class recursionfactorial {
    public static void factorial(int fact, int i, int n) {
        if (i == n) {
            fact *= i;
            System.out.println(fact);
            return;
        }
        fact *= i;
        factorial(fact, i + 1, n);
    }

    public static void main(String[] args) {
        factorial(1, 1, 5);
    }
}
