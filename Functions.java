/*
## Function:-
-- A function is a block of code, which helps developer to make code more readable and clean.
-- their are 4 types:-

1. No input no output
-- in which we only write function don't take any types of input.
-- and not return anything.

2. input no output:-
-- we take input but not return output.

3. No input return output:-
-- we don't take input but return output.

4. input return output:-
-- we take input and return output.

*/

// functions make code more readable and also helps to looks clean our code.

import java.util.*;

public class Functions {

    // this is the main method program execute from here.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        greet();
        sayHello("Suraj"); //here we pas arguement
        System.out.println(getNumber());
        System.out.println(sum(10, 14)); // here also pass arguement..
    }

    // no input no output method
    static void greet() {
        System.out.println("Hello");
    }

    // take input but return nothing
    static void sayHello(String name) {
        System.out.println("Hello "+name);
    }

    // take nothing but return output.
    static int getNumber() {
        return 10;
    }

    // take input and also return output.
    static int sum (int a, int b) { // here we pass the parameter..
        return (a + b);
    }
}