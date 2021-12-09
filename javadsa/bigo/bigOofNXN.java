package javadsa.bigo;

public class bigOofNXN {
    static void multiArray() {
        for (int i = 1; i <= 5; i++) { // O(n)
            for (int j = 1; j <= 5; j++) { // O(n)
                System.out.print(i + "" + j + " ");
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        multiArray();

    }
} // for nested loops O(n*n) = O(n^2)