/*

--> Data types in java:
it is mainly two types:

--> Java has eight built-in primitive data types. 
--> They hold simple values directly in memory and always have a fixed size.

--> primitive data types:
1. Byte:- 1 byte (8 bits)  -128 to 127(255).
2. short:- 2 bytes (16 bits) -32768 to 32767.
3. int:- 4 bytes (32 bits)  -2,147,483,648 to 2,147,483,647.
4. float:- 4 bytes (32 bits) Upto 6 to 7 decimal digits.
5. long:- 8 bytes (64 bits)  -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
6. double:- 8 bytes (64 bits) upto 15 decimal digits.
7. boolean:- 1 bit    true or false.
8. char:- 2 bytes (16 bits)   single characters or letters (like 'a', '$') or 0 to 65,535.

2. non-primitive data types:
--> Non-primitive data types are also called Reference Types. 
--> They do not store the actual values directly. 
--> Instead, they store a memory reference (an address) that points to where the data lives.
--> These types do not have a fixed size or a strict numeric range.

1. String
2. arrays
3. classes

*/

// let's learn practically

public class DataTypes {
    public static void main(String[] args) {
        
        // here we declare variale type of int.
        int a = 10;

        // declare byte
        byte b = 125;

        // float 
        float f = 123.543;

        // character
        char ch = 's';

        // long
        long l = 1234567890;

        // double
        double d = 12345.7654321;

        // non-primitive 
        int[] arr = new int[5]; // we declare arr type of int and it's length is 5.

        // String declaration
        String s = "Suraj Kumar";
        
    }
}