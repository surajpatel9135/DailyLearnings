/*

## Array:- 
-- Array is a linear data structure.
-- it si a collection of similar types of data.
-- it is stored data in the form contigeous.
-- Array is 0 based-indexed.(array always start with index 0).
-- the name of Array is address of its first element.

## How to declare an array:-

-- int[] arr; // here we declare it.

-- int[] arr = new int[size]; // here we define it.

## its types:-

-- 1-D array (one dimensional array):-
-- we use array_name.length to get its length.
-- it is looks like a single line. 
    ______________________
-- [___|____|_____|______]
    0    1     2     3

-- 2-D array (two dimensional array):-

-- it is looks like a matrix.
-- int[][] arr = new int[size][size];
-- in which two square brackets needed.

     _0_____1______2__
-- 0|____|_____|______|             
   1|____|_____|______|
   2|____|_____|______|
   3|____|_____|______|
   4|____|_____|______|

*/
// Example:-
import java.util.*;
public class Arrays {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size: ");

        // here we are going to declare size variable for array size;
        // and also read input from user or command line.
        int size = sc.nextInt();

        // here i am going to declare an array;
        int[] arr = new int[size]; // this is 1-D Array.

        System.out.println("Enter the elements: ");
        // this loop will helps to enter the values in it.
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // here i am going to declare 2-D Array.
        int[][] matrix = new int[size][size];

        System.out.println("Enter the elements: ");
        for(int i = 0; i < size; i++) { // outer loop helps take input for rows.
            for(int j = 0; j < size; j++) { // iner loop helps to take input for columns.
                matrix[i][j] = sc.nextInt();
            }
        }
        
        // for display the array on the screen.
        System.out.println("1-D Array: " + java.util.Arrays.toString(arr));
        System.out.println("2-D Array: " + java.util.Arrays.deepToString(matrix));
        
    }
}