package recursion;

public class recursionfactorial {
    public static int factorial(int fact, int i, int n) {
        if (i == n) {
            fact *= i;
            return fact;
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        fact *= i;
        return factorial(fact, i + 1, n);
    }

    public static void main(String[] args) {
        int answer = factorial(1, 1, 1);
        System.out.println(answer);
    }
}
