/*
All methods of string:-
1. for length/Emptiness:-
-> isEmpty() :- it used to check string is empty or not.

-> length() :- it is used for find the length of string.

-> isBlank() :- it is used to check if a string has only white space then it will be true otherwise false.

2. for searching:-
-> contains() :- it is used to search if target string present in main string.
-> indexOf() :- it is used to find the index of a particular character in string.
-> lastIndexOf() :- it is used to last index of a char or string.
-> startsWith() :- it is used to chech if the string sart with a specific string or character.
-> endsWith() :- this method is used for a string end with a particular string or character.

3. for Conversion:-
-> valueOf() :- valueOf() is a static method available on wrapper classes (like Integer, Double, Boolean) and the String class. It is primarily used for type conversion.
getBytes() :- The getBytes() method is primarily used in Java to encode a string into a sequence of bytes. It breaks down text into raw binary data, which is necessary for tasks like saving data to files, transmitting information over a network, or encrypting sensitive values.

4. for comparison:-
-> equals() :- it is used to compare two strings.
-> equalsIgnoreCase():- it is used to compare two string but withou case sensitive.
-> compareTo() :- sorting string alphabetically.

5. Extraction/Transformation:-
-> subString() :- The substring() method is used in Java to extract a specific smaller portion of a string.
-> toUpperCase() :- this method is use to convert lower case string to upper case.
-> toLowerCase() :- it is used to convert upper case into lower case.
-> trim() :- this method used to remove the whaite space from both sedes of strings.
-> strip() :- it is used to remove unwanted characters according to unicode.
-> repeat() :- this method is use to repeat a string for a specific number of times.
-> replace() :- Swaps all occurrences of a specific character or sub-string with a new one.
-> replaceAll():- Replaces matching parts of a string using Regular Expressions (Regex).
-> split() :- Breaks a single string apart into an array of smaller strings based on a matching divider pattern (Regex).
-> join() :-  The exact opposite of split(). It joins individual array elements or lists together into one single string, separating them with a custom delimiter.

6. characters access:-
-> charAt() :- this method used find a character using index.
->toCharArray() :- Converts the entire string into an array of characters.

7. Advanced
-> intern() :- Ensures that all identical strings share the exact same memory address in the JVM's String Constant Pool.
-> format() :- Creates a formatted string using specialized placeholders (like %s for text or %d for numbers).

*/
import java.util.Arrays;
public class AllStringMethods {
    public static void main(String[] args) {
        String s1 = new String("Suraj");
        String s2 = new String("ur");

        // lenght and emptiness
        System.out.println(s1.length());  // 5
        System.out.println(s1.isEmpty()); // flase
        System.out.println(s1.isBlank()); // false


        // for searching
        System.out.println(s1.contains(s2)); // true
        System.out.println(s1.indexOf("u")); // 1
        System.out.println(s1.lastIndexOf("u")); // 1
        System.out.println(s1.startsWith("Su")); // true
        System.out.println(s1.endsWith("raj")); // true
        

        // conversion
        Integer I = Integer.valueOf("123"); 
        System.out.println(I); // 123
        System.out.println(Arrays.toString(s1.getBytes())); // [83, 117, 114, 97, 106]


        // comparison
        System.out.println(s1.equals("Suraj")); // true
        System.out.println(s1.equalsIgnoreCase("SURAJ")); // true

        // Extraction/Transformation
        System.out.println(s1.substring(0, 3)); // Sur
        System.out.println(s1.toUpperCase());  // SURAJ
        System.out.println(s1.toLowerCase());  // suraj

        String s3 = "   Suraj   ";
        System.out.println(s3.trim());  // suraj
        
        String s4 = "   Suraj   ";
        System.out.println(s4.strip());  // suraj
        
        
    }
}       