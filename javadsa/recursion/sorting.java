// Q3 To check whether given array is sorted or not(Strictly increasing)

package javadsa.recursion;

public class sorting {
    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] < arr[i + 1]) {
            return isSorted(arr, i + 1);
        } else {
            return false;
        }
    }

    // optimized solution for same question

    public static boolean isSortedoptimized(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] >= arr[i + 1]) {
            return false;
        }
        return isSortedoptimized(arr, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 5 };
        System.out.println(isSorted(arr, 0));
        System.out.println(isSortedoptimized(arr, 0));
    }
}
