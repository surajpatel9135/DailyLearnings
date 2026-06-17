/*
# Recursion:- 

-- Recursion is a function that call itself.
-- Means a function call itself to solve bigger problem into same same problem but with smaller input, and every Recursion has two things first one is base condition and second one is recursive call.

-- basr condition is a condition that save our code from infinite loop.
-- recursive call is call itself recursively means again and again.

-- These two things are very important for recursion.

-- Example:-
            factorial of a number.:
        n = 5;
        fun(n) {
            if(n == 0)  return 1;
            int ans = n * fun(n-1);

        }

            5 * fun(4); // 5 * 24 is 120 final ans;
                    |
                    |
                    4 * fun(3); // 4 * 6 is 24 and return back.
                        |
                        |
                        3 * fun(2);// 3 * 2 is 6 and return back.
                            |
                            |
                            2 * fun(1); // 1 * 2 it will be 2 and return back.
                                |
                                | 
                                1 * fun(0); // according to the base case ti will return 1 and 1 * 1 it will be 1 and return back to fun(1).

# why recursion:-
-- Recursion is needed in every case where we talk about tree data structure, graph, and backtracking etc.
-- so this is very important to learn recursion.
-- recursion i not any type of data structure, it is an algorithm which is use to solve multiple problems and especially dp.

patterns of recursion:-

1. Linear recursion
2. Divide and conquer recursion
3. multiple recursion string
etc..

*/

import java.util.*;

// this problem is Linear recursion.
public class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = fun(n);
        System.out.println("Factorial of n: "+ans);
    }

    static int fun(int n) {
        if(n == 0) {
            return 1;
        }
        int ans = n * fun(n-1);
        return ans;
    }
}