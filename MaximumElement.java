import java.util.*;
public class MaximumElement {
    public static int maxElement(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements for Array: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Maximum Element of the Array is: "+maxElement(arr, n));
    }
}