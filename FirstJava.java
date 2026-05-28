// How to take input from users.

import java.util.*;
public class FirstJava {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        // take input for A.
        int A = sc.nextInt();

        // take input for B.
        int B = sc.nextInt();

        // this statment for printing output.
        System.out.println("A + B: "+ A+B);
    }
}