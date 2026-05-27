/*

# OPERATORS IN JAVA: 

--> OPEARTORS ARE SPECIAL SYMBOLS THAT HELP TO PERFORM SOME OPERATIONS ON VARIABLES LIKE ADDITION, etc....

its types:-
1. Arithematic Operator
--> it help to perform mathematical operations.
like addition, subtraction, multiplication, etc..

EX:- a + b, a - b, a * b, a / b, etc.

2. comparison operators:- 
--> it help to compare to variable's values.
--> it is also known as relational operators.
like ==, !=, <=, >=, <, >.

EX:- a < b, a == b, a < b, a != b, etc.

3. logical operators:
--> it is used to perform logical operation.
--> &&, ||, !.
--> it is used in conditional flow statements.

4. Assignments operators:
--> it is used assign the values to the variables.
like =, +=, -=, *=, /=, %=.
--> simple assignment operator is = only.

--> +=, -=, *=, /=, %= these operators are compound operators that help to perform an operation and then assign the values to variabl.
 EX:-  a = 5, b = 14;
       a += b;
       a = 19
*/

// let's learn practically about all types of operators.

import java.util.*;

public class Operators {
    public static void main(String[] args) {
        
        // when we take input from users then we have to write it.
        Scanner sc = new Scanner(System.in);

        // here we initialize variables;
        System.out.println("Enter the value for a: ");
        int a = sc.nextInt();

        System.out.println("Enter the value for b: ");
        int b = sc.nextInt();

        // here we are going to perform Arithmatics operation.
        // in which include assignment operations also.
        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = a / b;

        System.out.println("Addition: "+c);
        System.out.println("Subtraction: "+d);
        System.out.println("Multiplication: "+e);
        System.out.println("Division: "+f);

        // comarison operation.
        if (a < b) {
            System.out.println("Maximum value: "+b);
        }
        if (a != b) {
            System.out.println("a is not equal to b.");
        }

        // this is the logical opeartion
        if(a < 10 && b > 10) {
            System.out.println("hello");
        }

        // Unary operators
        ++a;
        --b;
        System.out.println("++a: "+a+ ", --b: "+ b);
    }
}