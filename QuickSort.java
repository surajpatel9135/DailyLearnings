import java.util.*;
public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if(low < high) {
            int pivot = arr[high];
            int i = low - 1;

            for(int j = low; j < high; j++) {
                if(arr[j] <= pivot) {
                    i++;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            int pivotIndex = i + 1;
            int temp = arr[pivotIndex];
            arr[pivotIndex] = arr[high];
            arr[high] = temp;

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of Array: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Before Sorted: "+Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Before Sorted: "+Arrays.toString(arr));
    }
}