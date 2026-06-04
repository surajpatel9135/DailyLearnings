import java.util.*;
public class BubbleSort {
    public static void bubbleSort (int[] arr, int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Here we take input from user for Array's Length.
        System.out.println("Enter size of Array: ");
        int n = sc.nextInt();

        // Here we declare an array of size n.
        int[] arr = new int[n];
        System.out.println("Enter Array's Elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Here we Print our Original Array (before sorting).
        System.out.println("Original Array: "+Arrays.toString(arr));

        // Here we call the bubbleSort function.
        bubbleSort(arr, n);

        // Here we Printing our array after sorted.
        System.out.println("Original Array: "+Arrays.toString(arr));
    }
}