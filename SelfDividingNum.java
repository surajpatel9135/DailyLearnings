// LeetCode Problem - 728 (self dividing number):-

// A self-dividing number is a number that is divisible by every digit it contains.

// For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
// A self-dividing number is not allowed to contain the digit zero.

// Given two integers left and right, return a list of all the self-dividing numbers in the range [left, right] (both inclusive).

 

// Example 1:

// Input: left = 1, right = 22
// Output: [1,2,3,4,5,6,7,8,9,11,12,15,22]
// Example 2:

// Input: left = 47, right = 85
// Output: [48,55,66,77]
 

// Constraints:

// 1 <= left <= right <= 104

import java.util.*;
public class SelfDividingNum {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> List = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            if(isSelfDividing(i)) {
                List.add(i);
            }
        }
        return List;
    }
    public static boolean isSelfDividing(int num) {
        int temp = num;

        while(temp > 0) {
            int digit = temp % 10;

            if(digit == 0 || num % digit != 0) {
                return false;
            }

            temp /= 10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number: ");
        int left = sc.nextInt();

        System.out.println("Enter Second number: ");
        int right = sc.nextInt();

        System.out.println("Self dividing numbers List: "+selfDividingNumbers(left, right));

    }
}