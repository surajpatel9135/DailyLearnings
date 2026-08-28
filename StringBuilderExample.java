/*
StringBuilder:-
-> it is use to manipulate the string like update, Insert, delete, append etc.
-> StringBuilder is use to make string mutable.
-> StrignBuilder is not thread safe.
-> StringBuilder more faster then StringBuffer.
-> StringBuilder is not override equals() method.
-> StringBuilder automatically increase the size of array when array is fulled. initial it holds 16 characters.
-> it increased by [old capacity * 2 + 2].

StringBuilder sb = new StringBuilder("qwerghjmn") // 16 (capacity).
sb.append("fghjklbnm"); // here it cross the initial capacity so here it is increased to 34.

-> StringBuilder has several methods:-
1. append() :- it is use to add string at the end.
2. insert() :- it is use to insert string or character at an index.
3. delete() :- it is use to delete the string to a specific index.
4. replace() :- it is use to replace a charater from another new character using index.
5. charAt() :- it is use to grab a character from an index.
6. reverse() :- it is use to reverse the string.
7. setCharAt() :- use to set a character to a specific index.
8. lenght() :- use for gets string length.
9. capacity() :- capacity represents the total amount of memory space allocated for that string object
10. ensureCapacity() :- using this method we set the minimum amount of memory space for allocation.
11. trimToSize() :- it is use to release unused memory spaces.

*/

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        // append()
        sb.append("Suraj");
        System.out.println(sb); // Suraj

        // insert()
        sb.insert(5, "  Kumar");
        System.out.println(sb); // Suraj  Kumar

        // delete()
        sb.delete(5, 6);
        System.out.println(sb); // Suraj Kumar

        sb.deleteCharAt(5);
        System.out.println(sb); // SurajKumar

        sb.setCharAt(5, ' ');
        System.out.println(sb); // Suraj umar

        sb.replace(5, 10, "Patel");
        System.out.println(sb); // SurajPatel

        // reverse()
        sb.reverse();
        System.out.println(sb); // letaPjarus

        System.out.println(sb.capacity());

        sb.append("Kumar 23123");
        System.out.println(sb.capacity()); 

        sb.ensureCapacity(100);
        System.out.println(sb.capacity());

        sb.trimToSize();
        System.out.println(sb.capacity());

    }
}