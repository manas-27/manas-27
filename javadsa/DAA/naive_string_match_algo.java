// Java program for Naive Pattern Searching

import java.util.*;

public class naive_string_match_algo {

    public static void search(String txt, String pat) {
        int M = pat.length();
        int N = txt.length();

        // A loop to slide pat one by one
        for (int i = 0; i <= N - M; i++) {

            int j;

            // For current index i, check for pattern
            for (j = 0; j < M; j++)
                if (txt.charAt(i + j) != pat.charAt(j))
                    break;

            if (j == M)
                System.out.println("Pattern found at index " + i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String txt = sc.nextLine();

        System.out.println("Enter the pattern to find match: ");
        String pat = sc.nextLine();
        search(txt, pat);

        sc.close();
    }
}
