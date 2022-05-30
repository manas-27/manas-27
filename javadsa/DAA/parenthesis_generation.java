import java.util.*;

public class parenthesis_generation {

    static List<String> generate_parenthesis_combination(int n) {
        List<String> combinations = new ArrayList<>();
        find_solution("", n, n, combinations, n);
        return combinations;
    }

    static void find_solution(String currChar, int o, int c, List<String> combinations, int n){
        if (currChar.length() == 2 * n) {
            combinations.add(currChar);
            return;
        }

        if (o > 0) {
            find_solution(currChar + "(", o - 1, c, combinations, n);
        }
        if (o < c) {
            find_solution(currChar + ")", o, c - 1, combinations, n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n to find parenthesis combinations: ");
        int n = sc.nextInt();

        System.out.println(generate_parenthesis_combination(n));
        sc.close();
    }
}
