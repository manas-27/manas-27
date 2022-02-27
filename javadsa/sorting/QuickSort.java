import java.util.*;
public class QuickSort {
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivIndex = partition(arr, low, high);

            quickSort(arr, low, pivIndex - 1);
            quickSort(arr, pivIndex + 1, high);
        }
    }

    static int partition(int [] arr, int low, int high){
        int i = low-1;
        int pivot = arr[high];
        for(int j =low; j<high; j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }

    static void printArray(int [] arr){
        System.out.println("Following is the sorted array");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        quickSort(arr, 0, n-1);
        printArray(arr);
        sc.close();
    }
}
