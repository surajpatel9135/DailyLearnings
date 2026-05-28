/*

# BitWise Operator:- 
--> bitwise operator are symbols that manipulate data at the most granular level.
--> directly at the individual 0s and 1s (bits) of binary number.
--> these are:-
    --> & (AND operator).
    --> | (OR Operator).
    --> ^ (XOR Operator).
    --> ~ (NOT Operator).
    --> << (Left-shift Operator).
    --> >> (Right-shift Operator).

    */

public class BitWiseOperator{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // AND (&) Operator
        int AND = a & b; // 10 -> 01010 and 20 -> 10100
        
        /*
             01010
           & 10100
           ___________
             00000
            
            So the answer of a & b => 0.

        */

        System.out.println(AND); // Output - 0

        int OR = a | b;
        /*
            a = 10 -> 01010
            b = 20 -> 10100

            a | b =>  11110 => 16 + 8 + 4 + 2 => 30

            so the answer of a | b => 30
        */
        System.out.println(OR);// Output - 30

        int XOR = a ^ b;
        /*
        a = 10 => 01010
        b = 20 => 10100
        XOR   =>  11110 => 30
        */
        System.out.println(XOR);// Output - 30

        int l = a << 2;// 40
        int r = b >> 2;// 5

        System.out.println("l: "l+ " r: "+r);
    }
}