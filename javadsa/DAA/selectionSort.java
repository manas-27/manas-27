import java.util.*;

// In selection sort we pick the smallest element and and arrange them accordingly
public class selectionSort {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // time complexity = O(n^2)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int small = i; // initializing first index as smallest index
            for (int j = i + 1; j < n; j++) {
                if (arr[small] > arr[j]) { // if element at j is smallest then make index j as smallest
                    small = j;
                }
            }
            int temp = arr[small]; // Swapping the smallest element at start
            arr[small] = arr[i];
            arr[i] = temp;
        }
        sc.close();
        printArray(arr);
    }
}
