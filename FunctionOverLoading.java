/*
-- Function Overloading:- 
-- function overloading means we can create functions with same name but the number of perameter, 
   type of paremeter, and order of parameter is different.

-- in this example we will see function OverLoading.....
*/

public class FunctionOverLoading {
    public static void main(String[] args) {
        System.out.println("Sum of 1st fun: "+sum(4, 7));
        System.out.println("Sum of 2st fun: "+sum(18, 12, 23));
        System.out.println("Sum of 3st fun: "+sum(23, 54));
        
        greet("Suraj", 23);
        greet(32, "Suman");
    }

    // here we have created a function named sum with two parameter a and b.
    // this function add two numbers and return result to the main function.
    static int sum(int a, int b) {
        return (a + b);
    }

    // here we have created a function with same name but the number of parameter is different.
    // this function add three numbers and return result to the main function.
    static int sum(int a, int b, int c) {
        return (a + b + c);
    }

    // here i have created another function with same name but the parameter order is different.
    // this function add two numbers and return result to the main function.
    static int sum(long b, long a) {
        return (int) (a + b);
    }

    // here i have created a function named greet() with two parameter.
    // name and age
    static void greet(String name, int age) {
        System.out.println("Hey, I am "+name+". and I am "+age+" year old.");
    }

    // here i have created a function named greet() with two parameter.
    // age and name
    static void greet(int age, String name) {
        System.out.println("Hey, I am "+name+". and I am "+age+" year old.");
    }

    /*
    -- if i create a function with same name without any changes like avery thing common in both function
    then it will give compile time error.


    static void print() {
        System.out.println("Hi I am suraj");
    }

    static int print() {
        System.out.println("Hi I am suraj");
        return 5;
    }

    -- here both function has no parameter but the difference is return type but still incorrect.
    because compiler get confused here, he says what function calling you in main function.

*/
}