package javadsa;

public class bigOfN {
    static void printArray() {
        String[] fruits = { "Mango", "Apple", "Orange" }; // O(1)
        for (int i = 0; i < fruits.length; i++) { // O(n)
            System.out.println(fruits[i]); // O(n)
        }

    }

    public static void main(String[] args) {
        printArray();
    }
}
// O(n)